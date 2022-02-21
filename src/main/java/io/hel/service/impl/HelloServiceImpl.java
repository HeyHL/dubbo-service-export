package io.hel.service.impl;

import io.hel.service.HelloService;
import org.apache.dubbo.config.annotation.DubboService;

/**
 * helei
 * 2022/2/21 15:58
 * description:
 */
@SuppressWarnings("all")
@DubboService(interfaceClass = HelloService.class, version = "1.0", group = "on", timeout = 60 * 1000)
public class HelloServiceImpl implements HelloService {
    public String hello(String name) {
        return "hello " + name;
    }
}
