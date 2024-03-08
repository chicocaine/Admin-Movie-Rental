-- Drop the database if it exists
DROP DATABASE IF EXISTS Cinematique;

-- Create the database with utf8mb4 character set
CREATE DATABASE Cinematique CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;

-- Switch to the Cinematique database
USE Cinematique;

-- Create Users table for authentication
CREATE TABLE Users (
                       userId INT PRIMARY KEY AUTO_INCREMENT,
                       username VARCHAR(255) NOT NULL,
                       password VARCHAR(255) NOT NULL
);

-- Create Customers table
CREATE TABLE Customers (
                           customerId INT PRIMARY KEY AUTO_INCREMENT,
                           userId INT,
                           firstName VARCHAR(255) NOT NULL,
                           lastName VARCHAR(255) NOT NULL,
                           contactNumber VARCHAR(20),
                           email VARCHAR(255) NOT NULL,
                           address VARCHAR(255),
                           FOREIGN KEY (userId) REFERENCES Users(userId)
);

-- Create Movies table
CREATE TABLE Movies (
                        movieId INT(6) ZEROFILL AUTO_INCREMENT PRIMARY KEY, -- The format of primary key should be 6 digits (000001, 000002,... 003893)
                        title VARCHAR(255) NOT NULL,
                        cast TEXT,
                        genre VARCHAR(255),
                        duration INT,
                        ageRating VARCHAR(10),
                        description TEXT,
                        image VARCHAR(255),
                        price DOUBLE,
                        year INT,
                        averageRating DOUBLE DEFAULT 0.0,
                        totalRatings INT DEFAULT 0,
                        available BOOLEAN DEFAULT true, -- New column for availability status
                        stockQuantity INT DEFAULT 1 -- New column for stock quantity
);

-- Create Rentals table
CREATE TABLE Rentals (
                         rentalId INT PRIMARY KEY AUTO_INCREMENT,
                         customerId INT,
                         movieId INT,
                         rentalDate DATE,
                         returnDate DATE,
                         rentalFee DOUBLE,
                         FOREIGN KEY (customerId) REFERENCES Customers(customerId),
                         FOREIGN KEY (movieId) REFERENCES Movies(movieId)
);
