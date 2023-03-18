package com.shop.sklepinternetowy.service;

import com.shop.sklepinternetowy.exception.AuctionServiceException;
import com.shop.sklepinternetowy.request.AuctionCreationRequest;

public class AuctionService {

    public void createAuction(AuctionCreationRequest request) {
        if (request.getName().isBlank()) {
            throw new AuctionServiceException("Nie uzupełniono nazwy!");
        } else if (request.getTime()<= 0) {
            throw new AuctionServiceException("Rozmiar planety min. 1");
        }
        System.out.println("Wszystko ok, dodaję");
        //dodawanie do bazy danych
    }

}
