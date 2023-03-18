package com.shop.sklepinternetowy.packageController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PortController {
    @GetMapping(path = "add-port")
    public String getPortForm(){
        return "port-form";
    }
}
