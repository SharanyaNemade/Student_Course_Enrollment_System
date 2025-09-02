package com.studentmgm.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    // Landing page
    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("pageTitle", "Welcome to Student Management System");
        return "index"; // index.html under templates
    }

    // About page
    @GetMapping("/about")
    public String about(Model model) {
        model.addAttribute("pageTitle", "About Us - Student Management System");
        model.addAttribute("description", "This Student Management System helps manage students, courses, and enrollments efficiently.");
        model.addAttribute("version", "v1.0.0");
        model.addAttribute("developer", "Your Name or Company");
        return "about"; // about.html under templates
    }
}
