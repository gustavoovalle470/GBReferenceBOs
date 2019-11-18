CREATE DATABASE  IF NOT EXISTS `db_gabyval` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `db_gabyval`;
-- MySQL dump 10.13  Distrib 8.0.18, for Win64 (x86_64)
--
-- Host: localhost    Database: db_gabyval
-- ------------------------------------------------------
-- Server version	8.0.18

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `gb_pwd_history`
--

DROP TABLE IF EXISTS `gb_pwd_history`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `gb_pwd_history` (
  `GB_PWD_SAVED` varchar(255) NOT NULL,
  `GB_USERNAME` varchar(255) NOT NULL,
  `CREATE_DT` date NOT NULL,
  `GB_PWD_INS_DT` datetime NOT NULL,
  `rowversion` int(11) NOT NULL,
  PRIMARY KEY (`GB_PWD_SAVED`,`GB_USERNAME`),
  KEY `FK_1guu2i6hvlfk0n7e9t57svem` (`GB_USERNAME`),
  CONSTRAINT `FK_1guu2i6hvlfk0n7e9t57svem` FOREIGN KEY (`GB_USERNAME`) REFERENCES `gb_users` (`GB_USERNAME`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `gb_pwd_history`
--

LOCK TABLES `gb_pwd_history` WRITE;
/*!40000 ALTER TABLE `gb_pwd_history` DISABLE KEYS */;
INSERT INTO `gb_pwd_history` VALUES ('5xT14Jsm83uzb2PyR4mjtQ==','ADMIN','2019-11-18','2019-11-18 08:54:23',0);
/*!40000 ALTER TABLE `gb_pwd_history` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-11-18 11:10:25
