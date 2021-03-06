package com.chacha.helloworld;

import cn.hutool.core.util.StrUtil;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * <p>
 *      SpringBoot启动类
 *      Demo: hello world 接口
 * </p>
 *
 * @package: com.chacha.helloworld
 * @description: SpringBoot启动类
 * @author chacha
 */
@SpringBootApplication
@RestController
public class SpringBootHelloWorldApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootHelloWorldApplication.class, args);
    }

    /**
     * Hello World
     *
     * @param who
     * @return Hello, ${who}
     */
    @GetMapping("/hello")
    public String sayHello(@RequestParam(required = false, name = "who") String who) {
        if (StrUtil.isBlank(who)) {
            who = "Chacha";
        }

        System.out.print("请求参数:" + who);
        return StrUtil.format("Hello, {}!", who);
    }
}
