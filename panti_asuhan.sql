-- phpMyAdmin SQL Dump
-- version 4.9.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Nov 24, 2019 at 09:39 AM
-- Server version: 10.4.8-MariaDB
-- PHP Version: 7.3.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `panti_asuhan`
--

-- --------------------------------------------------------

--
-- Table structure for table `tabel_admin`
--

CREATE TABLE `tabel_admin` (
  `nama` varchar(30) NOT NULL,
  `username` varchar(20) NOT NULL,
  `password` varchar(8) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tabel_admin`
--

INSERT INTO `tabel_admin` (`nama`, `username`, `password`) VALUES
('daer', 'user', 'pass'),
('admin', 'admin', 'admin'),
('user', 'root', 'root');

-- --------------------------------------------------------

--
-- Table structure for table `tabel_anak_asuh`
--

CREATE TABLE `tabel_anak_asuh` (
  `nama` varchar(30) NOT NULL,
  `tanggal masuk` varchar(20) NOT NULL,
  `tanggal lahir` varchar(20) NOT NULL,
  `penyakit` varchar(20) NOT NULL,
  `keterangan` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tabel_anak_asuh`
--

INSERT INTO `tabel_anak_asuh` (`nama`, `tanggal masuk`, `tanggal lahir`, `penyakit`, `keterangan`) VALUES
('dsad', 'asdsa', 'fasa', 'dsasfa', 'fdfsds'),
('dsad', 'fsadas', 'dfvd', 'dscdscd', 'vdvd');

-- --------------------------------------------------------

--
-- Table structure for table `tabel_inventaris`
--

CREATE TABLE `tabel_inventaris` (
  `nama` varchar(30) NOT NULL,
  `jenis` varchar(45) NOT NULL,
  `jumlah` varchar(999) NOT NULL,
  `donatur` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tabel_inventaris`
--

INSERT INTO `tabel_inventaris` (`nama`, `jenis`, `jumlah`, `donatur`) VALUES
('sdas', 'dsasadsa', 'safasd', 'fasa');

-- --------------------------------------------------------

--
-- Table structure for table `tabel_pegawai`
--

CREATE TABLE `tabel_pegawai` (
  `nama` varchar(30) NOT NULL,
  `nip` varchar(30) NOT NULL,
  `jabatan` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tabel_pegawai`
--

INSERT INTO `tabel_pegawai` (`nama`, `nip`, `jabatan`) VALUES
('adas', 'sada', 'fsasfk'),
('asa', 'dsasdsa', 'fassa');

-- --------------------------------------------------------

--
-- Table structure for table `tabel_pengurus`
--

CREATE TABLE `tabel_pengurus` (
  `nama` varchar(30) NOT NULL,
  `umur` varchar(3) NOT NULL,
  `kegiatan` longtext NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tabel_pengurus`
--

INSERT INTO `tabel_pengurus` (`nama`, `umur`, `kegiatan`) VALUES
('fsasa', '34', 'dasdassa'),
('dsasa', '21', 'dsasa');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
