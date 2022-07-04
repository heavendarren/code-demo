-- ----------------------------
-- Table structure for work_config
-- ----------------------------
DROP TABLE IF EXISTS `DEMO_USER`;
CREATE TABLE DEMO_USER
(
    `id`          bigint      NOT NULL AUTO_INCREMENT COMMENT '主键',
    `name`        varchar(64) NOT NULL DEFAULT '' COMMENT '姓名',
    `email`       varchar(64) NOT NULL DEFAULT '' COMMENT '邮箱',
    `code`        varchar(64) NOT NULL DEFAULT '' COMMENT '编号',
    `sex`         varchar(8)  NOT NULL DEFAULT 'MAN' COMMENT '性别',
    `birthday`    datetime    NOT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '生日',
    `phone`       varchar(32) NOT NULL DEFAULT '' COMMENT '电话',
    `age`         tinyint     NOT NULL DEFAULT 0 COMMENT '年龄',
    `id_no`       varchar(32) NOT NULL DEFAULT '' COMMENT '身份证号',
    `create_time` datetime    NOT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '创建时间',
    `create_by`   bigint      NOT NULL COMMENT '创建人id',
    `update_time` datetime    NOT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
    `update_by`   bigint      NOT NULL COMMENT '修改人id',
    `delete_flag` varchar(8)  NOT NULL DEFAULT 'YES' COMMENT '删除标记',
    PRIMARY KEY (`id`)
);





