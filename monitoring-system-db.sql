-- MySQL dump 10.13  Distrib 8.0.23, for Win64 (x86_64)
--
-- Host: localhost    Database: monitoring-system
-- ------------------------------------------------------
-- Server version	8.0.23

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
-- Table structure for table `battle`
--

DROP TABLE IF EXISTS `battle`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `battle` (
  `t_id` int NOT NULL AUTO_INCREMENT,
  `end_time` datetime(6) NOT NULL,
  `start_date` date NOT NULL,
  `start_time` time NOT NULL,
  `winner_team` varchar(255) DEFAULT NULL,
  `level_id` int DEFAULT NULL,
  PRIMARY KEY (`t_id`),
  KEY `FK1a217y3wvi4mx3utb9sdb9h0r` (`level_id`),
  CONSTRAINT `FK1a217y3wvi4mx3utb9sdb9h0r` FOREIGN KEY (`level_id`) REFERENCES `level` (`level_id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `battle`
--

LOCK TABLES `battle` WRITE;
/*!40000 ALTER TABLE `battle` DISABLE KEYS */;
INSERT INTO `battle` VALUES (1,'2021-04-20 00:00:00.000000','2019-06-01','00:00:00','AAA',1),(2,'2021-04-20 00:00:00.000000','2019-07-01','00:00:00','BBB',1),(3,'2021-04-20 00:00:00.000000','2019-08-01','00:00:00','CCC',1),(4,'2021-04-20 00:00:00.000000','2019-09-01','00:00:00','DDD',1),(5,'2021-04-20 00:00:00.000000','2019-10-01','00:00:00','EEE',1),(6,'2021-04-20 00:00:00.000000','2019-11-01','00:00:00','FFF',1),(7,'2021-04-20 00:00:00.000000','2019-12-01','00:00:00','GGG',1),(8,'2021-04-20 00:00:00.000000','2019-12-01','00:00:00','HHH',1);
/*!40000 ALTER TABLE `battle` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `coach`
--

DROP TABLE IF EXISTS `coach`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `coach` (
  `id` int NOT NULL,
  PRIMARY KEY (`id`),
  CONSTRAINT `FKese9q57g6xywljvlyjddtfrlj` FOREIGN KEY (`id`) REFERENCES `member` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `coach`
--

LOCK TABLES `coach` WRITE;
/*!40000 ALTER TABLE `coach` DISABLE KEYS */;
/*!40000 ALTER TABLE `coach` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `level`
--

DROP TABLE IF EXISTS `level`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `level` (
  `level_id` int NOT NULL AUTO_INCREMENT,
  `level_name` varchar(255) NOT NULL,
  PRIMARY KEY (`level_id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `level`
--

LOCK TABLES `level` WRITE;
/*!40000 ALTER TABLE `level` DISABLE KEYS */;
INSERT INTO `level` VALUES (1,'A'),(2,'B'),(3,'C'),(4,'D');
/*!40000 ALTER TABLE `level` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `member`
--

DROP TABLE IF EXISTS `member`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `member` (
  `id` int NOT NULL AUTO_INCREMENT,
  `min` varchar(255) DEFAULT NULL,
  `active` tinyint DEFAULT NULL,
  `age` int DEFAULT NULL,
  `first_name` varchar(255) DEFAULT NULL,
  `last_name` varchar(255) DEFAULT NULL,
  `team_id` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKcjte2jn9pvo9ud2hyfgwcja0k` (`team_id`),
  CONSTRAINT `FKcjte2jn9pvo9ud2hyfgwcja0k` FOREIGN KEY (`team_id`) REFERENCES `team` (`team_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `member`
--

LOCK TABLES `member` WRITE;
/*!40000 ALTER TABLE `member` DISABLE KEYS */;
/*!40000 ALTER TABLE `member` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `member_analytics`
--

DROP TABLE IF EXISTS `member_analytics`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `member_analytics` (
  `ma_id` int NOT NULL AUTO_INCREMENT,
  `min` varchar(255) NOT NULL,
  `score` varchar(255) DEFAULT NULL,
  `ta_id` int DEFAULT NULL,
  PRIMARY KEY (`ma_id`),
  UNIQUE KEY `UK_a5rfiqafdjg0xarormc96m3jj` (`min`),
  KEY `FKg55ccmg37cnefj4aji2v1u492` (`ta_id`),
  CONSTRAINT `FKg55ccmg37cnefj4aji2v1u492` FOREIGN KEY (`ta_id`) REFERENCES `team_analytic` (`ta_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `member_analytics`
--

LOCK TABLES `member_analytics` WRITE;
/*!40000 ALTER TABLE `member_analytics` DISABLE KEYS */;
/*!40000 ALTER TABLE `member_analytics` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `player`
--

DROP TABLE IF EXISTS `player`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `player` (
  `height` float DEFAULT NULL,
  `weight` float DEFAULT NULL,
  `id` int NOT NULL,
  PRIMARY KEY (`id`),
  CONSTRAINT `FK9rslpgmrg15jy9blpxffwghxn` FOREIGN KEY (`id`) REFERENCES `member` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `player`
--

LOCK TABLES `player` WRITE;
/*!40000 ALTER TABLE `player` DISABLE KEYS */;
/*!40000 ALTER TABLE `player` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `role`
--

DROP TABLE IF EXISTS `role`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `role` (
  `id` int NOT NULL AUTO_INCREMENT,
  `role_name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `role`
--

LOCK TABLES `role` WRITE;
/*!40000 ALTER TABLE `role` DISABLE KEYS */;
INSERT INTO `role` VALUES (1,'ROLE_ADMIN'),(2,'ROLE_COACH'),(3,'ROLE_PLAYER'),(4,'ROLE_PLAYER'),(5,'ROLE_PLAYER');
/*!40000 ALTER TABLE `role` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `role_user`
--

DROP TABLE IF EXISTS `role_user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `role_user` (
  `user_id` int NOT NULL,
  `role_id` int NOT NULL,
  KEY `FKiqpmjd2qb4rdkej916ymonic6` (`role_id`),
  KEY `FK4320p8bgvumlxjkohtbj214qi` (`user_id`),
  CONSTRAINT `FK4320p8bgvumlxjkohtbj214qi` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`),
  CONSTRAINT `FKiqpmjd2qb4rdkej916ymonic6` FOREIGN KEY (`role_id`) REFERENCES `role` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `role_user`
--

LOCK TABLES `role_user` WRITE;
/*!40000 ALTER TABLE `role_user` DISABLE KEYS */;
INSERT INTO `role_user` VALUES (1,1),(2,2),(3,3),(4,4),(5,5);
/*!40000 ALTER TABLE `role_user` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `team`
--

DROP TABLE IF EXISTS `team`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `team` (
  `team_id` int NOT NULL AUTO_INCREMENT,
  `active` tinyint DEFAULT NULL,
  `tin` varchar(255) NOT NULL,
  `owner_name` varchar(255) DEFAULT NULL,
  `start_date` date DEFAULT NULL,
  `name` varchar(255) NOT NULL,
  PRIMARY KEY (`team_id`),
  UNIQUE KEY `UK_g2l9qqsoeuynt4r5ofdt1x2td` (`name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `team`
--

LOCK TABLES `team` WRITE;
/*!40000 ALTER TABLE `team` DISABLE KEYS */;
/*!40000 ALTER TABLE `team` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `team_analytic`
--

DROP TABLE IF EXISTS `team_analytic`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `team_analytic` (
  `ta_id` int NOT NULL AUTO_INCREMENT,
  `tin` varchar(255) DEFAULT NULL,
  `team_name` varchar(255) DEFAULT NULL,
  `score` double DEFAULT NULL,
  `t_id` int DEFAULT NULL,
  PRIMARY KEY (`ta_id`),
  KEY `FKoi8ipthbqir881mv566q90qdw` (`t_id`),
  CONSTRAINT `FKoi8ipthbqir881mv566q90qdw` FOREIGN KEY (`t_id`) REFERENCES `battle` (`t_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `team_analytic`
--

LOCK TABLES `team_analytic` WRITE;
/*!40000 ALTER TABLE `team_analytic` DISABLE KEYS */;
/*!40000 ALTER TABLE `team_analytic` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `token_store`
--

DROP TABLE IF EXISTS `token_store`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `token_store` (
  `token_id` int NOT NULL AUTO_INCREMENT,
  `enable` bit(1) DEFAULT NULL,
  `jwt_token` varchar(255) DEFAULT NULL,
  `login_date` datetime(6) DEFAULT NULL,
  `logout_date` datetime(6) DEFAULT NULL,
  `session_id` varchar(255) DEFAULT NULL,
  `time_spent` float DEFAULT NULL,
  `user_name` varchar(255) DEFAULT NULL,
  `user_id` int DEFAULT NULL,
  PRIMARY KEY (`token_id`),
  KEY `FK618bw15s4shrew372bjircqm3` (`user_id`),
  CONSTRAINT `FK618bw15s4shrew372bjircqm3` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `token_store`
--

LOCK TABLES `token_store` WRITE;
/*!40000 ALTER TABLE `token_store` DISABLE KEYS */;
INSERT INTO `token_store` VALUES (1,_binary '','eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJ1c2VyMSIsImV4cCI6MTYyMDI0MjM4OSwiaWF0IjoxNjIwMjA2Mzg5LCJqdGkiOiJlM2QyZTgxMy1lY2RmLTQwY2EtYTQ5Zi0zOThiOGEwNTBlMzgifQ.RgPEOVfsmgLIjnCfvwWOZA1ZkB7EoI5B1AhBmrB451w','2021-05-05 09:19:50.144000',NULL,'e3d2e813-ecdf-40ca-a49f-398b8a050e38',0,'user1',NULL),(2,_binary '','eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJ1c2VyMiIsImV4cCI6MTYyMDI0MjM5NSwiaWF0IjoxNjIwMjA2Mzk1LCJqdGkiOiJlNDU5NGQwNy05ZGM3LTRlMDUtYTY1Zi05NTVhMjVmY2UyNGEifQ.soEg-4XDIeZXCPlBUyZ14yEjch9yPx39ABflgaBoXRo','2021-05-05 09:19:55.804000',NULL,'e4594d07-9dc7-4e05-a65f-955a25fce24a',0,'user2',NULL),(3,_binary '','eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJ1c2VyMyIsImV4cCI6MTYyMDI0MjQwMiwiaWF0IjoxNjIwMjA2NDAyLCJqdGkiOiJiYTQ2NjhjOS03OWFjLTRjYWQtOTYwZS0yZGIzMzljNGE0ZjAifQ.4jDa6pL0AJoCnJrEdlW8zsmv1bZc5bTmNTL3RL0s3vI','2021-05-05 09:20:02.335000',NULL,'ba4668c9-79ac-4cad-960e-2db339c4a4f0',0,'user3',NULL),(4,_binary '\0','eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJ1c2VyNCIsImV4cCI6MTYyMDI0MjQwNywiaWF0IjoxNjIwMjA2NDA3LCJqdGkiOiI1OGU1OTM4ZC1mMGFiLTRlMmQtOTRjZS03YmM5MTNjNzVjMDkifQ.FW3LRgPXlGTGZYZR_lOmWIYC1daZ2LOYmQlD2zYUKBk','2021-05-05 09:20:07.074000','2021-05-05 09:21:39.718000','58e5938d-f0ab-4e2d-94ce-7bc913c75c09',92,'user4',NULL),(5,_binary '\0','eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJ1c2VyNSIsImV4cCI6MTYyMDI0MjQxNCwiaWF0IjoxNjIwMjA2NDE0LCJqdGkiOiIzMzMzNzMzYS04NTc1LTQyNDgtOGJlMi0zOGJmMDVkZWRlZjgifQ.uAlz0gWBrIv4ZDbwJdxr-WztW0XuljcPYUSrMIiMQAw','2021-05-05 09:20:14.669000','2021-05-05 09:22:00.766000','3333733a-8575-4248-8be2-38bf05dedef8',106,'user5',NULL);
/*!40000 ALTER TABLE `token_store` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `user` (
  `id` int NOT NULL AUTO_INCREMENT,
  `email` varchar(255) DEFAULT NULL,
  `is_active` bit(1) DEFAULT NULL,
  `is_enable` bit(1) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `user_name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES (1,'user1@gmail.com',_binary '',_binary '','1qaz2wsx@','user1'),(2,'user2@gmail.com',_binary '',_binary '','1qaz2wsx@','user2'),(3,'user3@gmail.com',_binary '',_binary '','1qaz2wsx@','user3'),(4,'user4@gmail.com',_binary '\0',_binary '','1qaz2wsx@','user4'),(5,'user5@gmail.com',_binary '\0',_binary '','1qaz2wsx@','user5');
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping events for database 'monitoring-system'
--

--
-- Dumping routines for database 'monitoring-system'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-05-05 15:01:05
