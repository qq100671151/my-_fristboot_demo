package com.fxb.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * @author fengxianbin
 * @description: springboot启动类
 * @create 2020-12-24 11:43
 */
@ImportResource(locations = {"classpath:spring-hibernate.xml"})
@SpringBootApplication
public class SpringBootMainApplication {
    public static void main(String[] args) {
        // Spring应用启动起来
        SpringApplication.run(SpringBootMainApplication.class,args);
    }
}
