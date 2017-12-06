package com.unnnn.service;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * RPC 服务启动类。
 * Created by warrenn on 2017/7/25.
 */
@MapperScan("net.unnnn.repositories")
@SpringBootApplication(scanBasePackages = "com.unnnn")
public class Start {
    public static void main(String[] args) throws InterruptedException {
        SpringApplication application = new SpringApplication(Start.class);
        application.setWebEnvironment(false);
        application.run(args);
    }
}
