package com.github.hykes.config.client.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author hehaiyangwork@gmail.com
 * @date 2018/1/30
 */
@RestController
public class ClientController {

    @Value("${foo}")
    private String foo;

    @GetMapping(value = "/hello")
    public String hello(){
        return foo;
    }

}
