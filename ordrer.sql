-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Nov 21, 2023 at 12:58 PM
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
-- Table structure for table `ordrer`
--

CREATE TABLE `ordrer` (
  `ID` int(11) NOT NULL,
  `KundeID` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `ordrer`
--

INSERT INTO `ordrer` (`ID`, `KundeID`) VALUES
(1001, 1),
(1002, 2),
(1003, 3),
(1004, 4),
(1005, 5),
(1006, 6),
(1007, 7),
(1008, 8),
(1009, 9),
(1010, 10),
(1011, 11),
(1012, 12),
(1013, 13),
(1014, 14),
(1015, 15),
(1016, 16),
(1017, 17),
(1018, 18),
(1019, 19),
(1020, 20),
(1021, 21),
(1022, 22),
(1023, 23),
(1024, 24),
(1025, 25),
(1026, 26),
(1027, 27),
(1028, 28),
(1029, 29),
(1030, 30),
(1031, 31),
(1032, 32),
(1033, 33),
(1034, 34),
(1035, 35),
(1036, 36),
(1037, 37),
(1038, 38),
(1039, 39),
(1040, 40),
(1041, 41),
(1042, 42),
(1043, 43),
(1044, 44),
(1045, 45),
(1046, 46),
(1047, 47),
(1048, 48),
(1049, 49),
(1050, 50),
(1051, 51),
(1052, 52),
(1053, 53),
(1054, 54),
(1055, 55),
(1056, 56),
(1057, 57),
(1058, 58),
(1059, 59),
(1060, 60),
(1061, 61),
(1062, 62),
(1063, 63),
(1064, 64),
(1065, 65),
(1066, 66),
(1067, 67),
(1068, 68),
(1069, 69),
(1070, 70),
(1071, 71),
(1072, 72),
(1073, 73),
(1074, 74),
(1075, 75),
(1076, 76),
(1077, 77),
(1078, 78),
(1079, 79),
(1080, 80),
(1081, 81),
(1082, 82),
(1083, 83),
(1084, 84),
(1085, 85),
(1086, 86),
(1087, 87),
(1088, 88),
(1089, 89),
(1090, 90),
(1091, 91),
(1092, 92),
(1093, 93),
(1094, 94),
(1095, 95),
(1096, 96),
(1097, 97),
(1098, 98),
(1099, 99),
(1100, 100);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `ordrer`
--
ALTER TABLE `ordrer`
  ADD PRIMARY KEY (`ID`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
