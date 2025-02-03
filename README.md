# SakuraJava # Laba - Java Spring Application

- **User Registration**  
  Users can register by providing their email, password, first name, and last name. Passwords are securely hashed using BCrypt before being stored in the database.

- **User Authentication**  
  The application provides a login endpoint that authenticates users based on their email and password. Protected endpoints require successful authentication.

- **Task Management**  
  Authenticated users can create, view, update, and delete tasks. Each task is linked to the user who created it, ensuring that users only have access to their own tasks.

- **Security**  
  - Endpoints for registration (`/register`) and login (`/login`) are publicly accessible, while all other endpoints require authentication.
  - Session management is configured with a 30-minute timeout.
  - Logout functionality is available, which terminates the session and redirects users to the login page.
  - The application uses a modern Spring Security configuration with a lambda-based DSL.

- **Database Migrations**  
  Flyway is used to manage database migrations. The initial migration creates the `users` table, and subsequent migrations add additional tables such as `tasks`.



