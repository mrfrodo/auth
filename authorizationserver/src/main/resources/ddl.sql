-- ========================================
-- Users table
-- ========================================
CREATE TABLE IF NOT EXISTS users (
    id UUID PRIMARY KEY,
    username VARCHAR(50) NOT NULL UNIQUE,
    password VARCHAR(255) NOT NULL,
    role VARCHAR(50) NOT NULL
);

-- ========================================
-- Clients table
-- ========================================
CREATE TABLE IF NOT EXISTS clients (
    id UUID PRIMARY KEY,
    client_id VARCHAR(50) NOT NULL UNIQUE,
    client_secret VARCHAR(255) NOT NULL,
    scopes VARCHAR(255),
    authorized_grant_types VARCHAR(255)
);