package com.nick.miaosha.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author Nick
 * @Description //TODO
 * @Date 12:21 2018.10.31
 * @Version 1.0
 **/
@Controller
@RequestMapping("/demo")
public class SampleController {

    @RequestMapping("/thymeleaf")
    public String thymeleaf(Model model){
        model.addAttribute("name","Nick");
        return  "hello";
    }
}
