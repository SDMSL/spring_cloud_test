package com.zqh.controller;

import com.zqh.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {
    @Autowired
    private OrderService orderService;

    @RequestMapping("/getOrders")
    public String getOrders() {
        return orderService.getOrders() + " order";
    }
}
