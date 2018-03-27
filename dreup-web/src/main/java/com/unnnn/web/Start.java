package com.unnnn.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Spring Boot Web 启动程序。
 *
 * @author ZengZhi
 */
@SpringBootApplication(scanBasePackages = "net.unnnn")
public class Start {
    public static void main(String[] args) {
        SpringApplication.run(Start.class, args);
    }
}


