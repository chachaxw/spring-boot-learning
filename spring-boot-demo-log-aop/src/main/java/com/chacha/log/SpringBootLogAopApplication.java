package com.chacha.log;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * <p>
 *      SpringBoot启动类
 *      Demo: hello world 接口
 * </p>
 *
 * @package: com.chacha.log
 * @description: SpringBoot启动类
 * @author chacha
 */
@SpringBootApplication
public class SpringBootLogAopApplication {

    public static void main(String[] args) {
        SpringApplication.run(com.chacha.helloworld.SpringBootHelloWorldApplication.class, args);
    }
}

