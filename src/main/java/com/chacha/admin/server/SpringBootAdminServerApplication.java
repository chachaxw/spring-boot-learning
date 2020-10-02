package com.chacha.admin.server;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * <p>
 *     SpringBoot Server 启动类
 * </p>
 *
 * @package: com.chacha.helloworld
 * @description: SpringBoot Server 启动类
 * @author: chacha
 */
@Slf4j
@Configuration
@EnableAdminServer
@SpringBootApplication
public class SpringBootAdminServerApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(SpringBootAdminServerApplication.class, args);
        int length = context.getBeanDefinitionNames().length;

        // log example
        log.info("Spring boot启动初始化了 {} 个 Bean", length);
    }

    @Configuration
    public static class SecurityPermitAllConfig extends WebSecurityConfigurerAdapter {
        @Override
        protected void configure(HttpSecurity http) throws Exception {
            http.authorizeRequests().anyRequest().permitAll()
                    .and().csrf().disable();
        }
    }
}
