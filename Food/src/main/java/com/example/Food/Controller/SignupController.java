package com.example.Food.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.Food.Entity.Signup;
import com.example.Food.Service.SignupService;


@Controller
@RequestMapping("/signup")
public class SignupController {
	@Autowired
    private SignupService signupService;

    @GetMapping
    public String showSignupForm(Model model) {
        model.addAttribute("signup", new Signup());
        return "signup";
    }

    @PostMapping
    public String registerUser(Signup signup, Model model) {
        if (signupService.emailExists(signup.getEmail())) {
            model.addAttribute("message", "User with this email already exists.");
            return "signup";
        }
        signupService.registerUser(signup);
        return "redirect:/signup?success";
    }
}
