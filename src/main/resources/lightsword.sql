-- CREATE SCHEMA `lightsword` DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci ;

CREATE DATABASE  IF NOT EXISTS `lightsword` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `lightsword`;
-- MySQL dump 10.13  Distrib 5.6.24, for osx10.8 (x86_64)
--
-- Host: localhost    Database: lightsword
-- ------------------------------------------------------
-- Server version	5.7.13

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
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `http_api`
--

LOCK TABLES `http_api` WRITE;
/*!40000 ALTER TABLE `http_api` DISABLE KEYS */;
INSERT INTO `http_api` VALUES (1,'{\"conent\":\"Hello, LightSword! Now is: Fri Jun 24 00:21:06 CST 2016\"}','LightSword','2016-06-24 00:20:16','2016-06-24 00:21:06',1,'GET','HelloLightSword','光剑','{}',3,1,'http://127.0.0.1:8888/hello');
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
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `http_report`
--

LOCK TABLES `http_report` WRITE;
/*!40000 ALTER TABLE `http_report` DISABLE KEYS */;
INSERT INTO `http_report` VALUES (1,0,1,'Sword',1,'2016-06-24 00:20:26'),(2,0,1,'Sword',1,'2016-06-24 00:21:06');
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
INSERT INTO `http_suite` VALUES (1,'Sword');
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

-- Dump completed on 2016-06-24  0:22:25