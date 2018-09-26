package com.wdq.micorestore;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(value = "com.wdq.micorestore.mybaits.inteface")
public class MicorestoreApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicorestoreApplication.class, args);
    }
}
