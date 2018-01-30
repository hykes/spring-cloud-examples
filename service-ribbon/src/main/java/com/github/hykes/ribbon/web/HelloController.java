package com.github.hykes.ribbon.web;

import com.github.hykes.ribbon.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author hehaiyangwork@gmail.com
 * @date 2018/1/30
 */
@RestController
public class HelloController {

    @Autowired
    private HelloService helloService;

    @GetMapping(value = "/hello")
    public String hi(@RequestParam String name){
        return helloService.hello(name);
    }
}
