-- ========================================
-- Users (15) - Tolkien-inspired good characters
-- ========================================
INSERT INTO users (id, username, password, role) VALUES
  (RANDOM_UUID(), 'Bilbo', 'password1', 'USER'),
  (RANDOM_UUID(), 'Frodo', 'password2', 'USER'),
  (RANDOM_UUID(), 'Gandalf', 'password3', 'USER'),
  (RANDOM_UUID(), 'Samwise', 'password4', 'USER'),
  (RANDOM_UUID(), 'Aragorn', 'password5', 'USER'),
  (RANDOM_UUID(), 'Legolas', 'password6', 'USER'),
  (RANDOM_UUID(), 'Gimli', 'password7', 'USER'),
  (RANDOM_UUID(), 'Elrond', 'password8', 'USER'),
  (RANDOM_UUID(), 'Galadriel', 'password9', 'USER'),
  (RANDOM_UUID(), 'Thorin', 'password10', 'USER'),
  (RANDOM_UUID(), 'Balin', 'password11', 'USER'),
  (RANDOM_UUID(), 'Fili', 'password12', 'USER'),
  (RANDOM_UUID(), 'Kili', 'password13', 'USER'),
  (RANDOM_UUID(), 'Bard', 'password14', 'USER'),
  (RANDOM_UUID(), 'Beorn', 'password15', 'USER');

-- ========================================
-- Clients (5) - plain secrets
-- ========================================
INSERT INTO clients (id, client_id, client_secret, scopes, authorized_grant_types) VALUES
  (RANDOM_UUID(), 'ShireApp', 'secret1', 'read,write', 'password,refresh_token'),
  (RANDOM_UUID(), 'RivendellTool', 'secret2', 'read,write', 'password,refresh_token'),
  (RANDOM_UUID(), 'LothlorienService', 'secret3', 'read,write', 'password,refresh_token'),
  (RANDOM_UUID(), 'GondorAPI', 'secret4', 'read,write', 'password,refresh_token'),
  (RANDOM_UUID(), 'EreborApp', 'secret5', 'read,write', 'password,refresh_token');
