package com.github.hykes.feign.web;

import com.github.hykes.feign.service.HelloService;
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
    public String sayHello(@RequestParam String name){
        return helloService.sayHello(name);
    }

}
