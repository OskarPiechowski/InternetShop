package com.shop.sklepinternetowy.service;

import com.shop.sklepinternetowy.entity.User;
import com.shop.sklepinternetowy.exception.AuthenticationServiceException;
import com.shop.sklepinternetowy.repository.AuctionRepository;
import com.shop.sklepinternetowy.request.RegisterRequest;
import jakarta.transaction.Transactional;

public class AuthenticationService {
    private AuctionRepository imperatorRepository;

    public AuthenticationService(AuctionRepository imperatorRepository) {
        this.imperatorRepository = imperatorRepository;
    }

    @Transactional
    public void createImperator(RegisterRequest request) {
        if (request.getPassword1().length() <= 5) {
            throw new AuthenticationServiceException("Hasło minimum 6 znaków!");
        }
        if (!request.getPassword1().equals(request.getPassword2())) {
            throw new AuthenticationServiceException("Podano różne hasła");
        }
        if(imperatorRepository.existsById(request.getUserName())){
            throw new AuthenticationServiceException("Ta nazwa jest już zajęta!");
        }

        User user = new User(request.getUserName(), request.getPassword1());
        imperatorRepository.save(user);
    }

}