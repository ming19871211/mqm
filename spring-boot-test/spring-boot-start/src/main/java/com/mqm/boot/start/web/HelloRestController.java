package com.mqm.boot.start.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mqm.boot.start.exception.MyException;

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
	
	@RequestMapping("/hello3")
	public String hello3() throws Exception {
	    throw new Exception("发生错误");
	}
	
	@RequestMapping("/json")
    public String json(){
        throw new MyException("发生错误2");
    }	
}
