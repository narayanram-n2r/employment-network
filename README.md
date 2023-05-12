## Job Search Platform

This is a fullstack web application built using Java 17, Maven, Spring Boot, MySQL, and Thymeleaf. It serves as a job searching platform, allowing users to search and apply for available job positions. The job providers can create and post jobs which will be available for users 

The application also implements Spring Security to secure the REST API endpoints, ensuring that only authenticated users can access certain resources.

## Features

-   User registration and authentication: Users can sign up for a new account and log in using their credentials. It can be Job Seeker or Job Provider.
-   Job search: Users can search for available job positions based on various criteria such as location, industry, and keywords.
-   Job application: Authenticated(via email) users can apply for job positions by submitting their application details along with resume and cover letter.
-   User dashboard: Users have access to a personalized dashboard where they can view their job applications, edit their profile, and manage their account settings.
-   Admin panel(Job PRovider): Administrators have access to an admin panel where they can manage job listings, view user applications, and perform administrative tasks.

## Technologies Used

-   Java 17: The programming language used for backend development.
-   Maven: A build automation tool used for dependency management and project build configuration.
-   Spring Boot: A framework used to simplify the development of Java applications, providing a robust foundation for the backend.
-   Spring Data JPA: A tool for simplified data access and manipulation, providing a repository abstraction for working with databases.
-   Lombok: A library that simplifies Java code by reducing boilerplate code for common tasks such as getter/setter methods and constructors.
-   Thymeleaf: A server-side Java template engine used for rendering dynamic HTML pages.
-   Spring Validation: A module that provides support for declarative data validation using annotations.
-   Spring Security: A powerful authentication and access control framework used to secure the REST API endpoints.
-   Spring Web: A module that provides HTTP-based endpoints for building web applications.
-   Spring Mail: A module for sending email messages, used for account verification and notifications.
-   MySQL: A relational database management system used to store application data.
-   MySQL Connector/J: A JDBC driver for connecting to and working with MySQL databases.
-   Spring Test: A module for testing Spring applications, including integration tests and mocking dependencies.

## Prerequisites

Before running the application, ensure that you have the following installed:

-   Java 17 SDK: [Download and install Java 17](https://www.codejava.net/java-se/download-and-install-openjdk-17)
-   Maven: [Download and install Maven](https://maven.apache.org/install.html)
-   MySQL: [Download and install MySQL](https://dev.mysql.com/downloads/)

## Getting Started

1.  Clone the repository:
    `git clone https://github.com/narayanram-n2r/job-search-platform.git`
    
2.  Configure the MySQL database:
    -   Update the `application.properties` file with your database credentials:
        `spring.datasource.url=jdbc:mysql://localhost:3306/<schema-name>`
        `spring.datasource.username=<your-username>`
        `spring.datasource.password=<your-password>`
        
3.  Configure the server port:
    -   Update the `application.properties` file with your server port:
        `server.port: <your-server-port>`
        
4.  Configure the mail server:
    -   Update the `application.properties` file with your server mail address so we validate users:
        `mail.sender.host: <your-mail-server-name>`
        `mail.sender.port: <your-mail-server-port>`
        `mail.user.name: <your-server-mail-id>`
        `mail.user.password: <your-server-mail-password>`
        
5.  Configure the file server:
    -   Update the `application.properties` file with your server file path where you would like to store the user documents:
        `project.location=<your-file-path>`
            
6.  Build the application:
    `mvn clean install`
    
7.  Run the application:
    `mvn spring-boot:run`
    
8.  Access the application:  
    `Open your web browser and navigate to https://localhost:<your-server-port>`

## License

This project is licensed under the [Job Search Platform Read-Only License](https://github.com/narayanram-n2r/job-search-platform/LICENSE).

The Job Search Platform Read-Only License is a modified version of the Apache License 2.0, with the following modification:

1.  You are not allowed to modify the source code of this software. You can only use the software as provided.

All other terms and conditions of the Apache License 2.0 still apply.

## Acknowledgements

This application was developed using various open-source libraries and frameworks. Special thanks to the developers of the following projects:

-   [Java](https://openjdk.org/)
-   [Spring](https://spring.io/projects/)
-   [Thymeleaf](https://www.thymeleaf.org/)
-   [MySQL](https://www.mysql.com/)
-   [Maven](https://maven.apache.org/)

## Contributing

Contributions are welcome! If you would like to contribute to this project, please follow these steps:

1.  Fork the repository.
2.  Create a new branch for your feature or bug fix.
3.  Make your changes.
4.  Commit your changes and push your branch to your forked repository.
5.  Submit a pull request detailing your changes.

## Creating an Issue

To create a new issue, follow these steps:

1.  Go to the [Issues tab](https://github.com/narayanram-n2r/job-search-platform/issues) on the project's GitHub repository.
2.  Click on the **New issue** button.
3.  Provide a descriptive and concise title for the issue.
4.  Write a detailed description of the issue, including any relevant information such as steps to reproduce, expected behavior, and actual behavior.
5.  If applicable, provide any additional context, such as error messages or screenshots, to help with understanding and resolving the issue.
6.  Add appropriate labels to categorize the issue, such as "bug", "enhancement", or "help wanted".
7.  Assign the issue to the relevant project member or leave it unassigned if not applicable.
8.  If desired, mention any specific due dates or milestones related to the issue.
9.  Click on the **Submit new issue** button to create the issue.

## Issue Management

Once an issue is created, the project team will review it and provide updates as necessary. Here are a few things to keep in mind:

-   You can monitor the progress of your issue through the issue tracker.
-   Feel free to participate in any discussions related to the issue by adding comments to provide additional information or ask questions.
-   If you discover new information or find a solution, please update the issue with your findings.
-   Be respectful and constructive when communicating with others on the issue.

## Getting Help

If you have any questions or need further assistance, you can:

-   Leave a comment on the relevant issue.
-   Reach out to the project team members directly via email or other communication channels mentioned in the project documentation.
-   Check the project's documentation or README for additional resources or contact information.

Thank you for your contribution to Project Name! We appreciate your feedback and assistance in improving the project.

## Contact

For any inquiries or support, please contact [narayanramn2r@gmail.com](mailto:narayanramn2r@gmail.com).