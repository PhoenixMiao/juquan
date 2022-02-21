package com.phoenix.juquan;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import tk.mybatis.spring.annotation.MapperScan;


@SpringBootApplication
@MapperScan("com.phoenix.juquan.mapper")
@ComponentScan(basePackages = {"com.phoenix"})
public class JuQuanApplication {

    public static void main(String[] args) {
        SpringApplication.run(JuQuanApplication.class, args);
    }

}
