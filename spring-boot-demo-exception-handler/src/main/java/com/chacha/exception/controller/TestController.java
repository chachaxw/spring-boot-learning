package com.chacha.exception.controller;

import com.chacha.exception.exception.PageException;
import com.chacha.exception.exception.JsonException;
import com.chacha.exception.constant.Status;
import org.springframework.stereotype.Controller;
import com.chacha.exception.model.ApiResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * <p>
 *     Test controller
 * </p>
 *
 * @package: com.chacha.exception
 * @description: test controller
 * @author chacha
 */
@Controller
public class TestController {

    @GetMapping("/json")
    @ResponseBody
    public ApiResponse jsonException() {
        throw new JsonException(Status.UNKNOWN_ERROR);
    }

    @GetMapping("/error")
    public ModelAndView pageException() {
        throw new PageException(Status.UNKNOWN_ERROR);
    }
}
