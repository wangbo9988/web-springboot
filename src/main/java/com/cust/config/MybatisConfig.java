//package com.cust.config;
//
//import org.apache.ibatis.session.Configuration;
//import org.mybatis.spring.boot.autoconfigure.ConfigurationCustomizer;
//import org.springframework.context.annotation.Bean;
//
///**
// * @Description
// * @Author Wangbo
// * @Date 2019/11/03
// * @Version V1.0
// **/
//
//@org.springframework.context.annotation.Configuration
//public class MybatisConfig {
//
//    @Bean
//    public ConfigurationCustomizer configurationCustomizer() {
//        return new ConfigurationCustomizer() {
//            @Override
//            public void customize(Configuration configuration) {
//                configuration.setMapUnderscoreToCamelCase(true);    // 开启驼峰命名法
//            }
//
//        };
//    }
//
//}
