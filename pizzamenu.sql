-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Nov 21, 2023 at 12:02 PM
-- Server version: 10.4.28-MariaDB
-- PHP Version: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `pizza`
--

-- --------------------------------------------------------

--
-- Table structure for table `pizzamenu`
--

CREATE TABLE `pizzamenu` (
  `PizzaID` int(11) NOT NULL,
  `PizzaNavn` varchar(255) DEFAULT NULL,
  `Toppings` varchar(255) DEFAULT NULL,
  `Pris` decimal(5,2) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `pizzamenu`
--

INSERT INTO `pizzamenu` (`PizzaID`, `PizzaNavn`, `Toppings`, `Pris`) VALUES
(1, 'Margherita', 'Tomat, mozzarella, basilikum', 75.00),
(2, 'Pepperoni Passion', 'Pepperoni, ost, tomatsauce', 85.00),
(3, 'Vegetarisk Deluxe', 'Champignon, løg, peberfrugt, oliven', 80.00),
(4, 'BBQ Chicken', 'Kylling, barbecuesauce, løg', 90.00),
(5, 'Fire Cheese', 'Mozzarella, gedeost, parmesan, cheddar', 95.00),
(6, 'Hawaiian', 'Skinke, ananas, ost', 85.00),
(7, 'Capricciosa', 'Skinke, champignon, artiskok, oliven', 90.00),
(8, 'Quattro Stagioni', 'Skinke, artiskok, oliven, champignon', 95.00),
(9, 'Spinat og Feta', 'Spinat, fetaost, tomatsauce', 80.00),
(10, 'Seafood Special', 'Rejer, blæksprutte, muslinger', 100.00),
(11, 'Mexican Madness', 'Oksekød, jalapeños, løg, salsa', 95.00),
(12, 'Pesto Chicken', 'Kylling, pesto, tomater', 90.00),
(13, 'Primavera', 'Broccoli, squash, cherrytomater', 85.00),
(14, 'Prosciutto e Rucola', 'Parmaskinke, rucola, parmesan', 95.00),
(15, 'Meat Lovers', 'Oksekød, pepperoni, bacon, skinke', 100.00),
(16, 'Buffalo Chicken', 'Kylling, buffalo sauce, blå ost', 90.00),
(17, 'Mushroom Madness', 'Champignon, trøffelolie, ost', 85.00),
(18, 'Mediterranean Delight', 'Fetaost, oliven, soltørrede tomater', 90.00),
(19, 'Blue Cheese Bliss', 'Blå ost, pærer, valnødder', 95.00),
(20, 'Sweet and Spicy', 'Ananas, jalapeños, bacon', 85.00),
(21, 'Provolone Perfection', 'Provolone ost, chorizo, løg', 95.00),
(22, 'Truffle Tremor', 'Trøffelolie, svampe, parmesan', 100.00),
(23, 'Shrimp Scampi Supreme', 'Rejer, hvidløgssmør, persille', 95.00),
(24, 'Caprese Crush', 'Mozzarella, tomater, basilikum, balsamico', 90.00),
(25, 'Greek Goddess', 'Fetaost, agurker, tomater, oliven', 85.00),
(26, 'Chicken Alfredo', 'Kylling, alfredosauce, broccoli', 90.00),
(27, 'Margherita al Pesto', 'Tomat, mozzarella, basilikumpesto', 80.00),
(28, 'Spicy Sausage Sensation', 'Krydret pølse, peberfrugt, løg', 95.00),
(29, 'Vegan Veggie Delight', 'Vegansk ost, grøntsager, tomatsovs', 85.00),
(30, 'Tandoori Temptation', 'Tandoorikylling, løg, koriander', 100.00);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `pizzamenu`
--
ALTER TABLE `pizzamenu`
  ADD PRIMARY KEY (`PizzaID`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
