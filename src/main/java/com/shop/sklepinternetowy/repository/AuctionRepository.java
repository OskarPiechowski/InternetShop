package com.shop.sklepinternetowy.repository;

import com.shop.sklepinternetowy.entity.Auction;
import com.shop.sklepinternetowy.entity.AuctionType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AuctionRepository extends JpaRepository<Auction,Long> { // JpaRepository - zawiera CrudRepository
    List<Auction> findByType(AuctionType type);

}


