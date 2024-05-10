# Book Social Network

Welcome to Book Social Network, a full-stack web application that allows users to manage their book collections and interact with a community of book enthusiasts. This project is based on the tutorial series by [Ali Bouali](https://www.youtube.com/@BoualiAli) on [YouTube](https://www.youtube.com/watch?v=WuPa_XoWlJU&t=200s). 

## Overview

Book Social Network provides users with features such as user registration, secure email validation, book management (creation, updating, sharing, and archiving), book borrowing with availability checks, book return functionality, and approval of book returns. The application ensures security using JWT tokens and follows REST API best practices. The backend is built with Spring Boot 3 and Spring Security 6, while the frontend is developed using Angular with Bootstrap for styling.

## Features

- User Registration: Users can register for a new account.
- Email Validation: Accounts are activated using secure email validation codes.
- User Authentication: Existing users can securely log in to their accounts.
- Book Management: Users can create, update, share, and archive their books.
- Book Borrowing: Implements necessary checks to determine if a book is borrowable.
- Book Returning: Users can return borrowed books.
- Book Return Approval: Functionality to approve book returns.

## Technologies Used

### Backend (book-social-network)
- Spring Boot 3
- Spring Security 6
- JWT Token Authentication
- Spring Data JPA
- JSR-303 and Spring Validation
- OpenAPI and Swagger UI Documentation
- Docker
- GitHub Actions
- Keycloak

### Frontend (book-social-network-ui)
- Angular
- Component-Based Architecture
- Lazy Loading
- Authentication Guard
- OpenAPI Generator for Angular
- Bootstrap

## Learning Objectives

- Designing a class diagram from business requirements
- Implementing a mono repo approach
- Securing an application using JWT tokens with Spring Security
- Registering users and validating accounts via email
- Utilizing inheritance with Spring Data JPA
- Implementing the service layer and handling application exceptions
- Object validation using JSR-303 and Spring Validation
- Handling custom exceptions
- Implementing pagination and REST API best practices
- Using Spring Profiles for environment-specific configurations
- Documenting APIs using OpenAPI and Swagger UI
- Implementing business requirements and handling business exceptions
- Dockerizing the infrastructure
- CI/CD pipeline & Deployment

## License

This project is licensed under the Apache License 2.0. See the [LICENSE](https://github.com/fouratrachid/book-application/blob/main/LICENSE) file for details.

<!--
## Getting Started

To get started with the Book Social Network project, follow the setup instructions in the respective directories:

- [Backend Setup Instructions](backend/README.md)
- [Frontend Setup Instructions](frontend/README.md)
-->


## Contributors

- [fouratrachid](https://github.com/fouratrachid) 

## Acknowledgments

Special thanks to Ali Bouali for the tutorial series and to the developers and maintainers of the technologies used in this project. Their hard work and dedication make projects like this possible.
