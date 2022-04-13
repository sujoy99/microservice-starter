package com.starter.os.api.controller;

import com.starter.os.api.entity.common.TransactionRequest;
import com.starter.os.api.entity.common.TransactionResponse;
import com.starter.os.api.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    /*
    @PostMapping("/bookOrder")
    public Order bookOrder(@RequestBody Order order){
        return orderService.saveOrder(order);
    }
    */

    @PostMapping("/bookOrder")
    public TransactionResponse bookOrder(@RequestBody TransactionRequest request) {
        return orderService.saveOrder(request);
    }
}
