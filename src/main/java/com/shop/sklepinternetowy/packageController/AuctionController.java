package com.shop.sklepinternetowy.packageController;

import com.shop.sklepinternetowy.exception.AuctionServiceException;
import com.shop.sklepinternetowy.request.AuctionCreationRequest;
import com.shop.sklepinternetowy.service.AuctionService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AuctionController {

    private AuctionService auctionService;
    @RequestMapping(path = "/add-auction", method = RequestMethod.GET)
    public ModelAndView getPlanetForm(){
        return new ModelAndView("new-auction-form.html"); }
    @PostMapping("/add-auction")
    public String createPlanet(@RequestParam String name,
                               @RequestParam(name = "auction_type") String auctionType,
                               @RequestParam int size,
                               Model model) {
        try {
            auctionService.createAuction(new AuctionCreationRequest(name, auctionType, size));
            model.addAttribute("message", "Dodano aukcję o nazwie: " + name);
        } catch (AuctionServiceException e) {
            model.addAttribute("message", e.getMessage());
        }
        return "auction-page";

    }
}

