package com.shop.sklepinternetowy.packageController;

import com.shop.sklepinternetowy.exception.AuctionServiceException;
import com.shop.sklepinternetowy.request.AuctionCreationRequest;
import com.shop.sklepinternetowy.response.AuctionResponse;
import com.shop.sklepinternetowy.service.AuctionService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class AuctionController {

    private AuctionService auctionService;
    public AuctionController(AuctionService auctionService)
    {this.auctionService=auctionService;}
    @RequestMapping(path = "/add-auction", method = RequestMethod.GET)
    public ModelAndView getPlanetForm(){
        return new ModelAndView("new-auction-form"); }
    @PostMapping("/add-auction")
    public String createPlanet(@RequestParam String name,
                               @RequestParam(name = "auction_type") String auctionType,
                               @RequestParam int time,
                               Model model) {
        try {
            auctionService.createAuction(new AuctionCreationRequest(name, auctionType, time));
            model.addAttribute("message", "Dodano aukcję o nazwie: " + name);
        } catch (AuctionServiceException e) {
            model.addAttribute("message", e.getMessage());
        }
        return "auction-house-page";

    }
    @GetMapping("/browse-auction")
    public String getFindAuctionPage(Model model) {
        //czy na pewno encja w kontrolerze? architektura warstw!!
        List<AuctionResponse> auctions =  auctionService.getAllAuctions();
        model.addAttribute("planets", auctions);
        return "browse-auction-form";
    }
}


