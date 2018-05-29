package io.cursor.blahycarshop.repository.Impl;


import io.cursor.blahycarshop.model.User;
import io.cursor.blahycarshop.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserRepositoryImpl{

    @Autowired
    private UserRepository userRepository;

    public User save(User user){
        return userRepository.save(user);
    }

    public List<User> users(){
        return userRepository.findAll();
    }

    }
