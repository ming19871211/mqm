package com.mqm.cloud.eurekaServer;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EureKaServerApplication 
{
	
    public static void main( String[] args )
    {
       new SpringApplicationBuilder(EureKaServerApplication.class).web(true).run(args);
    }
}
