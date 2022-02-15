package com.gemcrystal.wowproduct.orderservice.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gemcrystal.wowproduct.orderservice.entity.OrderItem;

public interface OrderServiceRepo extends JpaRepository<OrderItem, Integer> 
{

}
