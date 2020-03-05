package com.user.service;

import com.user.client.UserClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.user.model.User;

@Service
public class UserService {

    @Autowired
    UserClient client;
    public String getUserDetails(User user){
        return client.getUserDetails(user);
    }
}
