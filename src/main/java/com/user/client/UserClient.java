package com.user.client;

import com.user.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class UserClient {

    @Autowired
    private RestTemplate restTemplate;

    @Value(value = "${url}")
    private String url;

    @Value(value = "${searchuserpath}")
    private String searchuserpath;


    public String getUserDetails(User user){

        //return restTemplate.postForObject(url + searchuserpath ,user,String.class);
        return restTemplate.getForObject(url,String.class);

}

}
