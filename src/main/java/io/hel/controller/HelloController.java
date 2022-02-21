package io.hel.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * helei
 * 2022/2/21 18:08
 * description:
 */
@SuppressWarnings("all")
@RestController
@RequestMapping(value = "hello")
public class HelloController {

    @RequestMapping("m1")
    public String hello() {
        return "hello";
    }
}
