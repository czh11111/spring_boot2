package com.example.spring_boot2;

import lombok.val;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

import javax.sql.DataSource;
@EnableAsync //开启异步注解功能
@EnableScheduling //开始定时功能的主角
@SpringBootApplication
public class SpringBoot2Application {

    public static void main(String[] args) {
        
        SpringApplication.run(SpringBoot2Application.class, args);


    }
    
}
