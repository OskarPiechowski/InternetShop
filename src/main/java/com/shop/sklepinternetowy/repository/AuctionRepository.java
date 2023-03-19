package com.shop.sklepinternetowy.repository;

import com.shop.sklepinternetowy.entity.Auction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuctionRepository extends JpaRepository<Auction,Long> { // JpaRepository - zawiera CrudRepository
}

