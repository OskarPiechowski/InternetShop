package com.shop.sklepinternetowy.packageController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class NewAuctionController {

    @GetMapping( "/add-auction")
    public String getAuctionForm(){
        return "new-auction-form";

    }
}
