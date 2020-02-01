package com.example.demo.controller;

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@Controller
class HomeController {
    @GetMapping("")

    fun index(model: Model): String {
        model.addAttribute("text", "home controller")
        return "home"
    }
}