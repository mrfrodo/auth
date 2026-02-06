# My Protected API

This is a Spring Boot application that serves protected resources (APIs).  
It acts as a **Resource Server**, meaning it **validates JWT access tokens** issued by the Authorization Server before allowing access to its endpoints.

- Public endpoints (e.g., `/public/**`) are open to everyone.
- Protected endpoints (e.g., `/api/**`) require a valid JWT.
- The JWT is issued by a Authorization Server and verified automatically by Spring Security.

---