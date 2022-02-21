package io.hel.startup;

import org.apache.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * helei
 * 2022/2/21 16:00
 * description:
 */
@SuppressWarnings("all")
@DubboComponentScan(basePackages = "io.hel")
//@EnableDubbo
@SpringBootApplication(scanBasePackages = {"io.hel"})
public class HelloApp {
    public static void main(String[] args) {
        SpringApplication.run(HelloApp.class, args);
    }
}
