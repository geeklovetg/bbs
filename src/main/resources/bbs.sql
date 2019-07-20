/*
 Navicat Premium Data Transfer

 Source Server         : test1
 Source Server Type    : MySQL
 Source Server Version : 50528
 Source Host           : localhost:3306
 Source Schema         : bbs

 Target Server Type    : MySQL
 Target Server Version : 50528
 File Encoding         : 65001

 Date: 20/07/2019 11:17:15
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `uid` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `password` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `email` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `phone_number` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '',
  `nickname` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`uid`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 17 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES (8, 'usertest1', 'user001', 'user001@163.com', '1864982741', NULL);
INSERT INTO `user` VALUES (9, 'test002', 'test0021', 'test002@gmail.com', '18320459623', NULL);
INSERT INTO `user` VALUES (10, '18316022336', '123456', 'geekloveloli@gmail', NULL, '123');
INSERT INTO `user` VALUES (11, '12345', '123456', 'geekloveloli@gmail', NULL, '123');
INSERT INTO `user` VALUES (12, 'GeekloveTG', '123456', 'geekloveloli@gmail', NULL, 'æå®¢æµé£');
INSERT INTO `user` VALUES (13, 'zouhan', '456123', 'zouhan@qq.com', NULL, 'é¹æ¶µ');
INSERT INTO `user` VALUES (14, 'chen123', '123456', 'chen@163.com', NULL, 'chen');
INSERT INTO `user` VALUES (15, 'Mrchen', '123456', '123@gmail.com', NULL, 'sdf');
INSERT INTO `user` VALUES (16, 'Geekidevil', '123456', 'tyskwi@sina.com', NULL, 'æ¸æµ·');

SET FOREIGN_KEY_CHECKS = 1;
