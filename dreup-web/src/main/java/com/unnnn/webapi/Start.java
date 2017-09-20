package com.unnnn.webapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 *  Spring Boot Web 启动程序。
 *  @author 曾智
 */
@SpringBootApplication(scanBasePackages = "net.unnnn")
public class Start {
    public static void main(String[] args) throws Exception {
        SpringApplication.run(Start.class, args);
    }
}


