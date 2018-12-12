package com.kerwin.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
//@MapperScan(basePackages = "com.kerwin.springboot.mapper")
@MapperScan(basePackages = "com.kerwin.springboot.mapper")
@ComponentScan(basePackages = "com.kerwin.springboot")
public class SpringbootApplication
{

    public static void main(String[] args)
    {
        SpringApplication.run(SpringbootApplication.class, args);
    }
}
