package com.github.hykes.feign.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author hehaiyangwork@gmail.com
 * @date 2018/1/30
 */
@FeignClient(value = "EUREKACLIENT", fallback = HelloServiceImpl.class)
public interface HelloService {

    @GetMapping(value = "/hello")
    String sayHello(@RequestParam(value = "name") String name);

}
