package com.shop.sklepinternetowy.repository;

import com.shop.sklepinternetowy.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User,String> {
}
