# Spring Boot Authorization Server (Multi-Module)

This is a **multi-module Spring Boot project** implementing an **OAuth2 / OpenID Connect Authorization Server** (IDP) with optional Resource Server and client app modules.  
It uses an **H2 in-memory database** for users and clients for development/testing.

---

## Project Modules

| Module               | Description                                              |
|----------------------|----------------------------------------------------------|
| `authorizationserver` | The Authorization Server (IDP). Issues JWTs for clients and users. |
| `resourceserver`     | Optional Resource Server hosting protected APIs.        |
| `clientapp`          | Example client application requesting tokens from the AS. |


---

## How It Works

Three core components of an OAuth2 / OpenID Connect architecture:

1. **Authorization Server (AS)**: Issues JWT tokens to clients.
2. **Resource Server (RS)**: Hosts protected APIs.
3. **Client**: Web app, machine, or script requesting tokens from the AS using a grant type:

- `password` – user login flow
- `client_credentials` – machine-to-machine flow
- `authorization_code` – web login flow

The Resource Server then validates the token to authorize access.

---



## Example OAuth2 Flows
### Client Credentials (machine-to-machine)
POST /oauth2/token
Content-Type: application/x-www-form-urlencoded

grant_type=client_credentials&client_id=machine&client_secret=secret

### Password (user login)
POST /oauth2/token
Content-Type: application/x-www-form-urlencoded

grant_type=password&username=frodo&password=password123&client_id=webapp&client_secret=secret
