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
-- Table structure for table `gb_staff`
--

DROP TABLE IF EXISTS `gb_staff`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `gb_staff` (
  `GB_ID_TYPE` int(11) NOT NULL,
  `GB_ID_TYPE_CNAME` varchar(255) NOT NULL,
  `GB_USERNAME` varchar(255) NOT NULL,
  `CREATE_DT` date NOT NULL,
  `GB_BIRTHDATE` date DEFAULT NULL,
  `GB_EMAIL` varchar(200) DEFAULT NULL,
  `GB_GENDER` int(11) DEFAULT NULL,
  `GB_ID_NUMBER` varchar(20) NOT NULL,
  `GB_MOBILE_NUMBER` varchar(20) DEFAULT NULL,
  `GB_PHONE_NUMBER` varchar(20) DEFAULT NULL,
  `GB_PHOTO` longblob,
  `GB_STAFF_NAME` varchar(200) NOT NULL,
  `GB_STAFF_SURNAME` varchar(200) NOT NULL,
  `rowversion` int(11) NOT NULL,
  PRIMARY KEY (`GB_ID_TYPE`,`GB_ID_TYPE_CNAME`,`GB_USERNAME`),
  KEY `FK_inyeffhaqnog5d7pt0src4tiw` (`GB_USERNAME`),
  CONSTRAINT `FK_inyeffhaqnog5d7pt0src4tiw` FOREIGN KEY (`GB_USERNAME`) REFERENCES `gb_users` (`GB_USERNAME`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `gb_staff`
--

LOCK TABLES `gb_staff` WRITE;
/*!40000 ALTER TABLE `gb_staff` DISABLE KEYS */;
INSERT INTO `gb_staff` VALUES (1,'DOCUMENT_TYPE','ADMIN','2019-11-18','2019-11-18','gustavoovalle470@gmail.com',0,'1014227392','3138767614','4767694',_binary '�PNG\r\n\Z\n\0\0\0\rIHDR\0\0\00\0\0\02\0\0\0\Z\�X�\0\0�iCCPICC profile\0\0(�}�=H\�@\�_S�R*�vqX]� *\�(U,��\�Vh\��\�\�/hҐ��8\n�?�.κ:�\n�\�����������\�\"ƃ\�~����{�S͎	@\�,#��\�̪\�{��\�\��%f\�\�b\n�\�\��ޅy���?G��5\��\�nX\�\�3��\�y�8\�\n�B|N<n\���.7��s\�a�g�Tb�8H,\�\�XncV0T\�i␢j�/��p\�⬖*�yO�\�@V[Ir�\��XBq��QA%XӪ�b\"A���㏓K&W�(C�\����\�w�fnj���\0�/��1�v�zն��m�~x��+�\�/׀\�Oҫ--t�l\�-M\�.w��\']2$G�\�r9\����)�\���Fo\�}�>\0)\�j�88F�\��\��\��=\�\�\��r\�!��g\0\0\0bKGD\0�\0�\0�����\0\0\0	pHYs\0\0\0\0\�\�~�\0\0\0tIME\�\n\0w�/v\0\0\nrIDATh\�͚yt\�U\�?鞖eXZRhK�X@���Nr\0Q\�DfT��\n�\"�8*�#�RPP�@���\"\�R��,\�\�to����\r=-m 0�sr��\�{�\��\�]��ޟ�Rr#\�V!\�\�$��=nω\�\�g��P�\�#�-@UQ���w\�.`��x�����\'c��pWWcDg��t^S~f\"\�WN�������\0[�@o�/\���\Z0֙�=���\�\���]\�\�\��,\�\"��ۄ\�ly\��(\�w=�}�,�HG\�v��&٣\�9�t\�\�`߸�l�\0��;N\�n\�} \n8�F}�r/\�\n�!�!��Y��\�G\�[u�9*�a�FD��^�@�0[��\�\�\�cogM|\�\��?�b�3\'\�\�\�\�Fh�o`�\�\�\'\ZDD\�T\�(�b�S�n��\�\�\�,���g\�ߟ� ��\�[iH�\�`��\�O\�t�\����GP�a+�Y\�P`��\��l|\�/d�آ;�&/w\\�j��\�r\�X\�e_\�\rd�Y��m\�;�v\�¶k��qѭ��o6[�N��e{lfK\'�6_(\�J�\�J\�ʛ(�\��1�������Ѣ\�7P��\�\�ވ\�f́W�G�\0�X̐�E��<�Os0��Exk\�\�#j���)ʒ��ͧ>C\�\�7�A\�\�\�_\'F\\m\�\�\�\'\�3��u��B�c\�\�!\�|=R�&-գ\��s\�8l={:���d�k}�$\� \�k\�d��\���\��-�^O��|\�zD�О�|��j�50�\�\�w�\�F\�\�\�3!7[R��Nj\�q�\�\�\�9�\�J)9�\�tJ>\\+p��1j\��4���A�r\�\�o5\�\�Ń�8>v<���/�M\r��\"t\�D\�c�+H�\�2HS�O]�Ы�\��\�\�(�\0�f�x]$�\�	M[j;s\\�\�?�ֵ�o\"�,Т	\�\�\"D��\�qgcn4\�T�cw\�\�Bf�$Ě-_\��\��, Y^*[b=}L�\ZS�KI\�\�UNy�l.�,R�\��\0��\�.e���^\�lY�0̽\�y\Z�B�kZ\�\�WKl%\�\n�J튭\��\�,.�\���:�O�˧Q�b\�\��\�\��{xX��\'H^\�#��\�e5\�Ԩ�\0Dpp$0\��\��a`�,//]\�e��\�|\�$\�\��=)�Cд�8`�,�\�%BS}�AU\�!��fG�?\�r\���}\r2�j\�BFGF\ZDp�T\��T11B�\�w�|�\�\�\�Ȁ�hM&�y\'�x|d:.�}֜\�]���K�\�]��U0\�l\�ҝ�Ym��Bg4\�;�ݹs\�5gN R�\�y,�~/#\�G�ن��}\��0\��FU���5ʪ�\��\�ɓ\�L�^\�K\�s\�= _�\�Qʎ�ˊ���Hh�� �u\��ɔ\n��b~���\\�VS���\��Z\�d\Z|���\�/�\�\"��uC�\�ex0OVV�X^]\�eך!%iRR\�p|�\�\�(�WN\�^�\��-+��}\�\�\"�_@�3\"\�\�(\�\�\�9�\�_IZ�(���B�\0y\�;n	BӜ\n�\�Ҭ\�=ж�k���el\0�ӣ���\�W�|�����\��_ܥ�\0z�5#{�j��=�\"��ÇV�꯾H�\�(��\�\�ڵB\�m\�V��\�\�\\#N\�\��\�Q��L�kݻ�,Oi\�7�L�|Oyy��	\�M� MJ<\�\�*\�\�!\�XG\0��@!\�\�W�;�\�\�\�F԰Q��mM\�\�4)\�=y�UF�\�K�.���\�6h����F������%{\�\�m\�\�f͖.э\'�u2�TդV_<�\�liD`8`\���II���B���G(�\��yYVV�\�vs�:ۅ@3[�T�=	0�\���B�\�\�\�\�\Z���\�lI\�Q\�8\�e�-�\�:��\�_����X}\Z�\�$M3[Vyv�W2��վ��Ġ�\�G��À��c�I�\�hf�n�\�7f�\�\�cl�=;���|�GD+�ө[h�\0�u�n\'\"H]m�z\�\�>��\�\�g\��n\�ݑ�/\�\�ik�\�\�C��q%�Y��f�P��l�0p�\"��o,A��]�@{l���Ј}T;d=\'cB�-Ry��Y\r$˲\�g�9�僥���ׁ}\0�U)�a��\��\�\�av6\�����-��\�x�\�}X-{�t\�I*\�v�7\��\�C�l��\0����lF\�?8tS�v!��\�\�\�6!Й-�*7Am\�dD�tx�wQv��E�0\�=�4I\�?\n\���k)I�Z���\�\�\�-;!(\�~U�LV�\0\�S\�\��\�{D[��\�F�KJ\�\�	�죊W��\�<�\���Q\�\�!ěs2�\�\��G.�`ޛ�i���^%�K��xݖ�\�W��z�\rB`�M�\�wo�>\n�T�B�[\n�(���\�yr2EǏs�{?Ddh�*3>^�@��̽P��gmz��?�!��\0���\�\�17\�q{N�l��))�N����]{\�r��W1\�L\�\�9\�i��\'\'_{�\�\�@Ӳ=[S�����ؒ.��Y�.\\`�\��@�~���\�\�UP��1\�c}\\�\��\�\�\�ߡ��@\�t�u�0\Z��:��&.g\�\�\\|\�\�_:�����^\�\�5`nUnV\�=>�tM}\��B\�!Q\�\��:/q�,�@E\��ém\��C\�\Z�*\�N�\�\��\�VV�!$ķ�\��4�3B\�\"��c�\�pSo�\�D3<\0\�L�\�ڽ�\�)^�F>�ҩ����>J��\��D�/Xrx�.\�z\�\�uo\�w%�O�\��^��h\�\�w�)�[�LwnVi�[\�]	\��$vH�=Qn7�ڮ\�\�ZT�3=6I@X�\��7\�}��\�b��\�A\�p��A\�\�ɣr\�\r\�Kܨ�n\�������\0\0\0\0IEND�B`�','ADMINISTRADOR','GABYVAL SYSTEM',0);
/*!40000 ALTER TABLE `gb_staff` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-11-18 11:10:26
