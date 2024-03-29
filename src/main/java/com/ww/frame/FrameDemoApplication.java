package com.ww.frame;

import com.ww.frame.spring.applicationListener.customEvent.EmailEvent;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableTransactionManagement
@SpringBootApplication
@EnableAsync
public class FrameDemoApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(FrameDemoApplication.class, args);

//        //创建一个ApplicationEvent对象
//        EmailEvent event = new EmailEvent("hello", "abc@163.com", "This is a test");
//
// 主动触发该事件
//        run.publishEvent(event);
    }
}