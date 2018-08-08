package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

@Controller("/")
public class BaseController {
    static int time = 0;

    @RequestMapping("/index")
    public String hello(HttpSession session) {
        time++;
        session.setAttribute("times", time);
        return "index";
    }
}
