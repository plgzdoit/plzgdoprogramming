package com.plzdoprogramming.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by preet on 10/6/2016.
 */
@Controller
public class HelloWorldController {


    @RequestMapping("/")
    public String sayHello(){
        return "index";
    }
}
