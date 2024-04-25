package com.husu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author huyong(husu)
 * @date 4/25/2024 4:56 PM
 */
@SpringBootApplication
@MapperScan("com.husu.mapper")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}