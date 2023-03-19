package com.shop.sklepinternetowy.packageController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FindAuctionController {
    @GetMapping("find-auction")
    public String getFindAuctionForm(){
        return "find-auction-form";
    }
}
