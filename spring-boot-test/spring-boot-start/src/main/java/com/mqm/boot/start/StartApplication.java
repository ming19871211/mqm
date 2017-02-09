package com.mqm.boot.start;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication // same as @Configuration @EnableAutoConfiguration @ComponentScan
public class StartApplication 
{
    public static void main( String[] args )
    {
        SpringApplication.run(StartApplication.class, args);
    }
}
