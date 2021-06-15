/*
 Navicat Premium Data Transfer

 Source Server         : localhost_3306
 Source Server Type    : MySQL
 Source Server Version : 80022
 Source Host           : localhost:3306
 Source Schema         : springcloud_test01

 Target Server Type    : MySQL
 Target Server Version : 80022
 File Encoding         : 65001

 Date: 28/12/2020 17:10:29
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

CREATE DATABASE springcloud_test01_db2;

USE springcloud_test01_db2;

-- ----------------------------
-- Table structure for dept
-- ----------------------------
DROP TABLE IF EXISTS `dept`;
CREATE TABLE `dept`  (
                         `dnum` bigint(0) NOT NULL AUTO_INCREMENT,
                         `dname` varchar(60) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
                         `db_source` varchar(60) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
                         PRIMARY KEY (`dnum`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 8 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '部门表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of dept
-- ----------------------------
INSERT INTO `dept` VALUES (1, '开发部', 'springcloud_test01');
INSERT INTO `dept` VALUES (2, '人事部', 'springcloud_test01');
INSERT INTO `dept` VALUES (3, '财务部', 'springcloud_test01');
INSERT INTO `dept` VALUES (4, '市场部', 'springcloud_test01');
INSERT INTO `dept` VALUES (5, '运维部', 'springcloud_test01');

SET FOREIGN_KEY_CHECKS = 1;
