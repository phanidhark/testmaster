CREATE DATABASE `testmaster` /*!40100 DEFAULT CHARACTER SET utf8 */;
CREATE TABLE users (
  USERNAME varchar(60) NOT NULL,
  PASSWORD varchar(60) NOT NULL,
  FIRST_NAME varchar(30) NOT NULL,
  LAST_NAME varchar(30) NOT NULL,
  EMAIL varchar(60) NOT NULL,
  MOBILE varchar(10) DEFAULT NULL,
  enabled tinyint(4) NOT NULL DEFAULT '1', 
  Created_Date datetime DEFAULT CURRENT_TIMESTAMP,
  Last_Access_Date datetime DEFAULT NULL,
  PRIMARY KEY (USERNAME));
CREATE TABLE user_roles (
  user_role_id INT(11) NOT NULL AUTO_INCREMENT,
  username VARCHAR(45) NOT NULL,
  ROLE VARCHAR(45) NOT NULL,
  PRIMARY KEY (user_role_id),
  UNIQUE KEY uni_username_role (ROLE,username),
  KEY fk_username_idx (username),
  CONSTRAINT fk_username FOREIGN KEY (username) REFERENCES users (username));


