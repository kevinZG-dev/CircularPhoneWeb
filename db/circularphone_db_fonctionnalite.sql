-- MySQL dump 10.13  Distrib 8.0.25, for Win64 (x86_64)
--
-- Host: localhost    Database: circularphone_db
-- ------------------------------------------------------
-- Server version	8.0.25

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
-- Table structure for table `fonctionnalite`
--

DROP TABLE IF EXISTS `fonctionnalite`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `fonctionnalite` (
  `idfonctionnalite` int NOT NULL,
  `smartphone_idsmartphone` int DEFAULT NULL,
  `marque` varchar(25) DEFAULT NULL,
  `os` varchar(25) DEFAULT NULL,
  `4g` int DEFAULT NULL,
  `5g` int DEFAULT NULL,
  `microSD` int DEFAULT NULL,
  `batterieamovible` int DEFAULT NULL,
  `esim` int DEFAULT NULL,
  `dimensions` text,
  `poids` text,
  `diagonaleecran` varchar(15) DEFAULT NULL,
  `definitionecran` varchar(35) DEFAULT NULL,
  `resolution` varchar(10) DEFAULT NULL,
  `typedecran` varchar(20) DEFAULT NULL,
  `partecran` varchar(20) DEFAULT NULL,
  `pucemobile` varchar(60) DEFAULT NULL,
  `processeur` varchar(150) DEFAULT NULL,
  `nbrdecoeur` int DEFAULT NULL,
  `gpu` varchar(25) DEFAULT NULL,
  `memoirevive` varchar(10) DEFAULT NULL,
  `capabatterie` varchar(12) DEFAULT NULL,
  `captphotoav` varchar(8) DEFAULT NULL,
  `captvideo` varchar(10) DEFAULT NULL,
  `connectique` varchar(20) DEFAULT NULL,
  `capteurdempreinte` int DEFAULT NULL,
  `typewifi` varchar(35) DEFAULT NULL,
  `typebluetooth` varchar(5) DEFAULT NULL,
  `nfc` int DEFAULT NULL,
  `typedetancheite` varchar(8) DEFAULT NULL,
  `gyroscope` int DEFAULT NULL,
  `induction` int DEFAULT NULL,
  `antichoc` int DEFAULT NULL,
  PRIMARY KEY (`idfonctionnalite`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `fonctionnalite`
--

LOCK TABLES `fonctionnalite` WRITE;
/*!40000 ALTER TABLE `fonctionnalite` DISABLE KEYS */;
INSERT INTO `fonctionnalite` VALUES (0,0,'Apple','IOS',1,0,0,0,0,'143.6 x 70.9 x 7.7 mm','177 g','5.8 pouces','2436 x 1125 px','458 ppp','Super Amoled','81.54 %','Apple A12 Bionic','2 x Vortex + 4 x Tempest - 2.5 GHz',6,'Apple GPU','4 Go','2658 mAh','7 Mpx','4K','Lightning',0,'802.11a/b/g/n/ac','5.0',1,'IP68',1,1,0),(1,1,'Samsung','Android',1,0,1,0,0,'151.7 x 69.1 x 7.9 mm','163 g','6.2 pouces','3200 x 1440 px','563 ppp','Amoled','88.96 %','Exynos 990','- 2.73 GHz',8,'Mali G77 MP11','12 Go','4000 mAh','10 Mpx','8K','USB-C',1,'802.11a/b/g/n/ac','5.0',1,'IP68',1,1,0),(2,2,'Fairphone','Android',1,0,1,1,0,'158 x 71.8 x 9.98 mm','188 g','5.65 pouces','2160 x 1080 px','427 ppp','IPS','72.94 %','Snapdragon 632','Arm Cortex-A53 - 2.2 GHz',8,'Adreno 506','4 Go','3080 mAh','8 Mpx','4K','USB-C',1,'802.11a/b/g/n/ac','5.0',1,'IP53',1,0,0),(3,3,'Apple','IOS',1,0,0,0,0,'150.9 x 75.7 x 8.3 mm','194 g','6.1 pouces','1792 x 828 px','326 ppp','IPS','80.37 %','Apple A13 Bionic','2 x Lightning + 4 x Thunder - 2.65 GHz',6,'Apple GPU','4 Go','3110 mAh','12 Mpx','4K','Lightning',0,'Wi-Fi 6 802.11ax','5.0',1,'IP68',1,1,0),(4,4,'Huawei','Android',1,1,0,0,0,'157 x 73 x 8.7 mm','192 g','6.47 pouces','1080 x 2340 px','398 ppp','OLED','90.05 %','Kirin 980','2x2.6 GHz Cortex-A76 & 2x1.92 GHz Cortex-A76 & 4x1.8 GHz Cortex-A55 - 2.6 GHz',8,'Mali-G76 MP10','8 Go','4200 mAh','32 Mpx','4K','USB-C',1,'802.11a/b/g/n/ac','5.0',1,'IP68',1,1,0),(5,5,'Xiaomi','Android',1,1,0,0,0,'162.6 x 74.8 x 9 mm','208 g','6.67 pouces','2340 x 1080 px','386 ppp','Amoled','90.16 %','Snapdragon 865','Kryo 585 - 2.42 GHz',8,'Adreno 650','8 Go','4780 mAh','20 Mpx','8K','USB-C',1,'Wi-Fi 6 802.11ax','5.0',0,'IP68',1,1,0),(6,6,'Nokia','Android',1,0,1,0,0,'164.28 x 76.62 x 8.5 mm','183 g','6.55 pouces','1600 x 720 px','268 ppp','IPS','82.62 %','Snapdragon 665','- 2 GHz',8,'Adreno 610','3 Go','4000 mAh','8 Mpx','4K','USB-C',0,'802.11a/b/g/n/ac','5.0',1,'IP68',1,0,0),(7,7,'Fairphone','Android',1,0,1,1,0,'158 x 71.8 x 9.9 mm','189 g','5.65 pouces','1080 x 2160 px','427 ppp','IPS','72.94 %','Snapdragon 632','Kryo 250 - 1.8 GHz',8,'Adreno 506','4 Go','3040 mAh','16 Mpx','4K','USB-C',1,'802.11a/b/g/n/ac','5.0',1,'IP68',1,0,0),(8,8,'Google','Android',1,0,0,0,1,'144 x 69.4 x 8.2 mm','143 g','5.81 pouces','1080 x 2340 px','443 ppp','OLED','83.33 %','Snapdragon 730','4 x Kryo 470 Gold + 4 x Kryo 470 Silver - 2.2 GHz',8,'Adreno 618','6 Go','3140 mAh','8 Mpx','4K','USB-C',1,'802.11a/b/g/n/ac','5.0',1,'IP68',1,0,0),(9,9,'Samsung','Android',1,1,0,0,1,'151.7 x 71.2 x 7.9 mm','169 g','6.2 pouces','2400 x 1080 px','421 ppp','Super Amoled','86.32 %','Exynos 2100','Cortex-X1, Cortex-A78, Cortex-A55 - 2.9 GHz',8,'Mali-G78 MP14','8 Go','4000 mAh','10 Mpx','8K','USB-C',1,'Wi-Fi 6 802.11ax','5.0',1,'IP68',1,1,0),(10,10,'Xiaomi','Android',1,0,0,0,0,'162.3 x 77.2 x 8.9 mm','199 g','6.53 pouces','1080 x 2340 px','401 ppp','IPS','83.88 %','MediaTek Helio G85','2 x Cortex-A75 + 6 x Cortex-A55 - 2 GHz',8,'ARM G52 MC2','6 Go','5020 mAh','13 Mpx','Full HD','USB-C',1,'802.11a/b/g/n/ac','5.0',0,'IP68',1,0,0),(11,11,'Google','Android',1,1,0,0,1,'144.7 x 70.4 x 8 mm','151 g','6 pouces','2340 x 1080 px','432 ppp','IPS','87.18 %','Qualcomm Snapdragon 765G','Kryo 475 - 2.74 GHz',8,'Adreno 620','8 Go','4000 mAh','8 Mpx','4K','USB-C',1,'802.11a/b/g/n/ac','5.0',1,'IP68',1,1,0),(12,12,'Samsung','Android',1,0,1,0,0,'155.6 x 75.6 x 7.9 mm','168 g','6.2 pouces','1570 x 720 px','271 ppp','IPS','80.22 %','Exynos 7884','ARM Cortex-A73 + A53 - 1.6 GHz',8,'Mali-G71 MP2','2 Go','3400 mAh','5 Mpx','Full HD','Micro USB',0,'802.11a/b/g/n','5.0',0,'IP68',1,0,0),(13,13,'Samsung','Android',1,0,1,0,0,'149.9 x 70.4 x 7.8 mm','157 g','6.1 pouces','3040 x 1440 px','550 ppp','Amoled','88.43 %','Exynos 9 Series 9820','4x Cortex-A55 + 2x Cortex A75 + 2x Custom - 2.73 GHz',8,'ARM Mali-G76 MP12','8 Go','3400 mAh','10 Mpx','4K','USB-C',1,'802.11a/b/g/n/ac','5.0',1,'IP68',1,1,0),(14,14,'Apple','IOS',1,1,0,0,1,'146.7 x 71.5 x 7.4 mm','164 g','6.1 pouces','2532 x 1170 px','460 ppp','OLED','87.57 %','A14 Bionic','2xFirestorm + 4x Icestorm - 3.1 GHz',6,'Apple GPU','4 Go','2815 mAh','12 Mpx','4K','Lightning',0,'Wi-Fi 6 802.11ax','5.0',1,'IP68',1,1,0),(15,15,'Xiaomi','Android',1,0,1,0,0,'156.5 x 75.4 x 9.4 mm','188 g','6.2 pouces','720 x 1520 px','271 ppp','IPS','81.66 %','Qualcomm Snapdragon 439','ARM Cortex-A53 - 1.95 GHz',8,'Adreno 505','3 Go','5000 mAh','8 Mpx','Full HD','Micro USB',1,'802.11a/b/g/n/ac','4.2',0,'IP53',1,0,0),(16,16,'Huawei','Android',1,1,1,0,1,'148.9 x 71.06 x 8.5 mm','175 g','6.1 pouces','1080 x 2340 px','422 ppp','OLED','86.74 %','Huawei Kirin 990','- 2.86 GHz',8,'Mali-G76 MP16','8 Go','3800 mAh','32 Mpx','4K','USB-C',1,'802.11a/b/g/n/ac','5.0',1,'IP53',1,0,0),(17,17,'Apple','IOS',1,0,0,0,0,'150.9 x 75.7 x 8.3 mm','194 g','6.1 pouces','1792 x 828 px','326 ppp','IPS','80.37 %','Apple A12 Bionic','2 x Vortex + 4 x Tempest -',6,'Apple GPU','3 Go','2942 mAh','7 Mpx','Full HD','Lightning',0,'802.11a/b/g/n/ac','5.0',1,'IP67',1,1,0),(18,18,'Xiaomi','Android',1,0,1,0,0,'165.8 x 76.7 x 8.8 mm','209 g','6.67 pouces','2400 x 1080 px','395 ppp','IPS','84.8 %','Snapdragon 720G','Kryo 465 Gold & Kryo 465 Silver - 2.3 GHz',8,'Adreno 618','6 Go','5020 mAh','16 Mpx','4K','USB-C',1,'802.11a/b/g/n/ac','5.0',1,'IP68',1,0,0),(19,19,'Samsung','Android',1,0,0,0,0,'163.7 x 75.3 x 8.9 mm','192 g','6.5 pouces','1600 x 720 px','270 ppp','IPS','83.09 %','Exynos 850','ARM Cortex-A55 - 2 GHz',8,'Mali-G52','3 Go','5000 mAh','13 Mpx','Full HD','USB-C',1,'802.11a/b/g/n/ac','5.0',1,'IP67',1,0,0),(20,20,'Apple','IOS',1,0,0,0,0,'158.4 x 78.1 x 7.5 mm','202 g','5.5 pouces','1920 x 1080 px','401 ppp','IPS','67.68 %','Apple A11 Bionic','2 Monsoon + 4 Mistral -',6,'Apple 3-cores','3 Go','2691 mAh','7 Mpx','4K','Lightning',1,'802.11a/b/g/n/ac','5.0',0,'IP67',1,1,0),(21,21,'Wiko','Android',1,0,1,0,0,'165.95 x 76.84 x 9.3 mm','203 g','6.55 pouces','1600 x 720 px','295 ppp','IPS','81.55 %','Helio P35','ARM Cortex-A53 -',8,'PowerVR GE8320','4 Go','5000 mAh','8 Mpx','Full HD','USB-C',1,'802.11bgn','5.0',0,'IP67',1,0,0),(22,22,'Apple','IOS',1,0,0,0,0,'150.9 x 75.7 x 8.3 mm','194 g','6.1 pouces','1792 x 828 px','326 ppp','IPS','80.37 %','Apple A12 Bionic','2 x Vortex + 4 x Tempest -',6,'Apple GPU','3 Go','2942 mAh','7 Mpx','Full HD','Lightning',0,'802.11a/b/g/n/ac','5.0',1,'IP67',1,1,0),(23,23,'Xiaomi','Android',1,0,1,0,0,'159.21 x 75.21 x 8.1 mm','185 g','6.3 pouces','1080 x 2340 px','409 ppp','LTPS','81.71 %','Snapdragon 660','Kryo 260 - 2.2 GHz',8,'Adreno 512','4 Go','4000 mAh','13 Mpx','4K','USB-C',1,'802.11a/b/g/n/ac','5.0',0,'IP67',1,0,0),(24,24,'Apple','IOS',1,1,0,0,1,'146.7 x 71.5 x 7.4 mm','189 g','6.1 pouces','2532 x 1170 px','460 ppp','OLED','87.57 %','Apple A14 Bionic','2 x Vortex + 4 x Tempest -',8,'Adreno 512','6 Go','2942 mAh','12 Mpx','4K','Lightning',0,'Wi-Fi 6 802.11ax','5.1',1,'IP68',1,1,0),(25,25,'Samsung','Android',1,1,1,0,0,'161.6 x 75.2 x 8.3 mm','192 g','6.7 pouces','2400 x 1080 px','393 ppp','Super Amoled','89.55 %','Exynos 990','2 x Mongoose M5 + 2 x Cortex-A76 + 4 x Cortex-A55 - 2.73 GHz',8,'Mali-G77 MP11','8 Go','4300 mAh','10 Mpx','8K','USB-C',1,'Wi-Fi 6 802.11ax','5.0',1,'IP68',1,1,0),(26,26,'Apple','IOS',1,0,0,0,0,'138.4 x 67.3 x 7.3 mm','148 g','4.7 pouces','1334 x 750 px','326 ppp','IPS','65.72 %','Apple A13 Bionic','2 x Lightning + 4 x Thunder - 2.65 GHz',6,'Apple GPU','3 Go','1821 mAh','7 Mpx','4K','Lightning',1,'Wi-Fi 6 802.11ax','5.0',1,'IP67',1,1,0);
/*!40000 ALTER TABLE `fonctionnalite` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-11-25 12:21:39
