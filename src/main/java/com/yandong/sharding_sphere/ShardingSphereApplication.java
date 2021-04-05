package com.yandong.sharding_sphere;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.yandong.sharding_sphere.dao")
public class ShardingSphereApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShardingSphereApplication.class, args);
    }

}
