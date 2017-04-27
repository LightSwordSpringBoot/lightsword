CREATE DATABASE  IF NOT EXISTS `lightsword` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `lightsword`;
-- MySQL dump 10.13  Distrib 5.7.9, for osx10.9 (x86_64)
--
-- Host: localhost    Database: lightsword
-- ------------------------------------------------------
-- Server version	5.7.11

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `http_api`
--

DROP TABLE IF EXISTS `http_api`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `http_api` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `actual_output` varchar(255) DEFAULT NULL,
  `expect_output` varchar(255) DEFAULT NULL,
  `gmt_create` datetime DEFAULT NULL,
  `gmt_modify` datetime DEFAULT NULL,
  `http_suite_id` int(11) DEFAULT NULL,
  `method` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `owner` varchar(255) DEFAULT NULL,
  `param_json_str` varchar(255) DEFAULT NULL,
  `run_times` int(11) DEFAULT NULL,
  `state` int(11) DEFAULT NULL,
  `url` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `http_api`
--

LOCK TABLES `http_api` WRITE;
/*!40000 ALTER TABLE `http_api` DISABLE KEYS */;
INSERT INTO `http_api` VALUES (1,'{\"content\":\"Hello, ! Now is: Thu Aug 25 18:03:28 CST 2016\"}','Hello','2016-06-27 13:23:18','2016-08-25 18:03:28',1,'GET','HelloSB测试','陈光剑','{}',28,1,'http://localhost:8888/hello'),(2,'{\"content\":\"Hello, ! Now is: Thu Aug 25 18:03:28 CST 2016\"}','Now is','2016-08-24 20:40:30','2016-08-25 18:03:28',1,'GET','HelloSB测试','陈光剑','{}',18,1,'http://localhost:8888/hello'),(3,'{\"content\":\"Hello, ! Now is: Thu Aug 25 18:03:28 CST 2016\"}','!','2016-08-24 20:41:47','2016-08-25 18:03:28',1,'GET','Hello_!_Test','光剑','{}',16,1,'http://localhost:8888/hello'),(4,'{\"content\":\"Hello, ! Now is: Thu Aug 25 18:03:28 CST 2016\"}','\"content\":\"Hello, ! Now is','2016-08-24 20:45:24','2016-08-25 18:03:28',1,'GET','HelloSB测试','陈光剑','{}',14,1,'http://localhost:8888/hello'),(5,'{\"content\":\"Hello, ! Now is: Thu Aug 25 18:03:28 CST 2016\"}','Hello','2016-08-25 16:54:44','2016-08-25 18:03:28',1,'GET','HelloSB测试','陈光剑','{}',10,1,'http://localhost:8888/hello'),(6,'{\"content\":\"Hello, ! Now is: Thu Aug 25 18:03:28 CST 2016\"}','Now is','2016-08-25 17:35:01','2016-08-25 18:03:28',1,'GET','HelloSB测试','陈光剑','{}',8,1,'http://localhost:8888/hello'),(7,'{\"content\":\"Hello, ! Now is: Thu Aug 25 18:03:28 CST 2016\"}','Hello','2016-08-25 17:35:09','2016-08-25 18:03:28',1,'GET','HelloSB测试','陈光剑','{}',8,1,'http://localhost:8888/hello'),(8,'{\"content\":\"Hello, ! Now is: Thu Aug 25 18:03:28 CST 2016\"}','!','2016-08-25 17:35:16','2016-08-25 18:03:28',1,'GET','Hello_!_Test','光剑','{}',8,1,'http://localhost:8888/hello'),(9,'{\"content\":\"Hello, ! Now is: Thu Aug 25 18:03:28 CST 2016\"}','Hello','2016-08-25 17:35:22','2016-08-25 18:03:28',1,'GET','HelloSB测试','陈光剑','{}',8,1,'http://localhost:8888/hello'),(10,'{\"content\":\"Hello, ! Now is: Thu Aug 25 18:03:28 CST 2016\"}','XXXX','2016-08-25 17:36:09','2016-08-25 18:03:28',1,'GET','HelloSB测试','陈光剑','{}',5,0,'http://localhost:8888/hello'),(11,'{\"content\":\"Hello, ! Now is: Thu Aug 25 18:03:28 CST 2016\"}','Thu Aug 25 17:36:18','2016-08-25 17:36:29','2016-08-25 18:03:28',1,'GET','HelloSB测试','陈光剑','{}',5,0,'http://localhost:8888/hello'),(12,'{\"content\":\"Hello, ! Now is: Thu Aug 25 18:03:28 CST 2016\"}','QQQQQQ','2016-08-25 17:36:50','2016-08-25 18:03:28',1,'GET','HelloSB测试','陈光剑','{}',3,0,'http://localhost:8888/hello'),(13,'{\"content\":\"Hello, ! Now is: Thu Aug 25 18:03:28 CST 2016\"}','XXXX','2016-08-25 18:03:00','2016-08-25 18:03:28',1,'GET','HelloSB测试','陈光剑','{}',2,0,'http://localhost:8888/hello'),(14,'{\"content\":\"Hello, ! Now is: Thu Aug 25 18:03:28 CST 2016\"}','XXXX','2016-08-25 18:03:06','2016-08-25 18:03:28',1,'GET','HelloSB测试','陈光剑','{}',2,0,'http://localhost:8888/hello'),(15,'{\"content\":\"Hello, ! Now is: Thu Aug 25 18:03:28 CST 2016\"}','XXXX','2016-08-25 18:03:10','2016-08-25 18:03:28',1,'GET','HelloSB测试','陈光剑','{}',2,0,'http://localhost:8888/hello'),(16,'{\"content\":\"Hello, ! Now is: Thu Aug 25 18:03:28 CST 2016\"}','XXXX','2016-08-25 18:03:15','2016-08-25 18:03:28',1,'GET','HelloSB测试','陈光剑','{}',2,0,'http://localhost:8888/hello');
/*!40000 ALTER TABLE `http_api` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `http_report`
--

DROP TABLE IF EXISTS `http_report`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `http_report` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `fail` int(11) DEFAULT NULL,
  `http_suite_id` int(11) DEFAULT NULL,
  `http_suite_name` varchar(255) DEFAULT NULL,
  `pass` int(11) DEFAULT NULL,
  `time` datetime DEFAULT NULL,
  `rate` double NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=20 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `http_report`
--

LOCK TABLES `http_report` WRITE;
/*!40000 ALTER TABLE `http_report` DISABLE KEYS */;
INSERT INTO `http_report` VALUES (1,0,1,'LS测试007',1,'2016-08-23 13:49:19',100),(2,0,1,'LS测试007',2,'2016-08-24 20:40:36',100),(3,0,1,'LS测试007',2,'2016-08-24 20:40:41',100),(4,0,1,'LS测试007',3,'2016-08-24 20:41:50',100),(5,0,1,'LS测试007',3,'2016-08-24 20:41:55',100),(6,1,1,'LS测试007',3,'2016-08-24 20:45:27',85.7),(7,0,1,'LS测试007',4,'2016-08-24 20:45:59',100),(8,0,1,'LS测试007',4,'2016-08-25 14:24:05',100),(9,0,1,'LS测试007',4,'2016-08-25 14:24:09',100),(10,0,1,'LS测试007',5,'2016-08-25 16:54:47',100),(11,0,1,'LS测试007',5,'2016-08-25 16:54:51',100),(12,0,1,'LS测试007',9,'2016-08-25 17:35:24',100),(13,0,1,'LS测试007',9,'2016-08-25 17:35:29',100),(14,0,1,'LS测试007',9,'2016-08-25 17:35:34',100),(15,2,1,'LS测试007',9,'2016-08-25 17:36:32',90),(16,2,1,'LS测试007',9,'2016-08-25 17:36:36',88),(17,3,1,'LS测试007',9,'2016-08-25 17:36:52',90),(18,7,1,'LS测试007',9,'2016-08-25 18:03:20',56.25),(19,7,1,'LS测试007',9,'2016-08-25 18:03:28',56.25);
/*!40000 ALTER TABLE `http_report` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `http_suite`
--

DROP TABLE IF EXISTS `http_suite`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `http_suite` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `http_suite`
--

LOCK TABLES `http_suite` WRITE;
/*!40000 ALTER TABLE `http_suite` DISABLE KEYS */;
INSERT INTO `http_suite` VALUES (1,'LS测试007');
/*!40000 ALTER TABLE `http_suite` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2016-08-25 20:10:00
