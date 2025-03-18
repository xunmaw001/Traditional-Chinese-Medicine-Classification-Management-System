-- MySQL dump 10.13  Distrib 5.7.31, for Linux (x86_64)
--
-- Host: localhost    Database: ssmi9m34
-- ------------------------------------------------------
-- Server version	5.7.31

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
-- Table structure for table `baosun`
--

DROP TABLE IF EXISTS `baosun`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `baosun` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `bianhao` varchar(200) DEFAULT NULL COMMENT '编号',
  `yaocaimingcheng` varchar(200) DEFAULT NULL COMMENT '药材名称',
  `yaocaizhonglei` varchar(200) DEFAULT NULL COMMENT '药材种类',
  `gongyingshangmingcheng` varchar(200) DEFAULT NULL COMMENT '供应商名称',
  `shuliang` int(11) DEFAULT NULL COMMENT '数量',
  `cunchucangwei` varchar(200) DEFAULT NULL COMMENT '存储仓位',
  `shijian` datetime DEFAULT NULL COMMENT '时间',
  `yuangonggonghao` varchar(200) DEFAULT NULL COMMENT '员工工号',
  `yuangongxingming` varchar(200) DEFAULT NULL COMMENT '员工姓名',
  `chulizhuangtai` varchar(200) DEFAULT NULL COMMENT '处理状态',
  `beizhu` longtext COMMENT '备注',
  PRIMARY KEY (`id`),
  UNIQUE KEY `bianhao` (`bianhao`)
) ENGINE=InnoDB AUTO_INCREMENT=1614966076975 DEFAULT CHARSET=utf8 COMMENT='报损';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `baosun`
--

LOCK TABLES `baosun` WRITE;
/*!40000 ALTER TABLE `baosun` DISABLE KEYS */;
INSERT INTO `baosun` VALUES (71,'2021-03-05 17:20:27','编号1','药材名称1','药材种类1','供应商名称1',1,'存储仓位1','2021-03-06 01:20:27','员工工号1','员工姓名1','已处理','备注1'),(72,'2021-03-05 17:20:27','编号2','药材名称2','药材种类2','供应商名称2',2,'存储仓位2','2021-03-06 01:20:27','员工工号2','员工姓名2','已处理','备注2'),(73,'2021-03-05 17:20:27','编号3','药材名称3','药材种类3','供应商名称3',3,'存储仓位3','2021-03-06 01:20:27','员工工号3','员工姓名3','已处理','备注3'),(74,'2021-03-05 17:20:27','编号4','药材名称4','药材种类4','供应商名称4',4,'存储仓位4','2021-03-06 01:20:27','员工工号4','员工姓名4','已处理','备注4'),(75,'2021-03-05 17:20:27','编号5','药材名称5','药材种类5','供应商名称5',5,'存储仓位5','2021-03-06 01:20:27','员工工号5','员工姓名5','已处理','备注5'),(76,'2021-03-05 17:20:27','编号6','药材名称6','药材种类6','供应商名称6',6,'存储仓位6','2021-03-06 01:20:27','员工工号6','员工姓名6','已处理','备注6'),(1614966076974,'2021-03-05 17:41:16','202136141567737602','药材名称1','药材种类1','供应商名称1',12,'存储仓位1','2021-03-06 01:41:13','员工1','员工姓名1','已处理','<p>请输入备注</p>');
/*!40000 ALTER TABLE `baosun` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `caigou`
--

DROP TABLE IF EXISTS `caigou`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `caigou` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `bianhao` varchar(200) DEFAULT NULL COMMENT '编号',
  `yaocaimingcheng` varchar(200) DEFAULT NULL COMMENT '药材名称',
  `yaocaizhonglei` varchar(200) DEFAULT NULL COMMENT '药材种类',
  `gongyingshangmingcheng` varchar(200) DEFAULT NULL COMMENT '供应商名称',
  `shuliang` int(11) DEFAULT NULL COMMENT '数量',
  `cunchucangwei` varchar(200) DEFAULT NULL COMMENT '存储仓位',
  `shijian` datetime DEFAULT NULL COMMENT '时间',
  `yuangonggonghao` varchar(200) DEFAULT NULL COMMENT '员工工号',
  `yuangongxingming` varchar(200) DEFAULT NULL COMMENT '员工姓名',
  `chulizhuangtai` varchar(200) DEFAULT NULL COMMENT '处理状态',
  `beizhu` longtext COMMENT '备注',
  PRIMARY KEY (`id`),
  UNIQUE KEY `bianhao` (`bianhao`)
) ENGINE=InnoDB AUTO_INCREMENT=1614966060059 DEFAULT CHARSET=utf8 COMMENT='采购';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `caigou`
--

LOCK TABLES `caigou` WRITE;
/*!40000 ALTER TABLE `caigou` DISABLE KEYS */;
INSERT INTO `caigou` VALUES (81,'2021-03-05 17:20:27','编号1','药材名称1','药材种类1','供应商名称1',1,'存储仓位1','2021-03-06 01:20:27','员工工号1','员工姓名1','已处理','备注1'),(82,'2021-03-05 17:20:27','编号2','药材名称2','药材种类2','供应商名称2',2,'存储仓位2','2021-03-06 01:20:27','员工工号2','员工姓名2','已处理','备注2'),(83,'2021-03-05 17:20:27','编号3','药材名称3','药材种类3','供应商名称3',3,'存储仓位3','2021-03-06 01:20:27','员工工号3','员工姓名3','已处理','备注3'),(84,'2021-03-05 17:20:27','编号4','药材名称4','药材种类4','供应商名称4',4,'存储仓位4','2021-03-06 01:20:27','员工工号4','员工姓名4','已处理','备注4'),(85,'2021-03-05 17:20:27','编号5','药材名称5','药材种类5','供应商名称5',5,'存储仓位5','2021-03-06 01:20:27','员工工号5','员工姓名5','已处理','备注5'),(86,'2021-03-05 17:20:27','编号6','药材名称6','药材种类6','供应商名称6',6,'存储仓位6','2021-03-06 01:20:27','员工工号6','员工姓名6','已处理','备注6'),(1614966060058,'2021-03-05 17:40:59','2021361404612750926','药材名称1','药材种类1','供应商名称1',100,'存储仓位1','2021-03-06 01:40:54','员工1','员工姓名1','已处理','<p>请输入备注11</p>');
/*!40000 ALTER TABLE `caigou` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cangkujiancha`
--

DROP TABLE IF EXISTS `cangkujiancha`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `cangkujiancha` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `yuangonggonghao` varchar(200) DEFAULT NULL COMMENT '员工工号',
  `cangkumingcheng` varchar(200) DEFAULT NULL COMMENT '仓库名称',
  `zhuangtai` varchar(200) DEFAULT NULL COMMENT '状态',
  `shijian` datetime DEFAULT NULL COMMENT '时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1614966182162 DEFAULT CHARSET=utf8 COMMENT='仓库检查';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cangkujiancha`
--

LOCK TABLES `cangkujiancha` WRITE;
/*!40000 ALTER TABLE `cangkujiancha` DISABLE KEYS */;
INSERT INTO `cangkujiancha` VALUES (91,'2021-03-05 17:20:27','员工工号1','仓库名称1','正常','2021-03-06 01:20:27'),(92,'2021-03-05 17:20:27','员工工号2','仓库名称2','正常','2021-03-06 01:20:27'),(93,'2021-03-05 17:20:27','员工工号3','仓库名称3','正常','2021-03-06 01:20:27'),(94,'2021-03-05 17:20:27','员工工号4','仓库名称4','正常','2021-03-06 01:20:27'),(95,'2021-03-05 17:20:27','员工工号5','仓库名称5','正常','2021-03-06 01:20:27'),(96,'2021-03-05 17:20:27','员工工号6','仓库名称6','正常','2021-03-06 01:20:27'),(1614966182161,'2021-03-05 17:43:01','员工1','11','正常','2021-03-06 01:43:01');
/*!40000 ALTER TABLE `cangkujiancha` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `chuku`
--

DROP TABLE IF EXISTS `chuku`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `chuku` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `bianhao` varchar(200) DEFAULT NULL COMMENT '编号',
  `yaocaimingcheng` varchar(200) DEFAULT NULL COMMENT '药材名称',
  `yaocaizhonglei` varchar(200) DEFAULT NULL COMMENT '药材种类',
  `gongyingshangmingcheng` varchar(200) DEFAULT NULL COMMENT '供应商名称',
  `shuliang` int(11) DEFAULT NULL COMMENT '数量',
  `cunchucangwei` varchar(200) DEFAULT NULL COMMENT '存储仓位',
  `shijian` datetime DEFAULT NULL COMMENT '时间',
  `beizhu` longtext COMMENT '备注',
  `yuangonggonghao` varchar(200) DEFAULT NULL COMMENT '员工工号',
  `yuangongxingming` varchar(200) DEFAULT NULL COMMENT '员工姓名',
  PRIMARY KEY (`id`),
  UNIQUE KEY `bianhao` (`bianhao`)
) ENGINE=InnoDB AUTO_INCREMENT=1614966135171 DEFAULT CHARSET=utf8 COMMENT='出库';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `chuku`
--

LOCK TABLES `chuku` WRITE;
/*!40000 ALTER TABLE `chuku` DISABLE KEYS */;
INSERT INTO `chuku` VALUES (41,'2021-03-05 17:20:27','编号1','药材名称1','药材种类1','供应商名称1',1,'存储仓位1','2021-03-06 01:20:27','备注1','员工工号1','员工姓名1'),(42,'2021-03-05 17:20:27','编号2','药材名称2','药材种类2','供应商名称2',2,'存储仓位2','2021-03-06 01:20:27','备注2','员工工号2','员工姓名2'),(43,'2021-03-05 17:20:27','编号3','药材名称3','药材种类3','供应商名称3',3,'存储仓位3','2021-03-06 01:20:27','备注3','员工工号3','员工姓名3'),(44,'2021-03-05 17:20:27','编号4','药材名称4','药材种类4','供应商名称4',4,'存储仓位4','2021-03-06 01:20:27','备注4','员工工号4','员工姓名4'),(45,'2021-03-05 17:20:27','编号5','药材名称5','药材种类5','供应商名称5',5,'存储仓位5','2021-03-06 01:20:27','备注5','员工工号5','员工姓名5'),(46,'2021-03-05 17:20:27','编号6','药材名称6','药材种类6','供应商名称6',6,'存储仓位6','2021-03-06 01:20:27','备注6','员工工号6','员工姓名6'),(1614966040083,'2021-03-05 17:40:39','2021361402023721935','药材名称1','药材种类1','供应商名称1',1,'存储仓位1','2021-03-06 01:40:28','<p>请输入备注11</p>','员工1','员工姓名1'),(1614966135170,'2021-03-05 17:42:15','1614966126376','药材名称1','药材种类1','供应商名称1',12,'存储仓位1','2021-03-06 01:42:12','<p>11</p>','员工1','员工姓名1');
/*!40000 ALTER TABLE `chuku` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `config`
--

DROP TABLE IF EXISTS `config`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `config` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `name` varchar(100) NOT NULL COMMENT '配置参数名称',
  `value` varchar(100) DEFAULT NULL COMMENT '配置参数值',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8 COMMENT='配置文件';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `config`
--

LOCK TABLES `config` WRITE;
/*!40000 ALTER TABLE `config` DISABLE KEYS */;
INSERT INTO `config` VALUES (1,'picture1','http://localhost:8080/ssmi9m34/upload/picture1.jpg'),(2,'picture2','http://localhost:8080/ssmi9m34/upload/picture2.jpg'),(3,'picture3','http://localhost:8080/ssmi9m34/upload/picture3.jpg'),(6,'homepage',NULL);
/*!40000 ALTER TABLE `config` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `gongyingshang`
--

DROP TABLE IF EXISTS `gongyingshang`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `gongyingshang` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `gongyingshangbianhao` varchar(200) DEFAULT NULL COMMENT '供应商编号',
  `gongyingshangmingcheng` varchar(200) NOT NULL COMMENT '供应商名称',
  `dizhi` varchar(200) DEFAULT NULL COMMENT '地址',
  `youxiang` varchar(200) DEFAULT NULL COMMENT '邮箱',
  `lianxidianhua` varchar(200) DEFAULT NULL COMMENT '联系电话',
  `yinxingkahao` varchar(200) DEFAULT NULL COMMENT '银行卡号',
  PRIMARY KEY (`id`),
  UNIQUE KEY `gongyingshangbianhao` (`gongyingshangbianhao`)
) ENGINE=InnoDB AUTO_INCREMENT=1614966249991 DEFAULT CHARSET=utf8 COMMENT='供应商';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `gongyingshang`
--

LOCK TABLES `gongyingshang` WRITE;
/*!40000 ALTER TABLE `gongyingshang` DISABLE KEYS */;
INSERT INTO `gongyingshang` VALUES (21,'2021-03-05 17:20:27','供应商编号1','供应商名称1','地址1','邮箱1','13823888881','银行卡号1'),(22,'2021-03-05 17:20:27','供应商编号2','供应商名称2','地址2','邮箱2','13823888882','银行卡号2'),(23,'2021-03-05 17:20:27','供应商编号3','供应商名称3','地址3','邮箱3','13823888883','银行卡号3'),(24,'2021-03-05 17:20:27','供应商编号4','供应商名称4','地址4','邮箱4','13823888884','银行卡号4'),(25,'2021-03-05 17:20:27','供应商编号5','供应商名称5','地址5','邮箱5','13823888885','银行卡号5'),(26,'2021-03-05 17:20:27','供应商编号6','供应商名称6','地址6','邮箱6','13823888886','银行卡号6'),(1614966249990,'2021-03-05 17:44:09','1614966237621','11','11','11','13800138000','11');
/*!40000 ALTER TABLE `gongyingshang` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ruku`
--

DROP TABLE IF EXISTS `ruku`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `ruku` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `bianhao` varchar(200) DEFAULT NULL COMMENT '编号',
  `yaocaimingcheng` varchar(200) DEFAULT NULL COMMENT '药材名称',
  `yaocaizhonglei` varchar(200) DEFAULT NULL COMMENT '药材种类',
  `gongyingshangmingcheng` varchar(200) DEFAULT NULL COMMENT '供应商名称',
  `shuliang` int(11) DEFAULT NULL COMMENT '数量',
  `cunchucangwei` varchar(200) DEFAULT NULL COMMENT '存储仓位',
  `shijian` datetime DEFAULT NULL COMMENT '时间',
  `beizhu` longtext COMMENT '备注',
  `yuangonggonghao` varchar(200) DEFAULT NULL COMMENT '员工工号',
  `yuangongxingming` varchar(200) DEFAULT NULL COMMENT '员工姓名',
  PRIMARY KEY (`id`),
  UNIQUE KEY `bianhao` (`bianhao`)
) ENGINE=InnoDB AUTO_INCREMENT=1614966093954 DEFAULT CHARSET=utf8 COMMENT='入库';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ruku`
--

LOCK TABLES `ruku` WRITE;
/*!40000 ALTER TABLE `ruku` DISABLE KEYS */;
INSERT INTO `ruku` VALUES (61,'2021-03-05 17:20:27','编号1','药材名称1','药材种类1','供应商名称1',1,'存储仓位1','2021-03-06 01:20:27','备注1','员工工号1','员工姓名1'),(62,'2021-03-05 17:20:27','编号2','药材名称2','药材种类2','供应商名称2',2,'存储仓位2','2021-03-06 01:20:27','备注2','员工工号2','员工姓名2'),(63,'2021-03-05 17:20:27','编号3','药材名称3','药材种类3','供应商名称3',3,'存储仓位3','2021-03-06 01:20:27','备注3','员工工号3','员工姓名3'),(64,'2021-03-05 17:20:27','编号4','药材名称4','药材种类4','供应商名称4',4,'存储仓位4','2021-03-06 01:20:27','备注4','员工工号4','员工姓名4'),(65,'2021-03-05 17:20:27','编号5','药材名称5','药材种类5','供应商名称5',5,'存储仓位5','2021-03-06 01:20:27','备注5','员工工号5','员工姓名5'),(66,'2021-03-05 17:20:27','编号6','药材名称6','药材种类6','供应商名称6',6,'存储仓位6','2021-03-06 01:20:27','备注6','员工工号6','员工姓名6'),(1614966093953,'2021-03-05 17:41:33','2021361412283913173','药材名称1','药材种类1','供应商名称1',9,'存储仓位1','2021-03-06 01:41:31','<p>请输入备注11</p>','员工1','员工姓名1');
/*!40000 ALTER TABLE `ruku` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `token`
--

DROP TABLE IF EXISTS `token`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `token` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `username` varchar(100) NOT NULL COMMENT '用户名',
  `tablename` varchar(100) DEFAULT NULL COMMENT '表名',
  `role` varchar(100) DEFAULT NULL COMMENT '角色',
  `token` varchar(200) NOT NULL COMMENT '密码',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '新增时间',
  `expiratedtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '过期时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COMMENT='token表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `token`
--

LOCK TABLES `token` WRITE;
/*!40000 ALTER TABLE `token` DISABLE KEYS */;
INSERT INTO `token` VALUES (1,11,'员工1','yuangong','员工','t5np3n3cbxs05e92uombsy630p4fqxif','2021-03-05 17:30:26','2021-03-05 18:40:00'),(2,1,'abo','users','管理员','aq2iaba87fz3w777ijsss6ow68n0qkd3','2021-03-05 17:43:31','2021-03-05 18:43:31');
/*!40000 ALTER TABLE `token` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `users` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `username` varchar(100) NOT NULL COMMENT '用户名',
  `password` varchar(100) NOT NULL COMMENT '密码',
  `role` varchar(100) DEFAULT '管理员' COMMENT '角色',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '新增时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='用户表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES (1,'abo','abo','管理员','2021-03-05 17:20:27');
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `yaocaixinxi`
--

DROP TABLE IF EXISTS `yaocaixinxi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `yaocaixinxi` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `yaocaimingcheng` varchar(200) DEFAULT NULL COMMENT '药材名称',
  `yaocaizhonglei` varchar(200) DEFAULT NULL COMMENT '药材种类',
  `gongyingshangmingcheng` varchar(200) DEFAULT NULL COMMENT '供应商名称',
  `shuliang` int(11) NOT NULL COMMENT '数量',
  `cunchucangwei` varchar(200) DEFAULT NULL COMMENT '存储仓位',
  `yaocaitupian` varchar(200) DEFAULT NULL COMMENT '药材图片',
  `xiangqing` varchar(200) DEFAULT NULL COMMENT '详情',
  PRIMARY KEY (`id`),
  UNIQUE KEY `yaocaimingcheng` (`yaocaimingcheng`)
) ENGINE=InnoDB AUTO_INCREMENT=1614966274602 DEFAULT CHARSET=utf8 COMMENT='药材信息';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `yaocaixinxi`
--

LOCK TABLES `yaocaixinxi` WRITE;
/*!40000 ALTER TABLE `yaocaixinxi` DISABLE KEYS */;
INSERT INTO `yaocaixinxi` VALUES (31,'2021-03-05 17:20:27','药材名称1','药材种类1','供应商名称1',197,'存储仓位1','http://localhost:8080/ssmi9m34/upload/yaocaixinxi_yaocaitupian1.jpg','详情1'),(32,'2021-03-05 17:20:27','药材名称2','药材种类2','供应商名称2',2,'存储仓位2','http://localhost:8080/ssmi9m34/upload/yaocaixinxi_yaocaitupian2.jpg','详情2'),(33,'2021-03-05 17:20:27','药材名称3','药材种类3','供应商名称3',3,'存储仓位3','http://localhost:8080/ssmi9m34/upload/yaocaixinxi_yaocaitupian3.jpg','详情3'),(34,'2021-03-05 17:20:27','药材名称4','药材种类4','供应商名称4',4,'存储仓位4','http://localhost:8080/ssmi9m34/upload/yaocaixinxi_yaocaitupian4.jpg','详情4'),(35,'2021-03-05 17:20:27','药材名称5','药材种类5','供应商名称5',5,'存储仓位5','http://localhost:8080/ssmi9m34/upload/yaocaixinxi_yaocaitupian5.jpg','详情5'),(36,'2021-03-05 17:20:27','药材名称6','药材种类6','供应商名称6',6,'存储仓位6','http://localhost:8080/ssmi9m34/upload/yaocaixinxi_yaocaitupian6.jpg','详情6'),(1614966274601,'2021-03-05 17:44:33','11','药材种类2','11',0,'111','http://localhost:8080/ssmi9m34/upload/1614966271753.jpg','11');
/*!40000 ALTER TABLE `yaocaixinxi` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `yaocaizhonglei`
--

DROP TABLE IF EXISTS `yaocaizhonglei`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `yaocaizhonglei` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `yaocaizhonglei` varchar(200) NOT NULL COMMENT '药材种类',
  PRIMARY KEY (`id`),
  UNIQUE KEY `yaocaizhonglei` (`yaocaizhonglei`)
) ENGINE=InnoDB AUTO_INCREMENT=1614966313522 DEFAULT CHARSET=utf8 COMMENT='药材种类';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `yaocaizhonglei`
--

LOCK TABLES `yaocaizhonglei` WRITE;
/*!40000 ALTER TABLE `yaocaizhonglei` DISABLE KEYS */;
INSERT INTO `yaocaizhonglei` VALUES (51,'2021-03-05 17:20:27','药材种类1'),(52,'2021-03-05 17:20:27','药材种类2'),(53,'2021-03-05 17:20:27','药材种类3'),(54,'2021-03-05 17:20:27','药材种类4'),(55,'2021-03-05 17:20:27','药材种类5'),(56,'2021-03-05 17:20:27','6'),(1614966313521,'2021-03-05 17:45:12','7');
/*!40000 ALTER TABLE `yaocaizhonglei` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `yichangbaogaodan`
--

DROP TABLE IF EXISTS `yichangbaogaodan`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `yichangbaogaodan` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `yuangonggonghao` varchar(200) DEFAULT NULL COMMENT '员工工号',
  `biaoti` varchar(200) DEFAULT NULL COMMENT '标题',
  `leixing` varchar(200) DEFAULT NULL COMMENT '类型',
  `neirong` longtext COMMENT '内容',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1614966196001 DEFAULT CHARSET=utf8 COMMENT='异常报告单';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `yichangbaogaodan`
--

LOCK TABLES `yichangbaogaodan` WRITE;
/*!40000 ALTER TABLE `yichangbaogaodan` DISABLE KEYS */;
INSERT INTO `yichangbaogaodan` VALUES (101,'2021-03-05 17:20:27','员工工号1','标题1','短缺','内容1'),(102,'2021-03-05 17:20:27','员工工号2','标题2','短缺','内容2'),(103,'2021-03-05 17:20:27','员工工号3','标题3','短缺','内容3'),(104,'2021-03-05 17:20:27','员工工号4','标题4','短缺','内容4'),(105,'2021-03-05 17:20:27','员工工号5','标题5','短缺','内容5'),(106,'2021-03-05 17:20:27','员工工号6','标题6','短缺','内容6'),(1614966196000,'2021-03-05 17:43:15','员工1','11','短缺','<p>111</p>');
/*!40000 ALTER TABLE `yichangbaogaodan` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `yuangong`
--

DROP TABLE IF EXISTS `yuangong`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `yuangong` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `yuangonggonghao` varchar(200) NOT NULL COMMENT '员工工号',
  `mima` varchar(200) NOT NULL COMMENT '密码',
  `yuangongxingming` varchar(200) DEFAULT NULL COMMENT '员工姓名',
  `bumen` varchar(200) DEFAULT NULL COMMENT '部门',
  `xingbie` varchar(200) DEFAULT NULL COMMENT '性别',
  `nianling` int(11) DEFAULT NULL COMMENT '年龄',
  `lianxidianhua` varchar(200) DEFAULT NULL COMMENT '联系电话',
  `youxiang` varchar(200) DEFAULT NULL COMMENT '邮箱',
  `shenfenzheng` varchar(200) DEFAULT NULL COMMENT '身份证',
  `jiatingzhuzhi` varchar(200) DEFAULT NULL COMMENT '家庭住址',
  `zhaopian` varchar(200) DEFAULT NULL COMMENT '照片',
  PRIMARY KEY (`id`),
  UNIQUE KEY `yuangonggonghao` (`yuangonggonghao`)
) ENGINE=InnoDB AUTO_INCREMENT=1614966219402 DEFAULT CHARSET=utf8 COMMENT='员工';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `yuangong`
--

LOCK TABLES `yuangong` WRITE;
/*!40000 ALTER TABLE `yuangong` DISABLE KEYS */;
INSERT INTO `yuangong` VALUES (11,'2021-03-05 17:20:27','员工1','123456','员工姓名1','部门1','男',1,'13823888881','773890001@qq.com','440300199101010001','家庭住址1','照片1'),(12,'2021-03-05 17:20:27','员工2','123456','员工姓名2','部门2','男',2,'13823888882','773890002@qq.com','440300199202020002','家庭住址2','照片2'),(13,'2021-03-05 17:20:27','员工3','123456','员工姓名3','部门3','男',3,'13823888883','773890003@qq.com','440300199303030003','家庭住址3','照片3'),(14,'2021-03-05 17:20:27','员工4','123456','员工姓名4','部门4','男',4,'13823888884','773890004@qq.com','440300199404040004','家庭住址4','照片4'),(15,'2021-03-05 17:20:27','员工5','123456','员工姓名5','部门5','男',5,'13823888885','773890005@qq.com','440300199505050005','家庭住址5','照片5'),(16,'2021-03-05 17:20:27','员工6','123456','员工姓名6','部门6','男',6,'13823888886','773890006@qq.com','440300199606060006','家庭住址6','照片6'),(1614966219401,'2021-03-05 17:43:39','11','11','11','11','男',NULL,'','','','','');
/*!40000 ALTER TABLE `yuangong` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-03-07 10:34:04
