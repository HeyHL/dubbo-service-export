package io.hel.startup;

import io.hel.service.HelloService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * helei
 * 2022/2/21 16:00
 * description:
 */
@SuppressWarnings("all")
@SpringBootApplication(scanBasePackages = {"io.hel"})
public class ProviderService {

    private static final Logger LOGGER = LoggerFactory.getLogger(ProviderService.class);

    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(ProviderService.class, args);
        HelloService helloService = applicationContext.getBean(HelloService.class);
        LOGGER.info("helloService: {}", helloService);
    }
}
