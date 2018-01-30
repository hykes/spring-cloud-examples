package com.github.hykes.feign.service;

import org.springframework.stereotype.Component;

/**
 * @author hehaiyangwork@gmail.com
 * @date 2018/1/30
 */
@Component
public class HelloServiceImpl implements HelloService {

    @Override
    public String sayHello(String name) {
        return "hello,"+name+",sorry,error!";
    }

}
