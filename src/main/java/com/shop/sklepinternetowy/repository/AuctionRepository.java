package com.shop.sklepinternetowy.repository;

import com.shop.sklepinternetowy.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface AuctionRepository extends CrudRepository<User,String> {
}
