-- phpMyAdmin SQL Dump
-- version 3.4.10.1
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: May 24, 2018 at 12:14 PM
-- Server version: 5.5.20
-- PHP Version: 5.3.10

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `student_rep_db`
--

-- --------------------------------------------------------

--
-- Table structure for table `class_table`
--

CREATE TABLE IF NOT EXISTS `class_table` (
  `id` int(11) NOT NULL,
  `class_name` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `class_table`
--

INSERT INTO `class_table` (`id`, `class_name`) VALUES
(1, 'plus one'),
(2, 'plus two');

-- --------------------------------------------------------

--
-- Table structure for table `division_table`
--

CREATE TABLE IF NOT EXISTS `division_table` (
  `id` int(11) NOT NULL,
  `division` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `division_table`
--

INSERT INTO `division_table` (`id`, `division`) VALUES
(1, 'A'),
(2, 'B'),
(3, 'C'),
(4, 'D');

-- --------------------------------------------------------

--
-- Table structure for table `place_table`
--

CREATE TABLE IF NOT EXISTS `place_table` (
  `id` int(11) NOT NULL,
  `place_name` varchar(64) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `place_table`
--

INSERT INTO `place_table` (`id`, `place_name`) VALUES
(1, 'Malappuram'),
(2, 'Kottayam'),
(3, 'TVM');

-- --------------------------------------------------------

--
-- Table structure for table `student_table`
--

CREATE TABLE IF NOT EXISTS `student_table` (
  `id` int(11) NOT NULL,
  `student_name` varchar(64) NOT NULL,
  `gender` varchar(10) NOT NULL,
  `student_address` varchar(64) NOT NULL,
  `student_place` varchar(34) NOT NULL,
  `student_class` varchar(11) NOT NULL,
  `student_division` varchar(10) NOT NULL,
  `student_pcnt` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `student_table`
--

INSERT INTO `student_table` (`id`, `student_name`, `gender`, `student_address`, `student_place`, `student_class`, `student_division`, `student_pcnt`) VALUES
(1, 'Rishad Kavad', 'Male', 'Kavad', 'Malappuram', 'plus two', 'B', 74.75),
(3, 'Ann', 'Female', 'SM Street', 'TVM', 'plus two', 'B', 78.8),
(4, 'Indhuleka', 'Female', 'CV', 'Kottayam', 'plus two', 'A', 86.7),
(5, 'Pooja', 'Female', 'PM', 'Kottayam', 'plus two', 'A', 78.9),
(6, 'Fahad', 'Male', 'CK', 'Malappuram', 'plus one', 'D', 77.7),
(6, 'Sariga', 'Female', 'KL', 'TVM', 'plus one', 'D', 67.9);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
