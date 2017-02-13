package com.mqm.boot.start.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mqm.boot.start.service.UserService;

@Controller
public class UserController {

	@Autowired
	private UserService userService;
	
	@RequestMapping("/userInfo")
	@ResponseBody
    public String userInfo() {
		
		return "all user number: "+userService.getAllUsers();
    }
}
