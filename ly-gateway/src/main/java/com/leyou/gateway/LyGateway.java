package com.leyou.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

//@EnableCircuitBreaker//服务降级中的熔断
//@SpringBootApplication//启动类注解
//@EnableDiscoveryClient

@EnableZuulProxy
@SpringCloudApplication//包含上面三个
public class LyGateway {
    public static void main(String[] args) {
        SpringApplication.run(LyGateway.class);
    }
}
