package com.shop.sklepinternetowy.packageController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AuctionRemovalController {
    @GetMapping(path = "remove-auction")
    public String getRemoveForm(){
        return "remove-auction-form";
    }
}
