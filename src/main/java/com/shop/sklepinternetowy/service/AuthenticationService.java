package com.shop.sklepinternetowy.service;

import com.shop.sklepinternetowy.entity.User;
import com.shop.sklepinternetowy.exception.AuthenticationServiceException;
import com.shop.sklepinternetowy.repository.UserRepository;
import com.shop.sklepinternetowy.request.RegisterRequest;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
    private UserRepository auctionRepository;

    public AuthenticationService(UserRepository imperatorRepository) {
        this.auctionRepository = imperatorRepository;
    }

    @Transactional
    public void createUser(RegisterRequest request) {
        if (request.getPassword1().length() <= 5) {
            throw new AuthenticationServiceException("Hasło minimum 6 znaków!");
        }
        if (!request.getPassword1().equals(request.getPassword2())) {
            throw new AuthenticationServiceException("Podano różne hasła");
        }
        if(auctionRepository.existsById(request.getUserName())){
            throw new AuthenticationServiceException("Ta nazwa jest już zajęta!");
        }

        User user = new User(request.getUserName(), request.getPassword1());
       auctionRepository.save(user);
    }

}