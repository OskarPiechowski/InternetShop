package com.shop.sklepinternetowy.controller;

import com.shop.sklepinternetowy.exception.AuthenticationServiceException;
import com.shop.sklepinternetowy.request.RegisterRequest;
import com.shop.sklepinternetowy.service.AuthenticationService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class AuthenticationController {
    private AuthenticationService service;

    public AuthenticationController(AuthenticationService service) {
        this.service = service;
    }

    @GetMapping("/register")
    public ModelAndView getRegisterPage() {
        RegisterRequest request = new RegisterRequest();
        ModelAndView modelAndView = new ModelAndView("register");
        modelAndView.addObject("request", request);
        return modelAndView;
    }

    @PostMapping("/create-user")
    public ModelAndView createUser(@ModelAttribute("request") RegisterRequest request) {
        ModelAndView modelAndView = new ModelAndView("auction-house-page");
        modelAndView.addObject("request", request);
        try {
            service.createUser(request);
            modelAndView.addObject("message", "Konto utworzone");
        } catch (AuthenticationServiceException e) {
            modelAndView.addObject("message", e.getMessage());
        }
        return modelAndView;
    }

}


