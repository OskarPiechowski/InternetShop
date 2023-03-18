package com.shop.sklepinternetowy.packageController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AuctionController {

    @RequestMapping(path = "/add-auction", method = RequestMethod.GET)
    public ModelAndView getPlanetForm(){
        return new ModelAndView("new-auction-form.html");

    }
}
