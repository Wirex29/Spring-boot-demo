package com.example.demo.controller;

import com.example.demo.model.Hello;
import com.example.demo.service.HelloQueryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.Optional;

@Controller
@RequestMapping("/")
public class HomeController {

    private final HelloQueryService service;

    @Autowired
    public HomeController(HelloQueryService service) {
        this.service = service;
    }


    @RequestMapping("")
    public ModelAndView index(@RequestParam Optional<String> name) {
        ModelAndView mav = new ModelAndView("/home/get/index");
        mav.addObject("hello", service.generateRandomQuote());
        return mav;
    }
}
