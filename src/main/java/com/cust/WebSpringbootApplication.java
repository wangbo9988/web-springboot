package com.cust;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(value = "com.cust.mapper")    // 设置mapper文件的扫描注解，这样当mapper文件过多的时候，我们就可以不需要在每一个mapper文件上都加上@Mapper这个注解了，而是直接扫描指定路径下的所有mapper文件
@SpringBootApplication
public class WebSpringbootApplication {
    public static void main(String[] args) {
        SpringApplication.run(WebSpringbootApplication.class, args);
    }

}
