package com.example.Assignment1Registration.controller;

import com.example.Assignment1Registration.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class RegistrationController {

    @GetMapping("/register")
    public String showForm(Model model) {
        model.addAttribute("student", new Student());
        return "register";
    }

    @PostMapping("/register")
    public String submitForm(@ModelAttribute Student student, Model model) {
        model.addAttribute("student", student);
        return "confirmation";
    }
}
