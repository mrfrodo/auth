# My Client App

This is a sample client application that requests access tokens from the **Authorization Server** and uses them to call the protected **Resource Server** APIs.

- The client can be a web app, CLI tool, or machine-to-machine script.
- It requests a JWT from the Authorization Server using an OAuth2 grant (e.g., `client_credentials` or `authorization_code`).
- Once it has a valid token, it includes it in the `Authorization` header when calling the Resource Server.

---

### Example: Client Credentials Flow

```bash
# Request an access token from the Authorization Server
curl -X POST http://localhost:9000/oauth2/token \
  -u "client-id:client-secret" \
  -d "grant_type=client_credentials&scope=read"

# Response contains the JWT
{
  "access_token": "eyJhbGciOiJSUzI1NiIsInR5cCI6IkpXVCJ9...",
  "token_type": "Bearer",
  "expires_in": 3600
}

# Call the protected Resource Server API with the token
curl -H "Authorization: Bearer <ACCESS_TOKEN>" http://localhost:8081/api/orders
```
---
This client consists of pure Java POJOs with a simple GUI built on JavaFX.  
It accesses protected resources on the Resource Server (RS) and obtains the required access token from the Authorization Server (AS).
