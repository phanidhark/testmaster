INSERT INTO `testmaster`.`users`
(`USERNAME`,
`PASSWORD`,
`FIRST_NAME`,
`LAST_NAME`,
`EMAIL`,
`MOBILE`,
`enabled`)
VALUES
('phanidhar',
'phanidhar',
'Phanidhar',
'Kammara',
'phanidhar.kammara@gmail.com',
'9701144474',
'1');
INSERT INTO `testmaster`.`users`
(`USERNAME`,
`PASSWORD`,
`FIRST_NAME`,
`LAST_NAME`,
`EMAIL`,
`MOBILE`,
`enabled`)
VALUES
('leela',
'leela',
'leela',
'kumar',
'leela.kumar@gmail.com',
'9849098490',
'1');

INSERT INTO user_roles (username, ROLE)
VALUES ('phanidhar', 'ROLE_USER');
INSERT INTO user_roles (username, ROLE)
VALUES ('phanidhar', 'ROLE_ADMIN');
INSERT INTO user_roles (username, ROLE)
VALUES ('leela', 'ROLE_USER');