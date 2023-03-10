package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.Optional;

@Controller
@RequestMapping("/")
public class HomeController {

    @RequestMapping("")
    public ModelAndView index(@RequestParam Optional<String> name) {
        return new ModelAndView("/home/get/index");
    }
}
