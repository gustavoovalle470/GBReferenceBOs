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
-- Table structure for table `ad_module_configuration`
--

DROP TABLE IF EXISTS `ad_module_configuration`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `ad_module_configuration` (
  `MODULE_CONFIG_ID` int(11) NOT NULL AUTO_INCREMENT,
  `CREATE_DT` datetime NOT NULL,
  `MODULE_CONFIG_DESC` varchar(150) NOT NULL,
  `MODULE_CONFIG_NAME` varchar(30) NOT NULL,
  `MODULE_CONFIG_TYPE` varchar(15) NOT NULL,
  `MODULE_CONFIG_VALUE` varchar(100) NOT NULL,
  `rowversion` int(11) NOT NULL,
  PRIMARY KEY (`MODULE_CONFIG_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ad_module_configuration`
--

LOCK TABLES `ad_module_configuration` WRITE;
/*!40000 ALTER TABLE `ad_module_configuration` DISABLE KEYS */;
INSERT INTO `ad_module_configuration` VALUES (1,'2019-11-18 00:00:00','Nombre de la aplicacion','APP_NAME','STRING','Gabyval System',0),(2,'2019-11-18 00:00:00','Version actual de la aplicacion','APP_VERSION','STRING','3.0.0-BETA',0),(3,'2019-11-18 00:00:00','Tiempo en dias para el vencimiento de una contraseña','PWD_EXPIRE_TIME','INTEGER','30',0),(4,'2019-11-18 00:00:00','Tamaño minimo de una contraseña','PWD_MIN_SIZE','INTEGER','5',0),(5,'2019-11-18 00:00:00','Tamaño maximo de una contraseña','PWD_MAX_SIZE','INTEGER','12',0),(6,'2019-11-18 00:00:00','La contraseña debe contener al menos una mayuscula','PWD_ONE_MAY','BOOLEAN','TRUE',0),(7,'2019-11-18 00:00:00','La contraseña debe contener al menos una minuscula','PWD_ONE_MIN','BOOLEAN','TRUE',0),(8,'2019-11-18 00:00:00','La contraseña debe contener al menos un numero','PWD_ONE_NUM','BOOLEAN','TRUE',0),(9,'2019-11-18 00:00:00','Cantidad de contraseñas a guardar en el historial de contraseñas','PWD_CANT_SAVE','INTEGER','12',0);
/*!40000 ALTER TABLE `ad_module_configuration` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-11-18 11:10:24
