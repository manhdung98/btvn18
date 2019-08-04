package com.topica.responsitory;

import com.topica.model.User1Entity;
import com.topica.model.UserEntity;
import org.springframework.data.repository.CrudRepository;

public interface UserDao extends CrudRepository<User1Entity, Integer> {

    User1Entity findByUsername(String username);

}