package cn.yunxiang.demo.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author wangqx
 * @description mybatis-plus配置
 * @date 2022/6/17
 */
@Configuration
@MapperScan("cn.yunxiang.demo.dao")
public class MybatisPlusConfig {

    //todo  更详细的配置待定
}
