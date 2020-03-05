package com.user.controller;

import com.user.model.User;
import com.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {


    @Autowired
    UserService userService;

    @PostMapping(path = "/user/useradmin/searchuser/byuserid",consumes = "application/json", produces = "application/json")
    public String searchUserById(@RequestBody User user){

        String result =  userService.getUserDetails(user);

        return  result;

    }

}
