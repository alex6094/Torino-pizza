-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Nov 21, 2023 at 12:15 PM
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
-- Table structure for table `kunde`
--

CREATE TABLE `kunde` (
  `KundeID` int(11) NOT NULL,
  `Navn` varchar(255) DEFAULT NULL,
  `Email` varchar(255) DEFAULT NULL,
  `Password` varchar(255) DEFAULT NULL,
  `Adresse` varchar(255) DEFAULT NULL,
  `Telefon` varchar(20) DEFAULT NULL,
  `Postnummer` varchar(4) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `kunde`
--

INSERT INTO `kunde` (`KundeID`, `Navn`, `Email`, `Password`, `Adresse`, `Telefon`, `Postnummer`) VALUES
(1, 'John Doe', 'john.doe@email.com', 'password123', 'Hovedgade 1, 1000 City', '12 34 56 78', '1000'),
(2, 'Jane Smith', 'jane.smith@email.com', 'securepass', 'Bakkevej 2, 2000 Town', '98 76 54 32', '2000'),
(3, 'Bob Johnson', 'bob.johnson@email.com', 'pass123', 'Ågade 3, 3000 Village', '55 78 90 12', '3000'),
(4, 'Alice Miller', 'alice.miller@email.com', 'mypass', 'Ellevej 4, 4000 Hamlet', '55 32 16 54', '4000'),
(5, 'Michael Brown', 'michael.brown@email.com', 'brownpass', 'Egevej 5, 5000 Village', '55 44 77 77', '5000'),
(6, 'Emily White', 'emily.white@email.com', 'emilypass', 'Fyrrestien 6, 6000 City', '55 11 33 33', '6000'),
(7, 'Daniel Lee', 'daniel.lee@email.com', 'danpass', 'Granvej 7, 7000 Town', '55 66 99 99', '7000'),
(8, 'Olivia Taylor', 'olivia.taylor@email.com', 'oliviapass', 'Hasselvej 8, 8000 Village', '55 22 44 88', '8000'),
(9, 'David Garcia', 'david.garcia@email.com', 'davidpass', 'Irisvej 9, 9000 Hamlet', '55 99 77 55', '9000'),
(10, 'Sophia Martin', 'sophia.martin@email.com', 'sophiapass', 'Jupitervej 10, 10000 City', '55 33 88 22', '1000'),
(11, 'Liam Wilson', 'liam.wilson@email.com', 'liampass', 'Kirsebærvej 11, 1100 Town', '55 77 66 11', '1100'),
(12, 'Emma Davis', 'emma.davis@email.com', 'emmapass', 'Lønvej 12, 1200 Village', '55 44 33 66', '1200'),
(13, 'Noah Taylor', 'noah.taylor@email.com', 'noahpass', 'Magnolievej 13, 1300 Hamlet', '55 77 66 44', '1300'),
(14, 'Olivia Harris', 'olivia.harris@email.com', 'oliviapass', 'Nøddevej 14, 1400 Village', '55 33 22 11', '1400'),
(15, 'Lucas Brown', 'lucas.brown@email.com', 'lucaspass', 'Orkidévej 15, 1500 City', '55 66 11 22', '1500'),
(16, 'Ava Johnson', 'ava.johnson@email.com', 'avapass', 'Pærevej 16, 1600 Town', '55 11 44 55', '1600'),
(17, 'Mia Martinez', 'mia.martinez@email.com', 'miapass', 'Quintana Roo 17, 1700 Village', '55 33 77 88', '1700'),
(18, 'Liam Davis', 'liam.davis@email.com', 'liampass', 'Rosenvej 18, 1800 Hamlet', '55 22 66 33', '1800'),
(19, 'Emma Garcia', 'emma.garcia@email.com', 'emmapass', 'Solvang 19, 1900 City', '55 88 77 66', '1900'),
(20, 'Noah Wilson', 'noah.wilson@email.com', 'noahpass', 'Trævej 20, 2000 Town', '55 33 88 11', '2000'),
(21, 'Ava Smith', 'ava.smith@email.com', 'avapass', 'Uglevej 21, 2100 Village', '55 77 11 22', '2100'),
(22, 'Mia White', 'mia.white@email.com', 'miapass', 'Vandtårnsvej 22, 2200 Hamlet', '55 11 33 44', '2200'),
(23, 'Lucas Taylor', 'lucas.taylor@email.com', 'lucaspass', 'Villa Rosa 23, 2300 City', '55 44 22 88', '2300'),
(24, 'Olivia Harris', 'olivia.harris@email.com', 'oliviapass', 'Vintervej 24, 2400 Village', '55 88 77 33', '2400'),
(25, 'Emma Brown', 'emma.brown@email.com', 'emmapass', 'Vesterbro 25, 2500 Town', '55 33 88 44', '2500'),
(26, 'Sophie Walker', 'sophie.walker@email.com', 'sophiepass', 'Skovvej 26, 2600 Town', '55 77 88 99', '2600'),
(27, 'Jack Harris', 'jack.harris@email.com', 'jackpass', 'Søvej 27, 2700 Village', '55 11 22 33', '2700'),
(28, 'Lily Wilson', 'lily.wilson@email.com', 'lilypass', 'Strandvej 28, 2800 Hamlet', '55 44 55 66', '2800'),
(29, 'Charlie Davis', 'charlie.davis@email.com', 'charliepass', 'Skolevej 29, 2900 City', '55 66 77 88', '2900'),
(30, 'Mia Taylor', 'mia.taylor@email.com', 'miapass', 'Mosevej 30, 3000 Town', '55 99 88 77', '3000'),
(31, 'Noah Smith', 'noah.smith@email.com', 'noahpass', 'Markvej 31, 3100 Village', '55 22 11 33', '3100'),
(32, 'Olivia Brown', 'olivia.brown@email.com', 'oliviapass', 'Landevej 32, 3200 Hamlet', '55 33 44 55', '3200'),
(33, 'Liam Garcia', 'liam.garcia@email.com', 'liampass', 'Kirkevej 33, 3300 City', '55 66 77 88', '3300'),
(34, 'Emma Martin', 'emma.martin@email.com', 'emmapass', 'Højvej 34, 3400 Town', '55 88 99 11', '3400'),
(35, 'Lucas Lee', 'lucas.lee@email.com', 'lucaspass', 'Grønvej 35, 3500 Village', '55 11 22 33', '3500'),
(36, 'Ava Wilson', 'ava.wilson@email.com', 'avapass', 'Fiskervej 36, 3600 Hamlet', '55 33 44 55', '3600'),
(37, 'Mia Harris', 'mia.harris@email.com', 'miapass', 'Esplanaden 37, 3700 City', '55 66 77 88', '3700'),
(38, 'Liam White', 'liam.white@email.com', 'liampass', 'Dyrehavevej 38, 3800 Town', '55 88 99 11', '3800'),
(39, 'Olivia Taylor', 'olivia.taylor@email.com', 'oliviapass', 'Cirkelvej 39, 3900 Village', '55 11 22 33', '3900'),
(40, 'Emma Johnson', 'emma.johnson@email.com', 'emmapass', 'Bredgade 40, 4000 Hamlet', '55 33 44 55', '4000'),
(41, 'Noah Davis', 'noah.davis@email.com', 'noahpass', 'Aaboulevard 41, 4100 City', '55 66 77 88', '4100'),
(42, 'Sophia Smith', 'sophia.smith@email.com', 'sophiapass', 'Vesterbrogade 42, 4200 Town', '55 88 99 11', '4200'),
(43, 'Oliver Garcia', 'oliver.garcia@email.com', 'oliverpass', 'Østerbrogade 43, 4300 Village', '55 11 22 33', '4300'),
(44, 'Ava Wilson', 'ava.wilson@email.com', 'avapass', 'Nørrebrogade 44, 4400 Hamlet', '55 33 44 55', '4400'),
(45, 'Mia Lee', 'mia.lee@email.com', 'miapass', 'Søndergade 45, 4500 City', '55 66 77 88', '4500'),
(46, 'Liam Harris', 'liam.harris@email.com', 'liampass', 'Algade 46, 4600 Town', '55 88 99 11', '4600'),
(47, 'Emma White', 'emma.white@email.com', 'emmapass', 'Hovedgaden 47, 4700 Village', '55 11 22 33', '4700'),
(48, 'Noah Taylor', 'noah.taylor@email.com', 'noahpass', 'Strandgade 48, 4800 Hamlet', '55 33 44 55', '4800'),
(49, 'Olivia Martin', 'olivia.martin@email.com', 'oliviapass', 'Langelinie 49, 4900 City', '55 66 77 88', '4900'),
(50, 'Sophia Brown', 'sophia.brown@email.com', 'sophiapass', 'Vejlevej 50, 5000 Town', '55 77 88 99', '5000'),
(51, 'Jack Wilson', 'jack.wilson@email.com', 'jackpass', 'Skovvej 51, 5100 City', '55 77 88 99', '5100'),
(52, 'Sophia Davis', 'sophia.davis@email.com', 'sophiapass', 'Søvej 52, 5200 Town', '55 11 22 33', '5200'),
(53, 'Oliver White', 'oliver.white@email.com', 'oliverpass', 'Strandvej 53, 5300 Village', '55 44 55 66', '5300'),
(54, 'Lily Taylor', 'lily.taylor@email.com', 'lilypass', 'Skolevej 54, 5400 Hamlet', '55 66 77 88', '5400'),
(55, 'Charlie Garcia', 'charlie.garcia@email.com', 'charliepass', 'Mosevej 55, 5500 City', '55 99 88 77', '5500'),
(56, 'Mia Martin', 'mia.martin@email.com', 'miapass', 'Markvej 56, 5600 Town', '55 22 11 33', '5600'),
(57, 'Noah Smith', 'noah.smith@email.com', 'noahpass', 'Landevej 57, 5700 Village', '55 33 44 55', '5700'),
(58, 'Emma Brown', 'emma.brown@email.com', 'emmapass', 'Kirkevej 58, 5800 Hamlet', '55 66 77 88', '5800'),
(59, 'Lucas Taylor', 'lucas.taylor@email.com', 'lucaspass', 'Højvej 59, 5900 City', '55 88 99 11', '5900'),
(60, 'Ava Lee', 'ava.lee@email.com', 'avapass', 'Grønvej 60, 6000 Town', '55 11 22 33', '6000'),
(61, 'Olivia Garcia', 'olivia.garcia@email.com', 'oliviapass', 'Fiskervej 61, 6100 Village', '55 33 44 55', '6100'),
(62, 'Liam Smith', 'liam.smith@email.com', 'liampass', 'Esplanaden 62, 6200 Hamlet', '55 66 77 88', '6200'),
(63, 'Emma White', 'emma.white@email.com', 'emmapass', 'Dyrehavevej 63, 6300 City', '55 88 99 11', '6300'),
(64, 'Noah Taylor', 'noah.taylor@email.com', 'noahpass', 'Cirkelvej 64, 6400 Town', '55 11 22 33', '6400'),
(65, 'Sophie Martin', 'sophie.martin@email.com', 'sophiepass', 'Bredgade 65, 6500 Village', '55 33 44 55', '6500'),
(66, 'Jack Davis', 'jack.davis@email.com', 'jackpass', 'Aaboulevard 66, 6600 Hamlet', '55 66 77 88', '6600'),
(67, 'Lily Smith', 'lily.smith@email.com', 'lilypass', 'Vesterbrogade 67, 6700 City', '55 88 99 11', '6700'),
(68, 'Charlie Garcia', 'charlie.garcia@email.com', 'charliepass', 'Østerbrogade 68, 6800 Town', '55 11 22 33', '6800'),
(69, 'Mia Taylor', 'mia.taylor@email.com', 'miapass', 'Nørrebrogade 69, 6900 Village', '55 33 44 55', '6900'),
(70, 'Noah Davis', 'noah.davis@email.com', 'noahpass', 'Strandgade 70, 7000 Hamlet', '55 66 77 88', '7000'),
(71, 'Sophia Smith', 'sophia.smith@email.com', 'sophiapass', 'Søndergade 71, 7100 City', '55 88 99 11', '7100'),
(72, 'Oliver Garcia', 'oliver.garcia@email.com', 'oliverpass', 'Algade 72, 7200 Town', '55 11 22 33', '7200'),
(73, 'Ava Wilson', 'ava.wilson@email.com', 'avapass', 'Hovedgaden 73, 7300 Village', '55 33 44 55', '7300'),
(74, 'Liam Harris', 'liam.harris@email.com', 'liampass', 'Strandvejen 74, 7400 Hamlet', '55 66 77 88', '7400'),
(75, 'Emma White', 'emma.white@email.com', 'emmapass', 'Havnegade 75, 7500 City', '55 88 99 11', '7500'),
(76, 'Olivia Taylor', 'olivia.taylor@email.com', 'oliviapass', 'Banevej 76, 7600 Town', '55 77 88 99', '7600'),
(77, 'Liam Smith', 'liam.smith@email.com', 'liampass', 'Stationsvej 77, 7700 Village', '55 11 22 33', '7700'),
(78, 'Emma Garcia', 'emma.garcia@email.com', 'emmapass', 'Gadekærvej 78, 7800 Hamlet', '55 44 55 66', '7800'),
(79, 'Noah Wilson', 'noah.wilson@email.com', 'noahpass', 'Ådalen 79, 7900 City', '55 66 77 88', '7900'),
(80, 'Sophie Davis', 'sophie.davis@email.com', 'sophiepass', 'Højmarken 80, 8000 Town', '55 99 88 77', '8000'),
(81, 'Jack Wilson', 'jack.wilson@email.com', 'jackpass', 'Gartnervænget 81, 8100 Village', '55 22 11 33', '8100'),
(82, 'Lily Taylor', 'lily.taylor@email.com', 'lilypass', 'Nørregade 82, 8200 Hamlet', '55 33 44 55', '8200'),
(83, 'Charlie Garcia', 'charlie.garcia@email.com', 'charliepass', 'Solsortevej 83, 8300 City', '55 66 77 88', '8300'),
(84, 'Mia Martin', 'mia.martin@email.com', 'miapass', 'Engvej 84, 8400 Town', '55 88 99 11', '8400'),
(85, 'Noah Smith', 'noah.smith@email.com', 'noahpass', 'Brombærvej 85, 8500 Village', '55 11 22 33', '8500'),
(86, 'Sophia Davis', 'sophia.davis@email.com', 'sophiapass', 'Nyvej 86, 8600 Hamlet', '55 33 44 55', '8600'),
(87, 'Oliver White', 'oliver.white@email.com', 'oliverpass', 'Skovvejen 87, 8700 City', '55 66 77 88', '8700'),
(88, 'Lily Taylor', 'lily.taylor@email.com', 'lilypass', 'Guldsmedevej 88, 8800 Town', '55 88 99 11', '8800'),
(89, 'Charlie Garcia', 'charlie.garcia@email.com', 'charliepass', 'Toftevej 89, 8900 Village', '55 11 22 33', '8900'),
(90, 'Mia Martin', 'mia.martin@email.com', 'miapass', 'Elmevej 90, 9000 Hamlet', '55 33 44 55', '9000'),
(91, 'Noah Smith', 'noah.smith@email.com', 'noahpass', 'Rugvænget 91, 9100 City', '55 66 77 88', '9100'),
(92, 'Sophia Davis', 'sophia.davis@email.com', 'sophiapass', 'Højsletten 92, 9200 Town', '55 88 99 11', '9200'),
(93, 'Oliver White', 'oliver.white@email.com', 'oliverpass', 'Kildevej 93, 9300 Village', '55 11 22 33', '9300'),
(94, 'Lily Taylor', 'lily.taylor@email.com', 'lilypass', 'Åbrinken 94, 9400 Hamlet', '55 33 44 55', '9400'),
(95, 'Charlie Garcia', 'charlie.garcia@email.com', 'charliepass', 'Skovkanten 95, 9500 City', '55 66 77 88', '9500'),
(96, 'Mia Martin', 'mia.martin@email.com', 'miapass', 'Bækvej 96, 9600 Town', '55 88 99 11', '9600'),
(97, 'Noah Smith', 'noah.smith@email.com', 'noahpass', 'Birkelunden 97, 9700 Village', '55 11 22 33', '9700'),
(98, 'Sophia Davis', 'sophia.davis@email.com', 'sophiapass', 'Skolevænget 98, 9800 Hamlet', '55 33 44 55', '9800'),
(99, 'Oliver White', 'oliver.white@email.com', 'oliverpass', 'Smedevej 99, 9900 City', '55 66 77 88', '9900'),
(100, 'Lily Taylor', 'lily.taylor@email.com', 'lilypass', 'Havnegade 100, 10000 Town', '55 88 99 11', '1000');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `kunde`
--
ALTER TABLE `kunde`
  ADD PRIMARY KEY (`KundeID`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
