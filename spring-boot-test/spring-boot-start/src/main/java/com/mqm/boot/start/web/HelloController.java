package com.mqm.boot.start.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author mqm
 *
 */
@Controller
public class HelloController {

	@RequestMapping("/")
    public String index(ModelMap map) {
        // 加入一个属性，用来在模板中读取
        map.addAttribute("host", "127.0.0.1");
        // return模板文件的名称，对应src/main/resources/templates/index.html
        return "index";  
    }

}
