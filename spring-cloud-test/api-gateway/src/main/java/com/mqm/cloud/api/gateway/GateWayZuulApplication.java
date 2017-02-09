package com.mqm.cloud.api.gateway;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

import com.mqm.cloud.api.gateway.filter.AccessFilter;

@EnableZuulProxy
@SpringBootApplication
public class GateWayZuulApplication 
{
    public static void main( String[] args )
    {
        new SpringApplicationBuilder(GateWayZuulApplication.class).web(true).run(args);
    }
    
    @Bean
    public AccessFilter accessFilter() {
		return new AccessFilter();
	}
}
