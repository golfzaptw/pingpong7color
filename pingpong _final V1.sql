-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: May 09, 2017 at 05:10 PM
-- Server version: 10.1.16-MariaDB
-- PHP Version: 7.0.9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `pingpong`
--

-- --------------------------------------------------------

--
-- Table structure for table `role`
--

CREATE TABLE `role` (
  `id` int(11) NOT NULL,
  `name_role` varchar(50) COLLATE utf16_unicode_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf16 COLLATE=utf16_unicode_ci;

--
-- Dumping data for table `role`
--

INSERT INTO `role` (`id`, `name_role`) VALUES
(1, 'user'),
(2, 'doctor');

-- --------------------------------------------------------

--
-- Table structure for table `sick_ness`
--

CREATE TABLE `sick_ness` (
  `id` int(11) NOT NULL,
  `sick_list` varchar(300) COLLATE utf16_unicode_ci DEFAULT NULL,
  `color` varchar(50) COLLATE utf16_unicode_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf16 COLLATE=utf16_unicode_ci;

--
-- Dumping data for table `sick_ness`
--

INSERT INTO `sick_ness` (`id`, `sick_list`, `color`) VALUES
(1, 'ปกติ', 'white'),
(2, 'กลุ่มเสี่ยงสูงต่อเบาหวานและความดันโลหิตสูง', 'green'),
(3, 'กลุ่มป่วยระดับ0 ความคุมน้ำตาลและความดันโลหิต', 'strong green'),
(4, 'กลุ่มป่วยระดับ1 (อ่อน)', 'yellow'),
(5, 'กลุ่มป่วยระดับ2 (ปานกลาง)', 'orange'),
(6, 'กลุ่มป่วยระดับ2 (รุนแรง)', 'red'),
(7, 'มีโรคแทรกซ้อน', 'black');

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `id` int(11) NOT NULL,
  `username` varchar(30) COLLATE utf16_unicode_ci DEFAULT NULL,
  `password` varchar(50) COLLATE utf16_unicode_ci DEFAULT NULL,
  `name` varchar(30) COLLATE utf16_unicode_ci DEFAULT NULL,
  `surname` varchar(30) COLLATE utf16_unicode_ci DEFAULT NULL,
  `role` int(1) DEFAULT NULL,
  `sick_type` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf16 COLLATE=utf16_unicode_ci;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `role`
--
ALTER TABLE `role`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `sick_ness`
--
ALTER TABLE `sick_ness`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`id`),
  ADD KEY `role` (`role`),
  ADD KEY `sick_type` (`sick_type`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `role`
--
ALTER TABLE `role`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT for table `sick_ness`
--
ALTER TABLE `sick_ness`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;
--
-- AUTO_INCREMENT for table `user`
--
ALTER TABLE `user`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
--
-- Constraints for dumped tables
--

--
-- Constraints for table `user`
--
ALTER TABLE `user`
  ADD CONSTRAINT `role` FOREIGN KEY (`role`) REFERENCES `role` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `sick_type` FOREIGN KEY (`sick_type`) REFERENCES `sick_ness` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
