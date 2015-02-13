INSERT INTO users(username,password,enabled)
VALUES ('phanidhar','phanidhar', TRUE);
INSERT INTO users(username,password,enabled)
VALUES ('leela','leela', TRUE);

INSERT INTO user_roles (username, ROLE)
VALUES ('phanidhar', 'ROLE_USER');
INSERT INTO user_roles (username, ROLE)
VALUES ('phanidhar', 'ROLE_ADMIN');
INSERT INTO user_roles (username, ROLE)
VALUES ('leela', 'ROLE_USER');