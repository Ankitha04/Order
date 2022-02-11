package com.example.demo.controller;


import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Order;
import com.example.demo.service.OrderService;


@RestController
public class OrderController {
	@Autowired
	OrderService orderservice;
	
	@PostMapping("/order")
	@ResponseStatus(code = HttpStatus.CREATED)
	void creatOrder(@RequestBody @Valid Order order) {
		orderservice.saveOrder(order);
	}
	
	

	

}
