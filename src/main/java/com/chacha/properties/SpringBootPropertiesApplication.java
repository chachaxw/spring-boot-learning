package com.chacha.properties;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * <p>
 *     SpringBoot启动类
 *     Demo: 获取配置文件的自定义配置，以及如何多环境下的配置文件信息的获取
 * </p>
 *
 * @package: com.chacha.helloworld
 * @description: SpringBoot启动类
 * @author: chacha
 */
@SpringBootApplication
public class SpringBootPropertiesApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootPropertiesApplication.class, args);
    }
}
