package com.eagle.frommappertocontrollerautogenerator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import tk.mybatis.spring.annotation.MapperScan;

@ComponentScan(basePackages = {"com.eagle"})
@SpringBootApplication
@MapperScan("com.eagle")
public class FromMapperToControllerAutoGeneratorApplication {

    public static void main(String[] args) {
        SpringApplication.run(FromMapperToControllerAutoGeneratorApplication.class, args);
    }

}
