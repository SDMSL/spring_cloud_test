package com.zqh.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class OrderService {
    @Autowired
    private RestTemplate restTemplate;

    public String getOrders() {
        return restTemplate.getForObject("http://service-zuul/api-member/getMembers", String.class);
    }
}
