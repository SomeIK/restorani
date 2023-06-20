DROP DATABASE IF EXISTS `restorani`;
CREATE DATABASE `restorani`   DEFAULT CHARACTER SET utf8mb4   COLLATE  utf8mb4_sl_0900_ai_ci;

USE `restorani`;

DROP TABLE IF EXISTS administrator;

CREATE TABLE administrator(
id BIGINT NOT NULL AUTO_INCREMENT PRIMARY KEY,
email  VARCHAR (50) UNIQUE NOT NULL ,
sifra VARCHAR (50) NOT  NULL);

DROP TABLE IF EXISTS restoran;

CREATE TABLE restoran(
restoranId BIGINT NOT NULL AUTO_INCREMENT PRIMARY KEY,
ime VARCHAR (50) NOT NULL,
adresa VARCHAR(50)NOT NULL);

DROP TABLE IF EXISTS konobar;

CREATE TABLE konobar(
konobarId BIGINT AUTO_INCREMENT NOT NULL PRIMARY KEY,
ime VARCHAR(20) NOT  NULL,
prezime VARCHAR (20),
restoranID BIGINT NOT NULL,
CONSTRAINT `fk_konobar_restoran`  FOREIGN KEY  (`restoranId`) REFERENCES `restoran` ( `restoranId`) ON DELETE RESTRICT ON UPDATE CASCADE);


INSERT INTO `administrator` VALUES
 ( 'ana@anic','1234'),
 ('jova@jovic','0000');
 
 INSERT INTO `restoran` VALUES
 (0,'GAleb','Jove Ilica'),
 (0,'Dan','Ive Andrica');
 
 INSERT INTO `konobar` VALUES
 (0,'Sanja','Savic',1),
 ( 0, 'Aca','Acic',2);
 

