package com.mqm.boot.start.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author mqm
 *
 */
@RestController
public class HelloRestController {

	@RequestMapping("/hello")
    public String hello() {
        return "Hello World";
    }
	
}
