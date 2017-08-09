-- MySQL dump 10.13  Distrib 5.7.18, for Win64 (x86_64)
--
-- Host: localhost    Database: hsc_front
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
-- Table structure for table `tbl_contents`
--

DROP TABLE IF EXISTS `tbl_contents`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tbl_contents` (
  `id` varchar(100) NOT NULL,
  `name` varchar(100) NOT NULL,
  `main_title` varchar(200) NOT NULL,
  `sub_title` varchar(400) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_contents`
--

LOCK TABLES `tbl_contents` WRITE;
/*!40000 ALTER TABLE `tbl_contents` DISABLE KEYS */;
INSERT INTO `tbl_contents` VALUES ('france','프랑스','진정한 빠리지앵<br>이 되고싶다면','와인 한 잔, 그리고 바게트와 <br>함께하는 여행기'),('hungary','헝가리','사랑에 빠지는 곳, <br>부다페스트','감성 충만, 세계에서 가장 아름다운<br>야경을 보고 싶다면 부다페스트로'),('jeju','제주도','가족과 함께하는<br>제주도 여행','사랑하는 가족과 함께 <br>마음 따뜻한 여행기');
/*!40000 ALTER TABLE `tbl_contents` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbl_submenu`
--

DROP TABLE IF EXISTS `tbl_submenu`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tbl_submenu` (
  `id` varchar(100) NOT NULL,
  `submenu_id` varchar(100) NOT NULL,
  `img` varchar(200) NOT NULL,
  `title` varchar(200) NOT NULL,
  `content` varchar(450) DEFAULT NULL,
  `user_no` int(11) NOT NULL,
  `user_id` varchar(100) NOT NULL,
  `users_img` varchar(200) NOT NULL,
  `together` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`,`submenu_id`,`user_no`,`user_id`,`users_img`),
  KEY `fk_tbl_submenu_tbl_users1_idx` (`user_no`,`user_id`,`users_img`),
  CONSTRAINT `fk_tbl_submenu_tbl_contents` FOREIGN KEY (`id`) REFERENCES `tbl_contents` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_tbl_submenu_tbl_users1` FOREIGN KEY (`user_no`, `user_id`, `users_img`) REFERENCES `tbl_users` (`user_no`, `user_id`, `img`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_submenu`
--

LOCK TABLES `tbl_submenu` WRITE;
/*!40000 ALTER TABLE `tbl_submenu` DISABLE KEYS */;
INSERT INTO `tbl_submenu` VALUES ('france','1','./img/albums/view.jpg','스물 셋, 그림속을 거닐다.','#유럽 #나홀로여행 #프랑스 #여름이야기 #전국일주',1,'중기꺼','img/user/shk.jpg',NULL),('france','2','./img/albums/france.jpg','프랑스~모로코','',3,'이지금','img/user/iu.jpg','true'),('france','3','./img/albums/eftower.jpg','Je t\'aime, Paris!','#여행을쓰자 #파리 #프랑스 #여름이야기 #유럽',2,'문뽕구','img/user/mcw.jpg',NULL),('hungary','1','./img/albums/hung1.jpg','온천의 도시 부다페스트','#부다페스트 #온천',7,'족구왕안나','img/user/hsu.jpg',NULL),('hungary','2','./img/albums/hung2.jpg','Budapest, 사랑할 수밖에 없잖아!','#유럽여행 #헝가리 #부다페스트 #Budapest #여행을쓰다',8,'호동이','img/user/khd.jpg',NULL),('hungary','3','./img/albums/hung3.jpg','여행기록2 Budapest','다페스트 #헝가리 #유럽 #유럽여행 #동유럽',3,'이지금','img/user/iu.jpg',NULL),('jeju','1','./img/albums/jeju1.jpg','엄마랑 2박3일 제주도 여행','',5,'세젤예','img/user/ireane.jpg','true'),('jeju','2','./img/albums/jeju2.jpg','1박2일 모녀여행 제주 한바퀴~','#제주 #제주도 #제주여행 #모녀여행 #제주한바퀴',4,'제니','img/user/jennie.jpg',NULL),('jeju','3','./img/albums/jeju3.jpg','떠나요. 제주도푸른밤★','#제주도 #가족여행',6,'태봉궁예','img/user/gungye.jpg',NULL);
/*!40000 ALTER TABLE `tbl_submenu` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbl_users`
--

DROP TABLE IF EXISTS `tbl_users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tbl_users` (
  `user_no` int(11) NOT NULL,
  `user_id` varchar(100) NOT NULL,
  `img` varchar(200) NOT NULL,
  `text` varchar(400) NOT NULL,
  PRIMARY KEY (`user_no`,`user_id`,`img`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_users`
--

LOCK TABLES `tbl_users` WRITE;
/*!40000 ALTER TABLE `tbl_users` DISABLE KEYS */;
INSERT INTO `tbl_users` VALUES (1,'중기꺼','img/user/shk.jpg','인생은 나처럼'),(2,'문뽕구','img/user/mcw.jpg','얼굴이 좀 크죠'),(3,'이지금','img/user/iu.jpg','오빠가 좋은걸~'),(4,'제니','img/user/jennie.jpg','마마마지막처럼 같이 여행갈래요?'),(5,'세젤예','img/user/ireane.jpg','빨간맛! 궁금해 허니!'),(6,'태봉궁예','img/user/gungye.jpg','누가 기침소리를 내었는가'),(7,'족구왕안나','img/user/hsu.jpg','오빠 나 진짜 나쁜년이니까 좋아하지마요'),(8,'호동이','img/user/khd.jpg','으랏차차!!');
/*!40000 ALTER TABLE `tbl_users` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbl_users_sub`
--

DROP TABLE IF EXISTS `tbl_users_sub`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tbl_users_sub` (
  `visited` varchar(100) NOT NULL,
  `visited_img` varchar(200) NOT NULL,
  `user_no` int(11) NOT NULL,
  `user_id` varchar(100) NOT NULL,
  `users_img` varchar(200) NOT NULL,
  PRIMARY KEY (`visited`,`user_no`,`user_id`,`users_img`),
  KEY `fk_tbl_users_sub_tbl_users1_idx` (`user_no`,`user_id`,`users_img`),
  CONSTRAINT `fk_tbl_users_sub_tbl_users1` FOREIGN KEY (`user_no`, `user_id`, `users_img`) REFERENCES `tbl_users` (`user_no`, `user_id`, `img`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_users_sub`
--

LOCK TABLES `tbl_users_sub` WRITE;
/*!40000 ALTER TABLE `tbl_users_sub` DISABLE KEYS */;
INSERT INTO `tbl_users_sub` VALUES ('china','img/flag/cn.png',2,'문뽕구','img/user/mcw.jpg'),('china','img/flag/cn.png',5,'세젤예','img/user/ireane.jpg'),('czech','img/flag/cz.png',1,'중기꺼','img/user/shk.jpg'),('czech','img/flag/cz.png',5,'세젤예','img/user/ireane.jpg'),('england','img/flag/eng.png',3,'이지금','img/user/iu.jpg'),('japan','img/flag/jpn.png',4,'제니','img/user/jennie.jpg'),('japan','img/flag/jpn.png',5,'세젤예','img/user/ireane.jpg'),('korea','img/flag/kor.png',1,'중기꺼','img/user/shk.jpg'),('korea','img/flag/kor.png',5,'세젤예','img/user/ireane.jpg'),('spain','img/flag/spain.png',3,'이지금','img/user/iu.jpg'),('turkey','img/flag/tk.png',3,'이지금','img/user/iu.jpg');
/*!40000 ALTER TABLE `tbl_users_sub` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-08-09 14:47:41
