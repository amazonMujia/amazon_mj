package com.mujia.amazon_mj;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@MapperScan("com.mujia.amazon_mj.mapper")
@EnableSwagger2
//@EnableCaching
@EnableScheduling
@EnableTransactionManagement
public class AmazonMjApplication {

    public static void main(String[] args) {
        SpringApplication.run(AmazonMjApplication.class, args);
    }

}
