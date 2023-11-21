-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Nov 21, 2023 at 12:52 PM
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
-- Table structure for table `pizzaordrer`
--

CREATE TABLE `pizzaordrer` (
  `PizzaID` int(11) DEFAULT NULL,
  `OrdrerID` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `pizzaordrer`
--

INSERT INTO `pizzaordrer` (`PizzaID`, `OrdrerID`) VALUES
(1, 1001),
(2, 1002),
(3, 1003),
(4, 1004),
(5, 1005),
(6, 1006),
(7, 1007),
(8, 1008),
(9, 1009),
(10, 1010),
(11, 1011),
(12, 1012),
(13, 1013),
(14, 1014),
(15, 1015),
(16, 1016),
(17, 1017),
(18, 1018),
(19, 1019),
(20, 1020),
(21, 1021),
(22, 1022),
(23, 1023),
(24, 1024),
(25, 1025),
(1, 1026),
(2, 1027),
(3, 1028),
(4, 1029),
(5, 1030),
(6, 1031),
(7, 1032),
(8, 1033),
(9, 1034),
(10, 1035),
(11, 1036),
(12, 1037),
(13, 1038),
(14, 1039),
(15, 1040),
(16, 1041),
(17, 1042),
(18, 1043),
(19, 1044),
(20, 1045),
(21, 1046),
(22, 1047),
(23, 1048),
(24, 1049),
(25, 1050),
(1, 1051),
(2, 1052),
(3, 1053),
(4, 1054),
(5, 1055),
(6, 1056),
(7, 1057),
(8, 1058),
(9, 1059),
(10, 1060),
(11, 1061),
(12, 1062),
(13, 1063),
(14, 1064),
(15, 1065),
(16, 1066),
(17, 1067),
(18, 1068),
(19, 1069),
(20, 1070),
(21, 1071),
(22, 1072),
(23, 1073),
(24, 1074),
(25, 1075),
(1, 1076),
(2, 1077),
(3, 1078),
(4, 1079),
(5, 1080),
(6, 1081),
(7, 1082),
(8, 1083),
(9, 1084),
(10, 1085),
(11, 1086),
(12, 1087),
(13, 1088),
(14, 1089),
(15, 1090),
(16, 1091),
(17, 1092),
(18, 1093),
(19, 1094),
(20, 1095),
(21, 1096),
(22, 1097),
(23, 1098),
(24, 1099),
(25, 1100);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
