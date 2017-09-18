-- MySQL dump 10.13  Distrib 5.7.17, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: hsc_front
-- ------------------------------------------------------
-- Server version	5.7.18-log

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
-- Table structure for table `tbl_country`
--

DROP TABLE IF EXISTS `tbl_country`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tbl_country` (
  `id` varchar(100) NOT NULL,
  `name` varchar(100) NOT NULL,
  `title` varchar(200) NOT NULL,
  `text` varchar(400) NOT NULL,
  `flag` varchar(200) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_country`
--

LOCK TABLES `tbl_country` WRITE;
/*!40000 ALTER TABLE `tbl_country` DISABLE KEYS */;
INSERT INTO `tbl_country` VALUES ('hungary','헝가리','사랑에 빠지는 곳,<br>부다페스트','감성 충만, 세계에서 가장 아름다운<br>야경을 보고 싶다면 부다페스트로','./img/flag/hungary.png'),('jeju','제주도','가족과 함께하는<br>제주도 여행','사랑하는 가족과 함께<br>마음 따뜻한 여행기','./img/flag/kor.png'),('saipan','사이판','남태평양의 보석,<br>사이판','바캉스의 상징, 남태평양의<br>푸른 낙원 사이판으로 떠나보자','./img/flag/usa.png');
/*!40000 ALTER TABLE `tbl_country` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbl_diary`
--

DROP TABLE IF EXISTS `tbl_diary`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tbl_diary` (
  `id` varchar(100) NOT NULL,
  `title` varchar(200) NOT NULL,
  `text` varchar(500) DEFAULT NULL,
  `img` varchar(200) NOT NULL,
  `each` varchar(45) DEFAULT NULL,
  `like` int(11) DEFAULT NULL,
  `member_uid` varchar(100) NOT NULL,
  `country_id` varchar(100) NOT NULL,
  PRIMARY KEY (`id`,`member_uid`,`country_id`),
  KEY `fk_tbl_diary_tbl_member_idx` (`member_uid`),
  KEY `fk_tbl_diary_tbl_country1_idx` (`country_id`),
  CONSTRAINT `fk_tbl_diary_tbl_country1` FOREIGN KEY (`country_id`) REFERENCES `tbl_country` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_tbl_diary_tbl_member` FOREIGN KEY (`member_uid`) REFERENCES `tbl_member` (`uid`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_diary`
--

LOCK TABLES `tbl_diary` WRITE;
/*!40000 ALTER TABLE `tbl_diary` DISABLE KEYS */;
/*!40000 ALTER TABLE `tbl_diary` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbl_file`
--

DROP TABLE IF EXISTS `tbl_file`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tbl_file` (
  `file_id` varchar(100) NOT NULL,
  `file_path` varchar(500) NOT NULL,
  `content_type` varchar(100) NOT NULL,
  `content_length` bigint(20) NOT NULL,
  `file_name` varchar(300) DEFAULT NULL,
  PRIMARY KEY (`file_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_file`
--

LOCK TABLES `tbl_file` WRITE;
/*!40000 ALTER TABLE `tbl_file` DISABLE KEYS */;
/*!40000 ALTER TABLE `tbl_file` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbl_member`
--

DROP TABLE IF EXISTS `tbl_member`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tbl_member` (
  `uid` varchar(100) NOT NULL,
  `id` varchar(200) NOT NULL,
  `email` varchar(300) NOT NULL,
  `pwd` varchar(300) NOT NULL,
  `regist_dt` varchar(300) NOT NULL,
  `regist_by` varchar(100) DEFAULT NULL,
  `user_img` varchar(200) DEFAULT NULL,
  `user_comment` varchar(500) DEFAULT NULL,
  `domain` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`uid`),
  UNIQUE KEY `email_UNIQUE` (`email`),
  UNIQUE KEY `id_UNIQUE` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_member`
--

LOCK TABLES `tbl_member` WRITE;
/*!40000 ALTER TABLE `tbl_member` DISABLE KEYS */;
/*!40000 ALTER TABLE `tbl_member` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping events for database 'hsc_front'
--

--
-- Dumping routines for database 'hsc_front'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-09-18 12:30:06
