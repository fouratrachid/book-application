package com.fourat.book.security;


import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;

@Service
@RequiredArgsConstructor
public class JwtFilter extends OncePerRequestFilter {
    final private  JwtService   jwtService ;
    private final UserDetailsServiceImpl userDetailsServiceImpl;


    @Override
    protected void doFilterInternal(
            @NonNull
            HttpServletRequest request, @NonNull HttpServletResponse response, @NonNull FilterChain filterChain) throws ServletException, IOException {
        if (request.getRequestURI().startsWith("/api/v1/auth")) {
            filterChain.doFilter(request, response);
            return;
        }
        String authorizationHeader = request.getHeader("Authorization");
        final String jwtToken;
        final String userEmail;
        if ( authorizationHeader ==null || !authorizationHeader.startsWith("Bearer ")) {
            filterChain.doFilter(request, response);
            return;
        }

        jwtToken = authorizationHeader.substring(7);
        userEmail = jwtService.extractUsername(jwtToken);
        if (userEmail == null) {
            filterChain.doFilter(request, response);
            return;
        }
        UserDetails userDetails = userDetailsServiceImpl.loadUserByUsername(userEmail);
        UsernamePasswordAuthenticationToken usernamePasswordAuthenticationToken = new UsernamePasswordAuthenticationToken(userDetails, null, userDetails.getAuthorities());
        SecurityContextHolder.getContext().setAuthentication(usernamePasswordAuthenticationToken);
        filterChain.doFilter(request, response);

    }
}
