package com.shop.sklepinternetowy.service;

import com.shop.sklepinternetowy.entity.Auction;
import com.shop.sklepinternetowy.entity.AuctionType;
import com.shop.sklepinternetowy.exception.AuctionServiceException;
import com.shop.sklepinternetowy.repository.AuctionRepository;
import com.shop.sklepinternetowy.request.AuctionCreationRequest;
import com.shop.sklepinternetowy.response.AuctionResponse;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class AuctionService {

    private AuctionRepository repository;

    public AuctionService(AuctionRepository repository){this.repository = repository;}
    public void createAuction(AuctionCreationRequest request) {
        if (request.getName().isBlank()) {
            throw new AuctionServiceException("Nie uzupełniono nazwy!");
        } else if (request.getTime()<= 0) {
            throw new AuctionServiceException("Czas trwania to min. 1");
        }
        AuctionType type = AuctionType.valueOf(request.getType());
        Auction auction = new Auction(request.getName(), type, request.getTime());
        repository.save(auction);
    }
    public List<AuctionResponse> getAllAuctions(){
        return repository.findAll().stream()
                .map(p -> new AuctionResponse(p.getName(), p.getType(), p.getTime()))
                .toList();
    }

}
