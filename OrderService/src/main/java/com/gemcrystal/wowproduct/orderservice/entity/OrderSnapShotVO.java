package com.gemcrystal.wowproduct.orderservice.entity;

public class OrderSnapShotVO 
{
  private InventoryItem inventoryItem;
  
  private OrderItem orderItem;

	public InventoryItem getInventoryItem() {
		return inventoryItem;
	}
	
	public void setInventoryItem(InventoryItem inventoryItem) {
		this.inventoryItem = inventoryItem;
	}
	
	public OrderItem getOrderItem() {
		return orderItem;
	}
	
	public void setOrderItem(OrderItem orderItem) {
		this.orderItem = orderItem;
	}
}
