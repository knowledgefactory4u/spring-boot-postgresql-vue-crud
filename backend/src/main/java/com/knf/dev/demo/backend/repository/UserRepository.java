package com.knf.dev.demo.backend.repository;
import org.springframework.data.repository.CrudRepository;

import com.knf.dev.demo.backend.entity.User;

public interface UserRepository 
   extends CrudRepository<User, Long> {

}