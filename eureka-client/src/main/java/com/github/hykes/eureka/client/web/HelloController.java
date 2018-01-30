package com.github.hykes.eureka.client.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author hehaiyangwork@gmail.com
 * @date 2018/1/30
 */
@RestController
public class HelloController {

    @Value("${server.port}")
    String port;

    @GetMapping("/hello")
    public String home(@RequestParam String name) {
        return "hello "+name+", this port:" +port;
    }

}
