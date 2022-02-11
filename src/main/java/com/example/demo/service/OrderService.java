package com.example.demo.service;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Order;
import com.example.demo.repository.OrderRepository;

@Service
public class OrderService {
	@Autowired
	OrderRepository orderrepository;

	public void saveOrder(@Valid Order order) {
		orderrepository.save(order);
		
	}
	

}
