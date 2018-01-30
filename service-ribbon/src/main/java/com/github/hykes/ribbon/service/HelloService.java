package com.github.hykes.ribbon.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author hehaiyangwork@gmail.com
 * @date 2018/1/30
 */
@Service
public class HelloService {

    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "error")
    public String hello(String name) {
        return restTemplate.getForObject("http://EUREKACLIENT/hello?name="+name,String.class);
    }

    public String error(String name) {
        return "hello,"+name+",sorry,error!";
    }

}
