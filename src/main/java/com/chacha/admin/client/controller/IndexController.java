package com.chacha.admin.client.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *     Index page
 * </p>
 *
 * @package: com.chacha.helloworld
 * @description: Index page
 * @author: chacha
 */
@RestController
public class IndexController {
    @GetMapping(value = {"", "/"})
    public String index() {
        return "This is a spring boot admin client demo";
    }
}
