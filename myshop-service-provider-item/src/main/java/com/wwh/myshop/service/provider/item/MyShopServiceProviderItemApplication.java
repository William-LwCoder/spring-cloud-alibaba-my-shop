package com.wwh.myshop.service.provider.item;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication(scanBasePackages = "com.wwh.myshop")
@EnableDiscoveryClient
@MapperScan(basePackages = "com.wwh.myshop.commons.mapper")
@EnableSwagger2
public class MyShopServiceProviderItemApplication {
    public static void main(String[] args) {
        SpringApplication.run(MyShopServiceProviderItemApplication.class, args);
    }
}
