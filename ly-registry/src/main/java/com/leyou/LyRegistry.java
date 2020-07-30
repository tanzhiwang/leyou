package com.leyou;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
//@SpringCloudApplication//估计就是这个注解导致启动报错的
@SpringBootApplication
public class LyRegistry {
    public static void main(String[] args) {
        SpringApplication.run(LyRegistry.class);
    }
    //java.lang.IllegalStateException: Error processing condition on org.springframework.boot.autoconfigure.context.PropertyPlaceholderAutoConfiguration.propertySourcesPlaceholderConfigurer
}
