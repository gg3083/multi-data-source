/*
Navicat MySQL Data Transfer

Source Server         : 118.25.11.28_master
Source Server Version : 50728
Source Host           : 118.25.11.28:3307
Source Database       : mysql_test

Target Server Type    : MYSQL
Target Server Version : 50728
File Encoding         : 65001

Date: 2019-10-18 15:32:58
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for t_name
-- ----------------------------
DROP TABLE IF EXISTS `t_name`;
CREATE TABLE `t_name` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;
