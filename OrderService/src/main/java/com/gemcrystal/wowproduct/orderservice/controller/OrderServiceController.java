package com.gemcrystal.wowproduct.orderservice.controller;

import java.net.URISyntaxException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.gemcrystal.wowproduct.orderservice.entity.OrderItem;
import com.gemcrystal.wowproduct.orderservice.entity.OrderSnapShotVO;
import com.gemcrystal.wowproduct.orderservice.service.OrderService;

@RestController
public class OrderServiceController
{
	@Autowired
	private OrderService orderService;
	
	@PutMapping("/order/place")
	public Optional<OrderItem> placeOrder(@RequestBody OrderItem orderItem)
	{
		return orderService.placeOrder(orderItem);
	}
	
	@GetMapping("/order/showorder/{orderId}")
	public Optional<OrderItem> viewOrder(@PathVariable Integer orderId)
	{
		return orderService.showOrder(orderId);
	}
	
	@GetMapping("/order/snapshot/{orderId}")
	public OrderSnapShotVO orderSanpshot(@PathVariable Integer orderId) throws URISyntaxException
	{
		System.out.println("im here" + orderId);
		return orderService.orderSanpshot(orderId);
	}
	
}
