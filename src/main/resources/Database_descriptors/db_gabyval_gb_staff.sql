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
INSERT INTO `gb_staff` VALUES (1,'DOCUMENT_TYPE','ADMIN','2019-11-18','2019-11-18','gustavoovalle470@gmail.com',0,'1014227392','3138767614','4767694',_binary '‰PNG\r\n\Z\n\0\0\0\rIHDR\0\0\00\0\0\02\0\0\0\Z\ÊXŒ\0\0…iCCPICC profile\0\0(‘}‘=H\Ã@\Å_S¥R*¢vqX]´ *\â(U,‚…\ÒVh\ÕÁ\ä\Ò/hÒ¤¸8\n®?«.Îº:¸\n‚\àˆ‹«“¢‹”ø¿´\Ð\"Æƒ\ã~¼»÷¸{µSÍŽ	@\Õ,#ˆ\éÌª\è{…½\è\Ã†%f\ê±\äb\n®\ã\ë¾Þ…y–û¹?G·’5\à‰\ç˜nX\Ä\Ä3›–\ÎyŸ8\È\n’B|N<n\Ð‰¹.7øs\ÞagTbž8H,\æ\ÛXncV0T\âiâ¢j”/¤¬p\Þâ¬–*¬yOþ\Â@V[Ir\æ¢XBqˆQA%XÓª‘b\"Aûÿ ã“K&WŒ(C…\äøÁÿ\àw·fnj²‘ˆ\0/¶ý1øvzÕ¶¿m»~xŸ+­\å/×€\ÙOÒ«--tôl\×-M\Þ.w€\']2$Gò\Òr9\àýŒ¾)ô\ßþµFo\Í}œ>\0)\êjù88Fó”½\îò\î®ö\Þþ=\Ó\ì\ï»r\Ä!©g\0\0\0bKGD\0ÿ\0ÿ\0ÿ ½§“\0\0\0	pHYs\0\0\0\0\Ò\Ý~ü\0\0\0tIME\ã\n\0w£/v\0\0\nrIDATh\ÞÍšyt\ÓU\Ç?ï—¤éž–eXZRhKºX@‡‚¬Nr\0Q\ÎDfT‡£\nƒ\"‹8*‹# RPP @ƒ²ˆ\"\ÐR–¶,\Û\Òto³¼ù£\r=-m 0¼sr’“\ß{÷\Ýû\Þ]¾÷ÞŸRr#\ÆV!\Ð\Ç$²=nÏ‰\è\×gÿÀP¿\ï#ü-@UQûÁ“w\á.`üx‰ªš‚ž\'c¿õpWWcDg¶´t^S~f\"\ÄWN¦³¿Ÿöõ‹\0[…@o¶/\ãõ¨\Z0Ö™þ=ð¹µ\×\Ñ„…]\×\Þ\Úõ,\Þ\"öøÛ„\Þly\È¦(\æw=€}õ,»HG\ëv§¤&Ù£\â9¶t\Ù\Í`ß¸ñl‚\0³¥;N\×n\à} \n8ŒF}‘r/\à¼\n™!À!ôºYù³\æG\Ú[u¸9*”aŠFD„´^ô@ð0[––\Ø\Ê\ÎcogM|\Ü\Ó²?“b•3\'\Ó\Õ\ß\íFhšo`“\Ø\Û\'\ZDD\ÈT\à(ðbþS n÷”\î\ß\í,±•g\ïßŸ§ ¸‰\ä[iH¹\Ë`¶ô\ÙO\î–tÿ\ÜÀž‡GPµa+¢Y\ØP`§¦\àñl|\Ý/dºØ¢;‚&/w\\£j¯¦\ár\çX\Ïe_\Û\rd¯Yƒ½m\Õ;÷v\ÍÂ¶kóqÑ­ûþo6[óN‡½e{lfK\'¥6_(\æJ\ÖJ\ÅÊ›(À\ÃÀ1ôº©ö˜„°Ñ¢\é7P”•\Å\á¤Þˆ\èfÍW€G\0 XÌ¥E¶¢<§Os0¥¢Exk\Å\è#j®óò)Ê’ŠóÍ§>C\á\ì7¡A\í•\í\Ü_\'F\\m\ä\Ñ\Ä\'\Î3™žuø½B€c\Ë\Þ!\Ö|=RŽ&-Õ£\ÍÀs\Ô8l={:‰Žd³k}ÿ$\à \Âk\îdœ®\ï»þ–\à–-ó^O¥|\åzD³ÐžÀ| —jõ50‘\Ê\êw\ÏF\Ó\ë¯\à3!7[R€€Nj\Ñq¥\ç\ë\ß9›\ÍJ)9ø\ÂtJ>\\+pº¦1j\îÀ4œ®Aƒr\ç\Ûo5\È\ÉÅƒ‡8>v<žó‡/ñM\røÀ\"t\ÚD\ë©cž+Hƒ\Ù2HS“O]ÿÐ«¸\Çû\Ë\Ù(¿\0±f‹x]$”\ï	M[j;s\\ú\â–?‚Öµ€o\"ð,Ð¢	\Ë\Î\"D¬õ\Ìqgcn4\ØTµcw\ë\íBf¶$Äš-_\Ûó\åÀ, Y^*[b=}Lú\ZS†KI\Ò\ÚUNy©l.,Rð£\îð\0Ÿø\â….eÀÀ^\ÍlY®0Ì½\êy\ZBkZ\Ì\ÂWKl%\ç®\n´JíŠ­\ä±\ï,. \Æõ´:œOË§Q©b\Î\ìú\Ö\ë {xX˜•\'H^\Ä#¿µ\æe5\ÈÔ¨€\0Dpp$0\è„\ÅÀa`,//]\î¼e˜ô\Ç|\á$\Õ\Çñ=)©CÐ´À8`ž,¯\Ú%BS}¹AU\Í! «fG€?\ár\ßúÀ}\r2¿j\áBFGF\ZDpðT\à°T11B¡\Ôw|ò\ì\è\ÈÈ€úhM&¬y\'ˆx|d:.÷}Öœ\Ì]¶‚œKµ\ë]œ›U0\Öl\é‡Ò“Ym­ªBg4\Ö;÷Ý¹s\Ù5gN R®\Õy,¡~/#\åGÀÙ†ö¾}\Úó0\íùFUðª¬©5Êª¦\èò\ÎÉ“\ÑL¦^\ÌK\às\à= _¡\ÕQÊŽ¦ËŠŠ³þHhôþ ’u\äšÉ”\nŒöb~”¬¬\\‘VSƒ”›\ÄÀZ\Íd\Z|µ¼¦\Æ/™\æ\"³»uC\îex0OVV®X^]\Íe×š!%iRR\ìp|¼\Ü\á(õWN\ì—^ª\ã–-+¯·}\â\ç\"‚_@§3\"\å\å(\ê\Ä\ã9©\×_IZÁ(“©…B¦\0y\ï;n	BÓœ\n§\ÔÒ¬\Ë=Ð¶ökð£ú¼el\0§Ó£€€\ç®Wž|²¾™²\ßÿ_Ü¥¥\0zý5#{õj£‚=ü\"À”Ã‡V…ê¯¾Hù\Ù(“©\í\ßÚµB\îm\ÛVø\Ä\Ü\\#N\ì\Ü\ÃQ ™LkÝ»,Oi\é7£L¦|Oyy”	\ÌM´ MJ<\Ç\Ì*\Ô\ß!\ÊXG\0ýŒ@!\Ý\ÓWý;¾\Æ\Ï\æFÔ°Q¾‚mM\Ô\å4)\é=yòUF·\ÆK¥.•ñ\Ý6hþüýõFõ•«°·‰%{\Ä\ãm\Ð\ëfÍ–.Ñ\'õu2²TÕ¤V_<ƒ\ÑliD`8`\Ëþ©II‹‚‘B …‡G(¦\àôyYVV’\îvs¶:Û…@3[‚TŽ=	0©\Ûú«B·\ß\Õ\Í\È\Z¶†\ÑlI\ÖQ\Ô8\×e˜-“\í­:œ¶\æ_õöñ²X}\Zö\Ø$M3[Vyv¬W2ªœÕ¾¨Ä ¢\ÒG³òÃ€Ÿ˜cIˆ\Èhf¾n»\Ù7fö\èŽ\Øcl¸=;Šù|•GD+•Ó©[h²\0—u¸n\'\"H]m¶z\Â\Þ>Á˜\Ô\Æg\Æó¶n\ÃÝ‘Š/\Ò\Ðik\í\ÊC•¯q%¹Y‹ûfýP¤µlö0pù\"€±o,Aò£ø]ø@{l’ö¹Ðˆ}T;d=\'cB§-RyöŸY\r$Ë²\Êg­9™åƒ¥¤²°×}\0‹U)³aª«\íü\ì\Ãav6\áö¤‡š-©‘\í¸x¨\Þ}X-{ºt\æ¸I*\çv 7\Ïð°\áCòl…¹\0¬‚ý½lF\Í?8tS¤v!„»\Þ\Ê\Ü6!Ð™-ª*7Am\ÐdD¡tx¦wQv¦ôE‡0\Ç=¨4I\Í?\n\Ì¡Ák)IôZýÁ¯\Å\ä\ê-;!(\à~U®LVó\0\ÏS\í\Üÿ\Ñ{D[­õ\×F«KJ\Ø\Û	üì£ŠW©š\ê<š\Ö˜ôQ\Ï\æ!Ä›s2\Ã\ÔþG.¢`Þ› i€¹^%œKÀ„xÝ–“\é”W«z\rB`ŠM¸\Üwo‰>\n’TB§[\n¼(óŠ\ì yr2EÇs¸{?Ddh¤*3>^§@üœÌ½P˜¸gmzôð½?!ôˆ˜ø\0¤¥ú\×\à17\ãq{N¤lú”))µN¾°½]{\ërð‚W1\ÙL\Ä\ã9\Ôióš\'\'_{ƒ\ã\×@Ó²=[S•úŸŒóØ’.“þY„.\\`ÿ\ïû@€~ ª¸\Ý\áUP›Š1\àc}\\Œ\ìó\Õ\ç\×ß¡¹¢@\étòu»0\Zº¨:ÿ€&.g\Í\É\\|\ä\Ì_:­£²“¡^\à\î5`nUnV\å=>ðtM}\âõB\Ñ!Q\Ã\í¤:/q,™@E\Õ‚Ã©m\ÅþC\Å\Z—*\ÚN¨\É\Íú\ÙVV†!$Ä·‚\Âõ4º3B\Û\"š‡c€\ÑpSo¢\ÂD3<\0\ØLÀ\éÚ½ñ\Â)^»F>üÒ©··ƒ>J…ü\ÑõDñ/Xrx.\Íz\ê\èuo\î·w%ŠO\âû^ýÁh\è©\ì£w)À[ÀLwnVi¿[\é]	\ïñ¶$vH¸=Qn7šÚ®\å\ÓZT«3=6I@X¨\ßö7\â}¡ª\âb¾µ\ÜA\ÆpÀ‚A\à\âÉ£r\Ø\r\ØKÜ¨žn\Öø‡þôüö\0\0\0\0IEND®B`‚','ADMINISTRADOR','GABYVAL SYSTEM',0);
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
