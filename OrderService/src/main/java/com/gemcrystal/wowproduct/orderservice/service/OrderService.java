package com.gemcrystal.wowproduct.orderservice.service;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.gemcrystal.wowproduct.orderservice.entity.InventoryItem;
import com.gemcrystal.wowproduct.orderservice.entity.OrderItem;
import com.gemcrystal.wowproduct.orderservice.entity.OrderSnapShotVO;
import com.gemcrystal.wowproduct.orderservice.repo.OrderServiceRepo;

@Service
public class OrderService {

	@Autowired
	private OrderServiceRepo orderServiceRepo;
	
	@Autowired
	private RestTemplate restTemplate;
	
	public Optional<OrderItem> placeOrder(OrderItem orderItem)
	{
		System.out.println("Order getOrderId"+ orderItem.getOrderId());
		
		 orderServiceRepo.save(orderItem);
		 
		 return orderServiceRepo.findById(orderItem.getOrderId());
	}

	public Optional<OrderItem> showOrder(Integer orderId) {
		 return orderServiceRepo.findById(orderId);
	}

	public OrderSnapShotVO orderSanpshot(Integer orderId) throws URISyntaxException
	{
		OrderSnapShotVO orderSnapShotVO = null;
		OrderItem orderItem = orderServiceRepo.findById(orderId).get();
		
		System.out.println("hello hello" +orderItem.getProductId());
		
		URI url = new URI("http://INVENTORY-SERVICE/Inventory/"+orderItem.getProductId());
		
		System.out.println("url" + url.toString());
		
		InventoryItem inventoryItem = restTemplate.getForObject(url,InventoryItem.class);
		
		orderSnapShotVO = new OrderSnapShotVO();
		
		
		orderSnapShotVO.setInventoryItem(inventoryItem);
		orderSnapShotVO.setOrderItem(orderItem);
		
		return orderSnapShotVO;
		
	}
}
