package com.ww.frame;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableTransactionManagement
@SpringBootApplication
@EnableAsync
public class FrameDemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(FrameDemoApplication.class, args);
    }
}