CREATE DATABASE `testmaster` /*!40100 DEFAULT CHARACTER SET utf8 */;
CREATE  TABLE users (
  USERNAME VARCHAR(45) NOT NULL ,
  PASSWORD VARCHAR(60) NOT NULL ,
  FIRST_NAME VARCHAR(30) NOT NULL ,
  LAST_NAME VARCHAR(30) NOT NULL ,
  EMAIL VARCHAR(60) NOT NULL ,
  MOBILE VARCHAR(10),
  enabled TINYINT NOT NULL DEFAULT 1 ,
  PRIMARY KEY (username));
 
CREATE TABLE user_roles (
  user_role_id INT(11) NOT NULL AUTO_INCREMENT,
  username VARCHAR(45) NOT NULL,
  ROLE VARCHAR(45) NOT NULL,
  PRIMARY KEY (user_role_id),
  UNIQUE KEY uni_username_role (ROLE,username),
  KEY fk_username_idx (username),
  CONSTRAINT fk_username FOREIGN KEY (username) REFERENCES users (username));


