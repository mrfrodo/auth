# My Spring Boot Authorization Server

### Identity Provider (IDP) with H2 In-Memory Database

This project is a **Spring Boot Authorization Server** implementing OAuth2 and OpenID Connect.  
It uses an **H2 in-memory database** to store users and clients for development and testing purposes.  
On startup, the server preloads:

- ~100 users
- Multiple clients (applications and machines)

---

### H2 In-Memory Database

- The Authorization Server preloads sample users and clients on startup for testing purposes.
- H2 Console is enabled for development and debugging: access it at `/h2-console`.
- Spring Boot Data JDBC provides an abstraction layer over H2 for database operations.
---



- The Authorization Server preloads sample users and clients on startup.
- H2 Console (for development/testing)
---

## Project Structure

| Folder             | Description                                              |
|-------------------|----------------------------------------------------------|
| `domain/`          | Pure domain objects (entities, value objects, domain services) |
| `application/`     | Ports (inbound/outbound) and use case services          |
| `infrastructure/`  | Adapters: persistence (in-memory), web (REST controllers), and configuration for Spring Authorization Server |

---