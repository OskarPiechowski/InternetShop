package com.shop.sklepinternetowy.packageController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {

    @RequestMapping(path = "/shop",method = RequestMethod.GET)
    public ModelAndView getImperatorPage(){
        ModelAndView modelAndView = new ModelAndView("shop-page.html");
        return modelAndView;
    }
}
