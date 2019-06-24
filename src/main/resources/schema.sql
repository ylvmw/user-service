DROP TABLE IF EXISTS user_info;

CREATE TABLE user_info (
  id        VARCHAR(100) PRIMARY KEY NOT NULL,
  name      TEXT NOT NULL,
  gender    TEXT,
  email     TEXT,
  phone     TEXT);