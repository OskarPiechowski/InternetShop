package com.shop.sklepinternetowy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {

    @RequestMapping(path = "/auctionHouse",method = RequestMethod.GET)
    public ModelAndView getImperatorPage(){
        return new ModelAndView("auction-house-page");
    }
}
