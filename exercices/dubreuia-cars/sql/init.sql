CREATE DATABASE renault;

USE renault;

CREATE TABLE cars(
    id    INTEGER PRIMARY KEY AUTO_INCREMENT,
    brand VARCHAR(128) NOT NULL,
    model VARCHAR(512) NOT NULL
);
