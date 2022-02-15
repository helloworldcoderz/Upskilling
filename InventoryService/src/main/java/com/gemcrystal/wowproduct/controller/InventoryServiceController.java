package com.gemcrystal.wowproduct.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.gemcrystal.wowproduct.entity.InventoryItem;
import com.gemcrystal.wowproduct.service.InventoryService;

@RestController

public class InventoryServiceController {
	
	@Autowired
	private InventoryService inventoryService;

	@RequestMapping("/Inventory")
	@ResponseBody
	public  List<InventoryItem> showInventory()
	{
		
		return inventoryService.showInventory();
	}
	
	@RequestMapping("/Inventory/{productId}")
	@ResponseBody
	public  Optional<InventoryItem> getProduct(@PathVariable Integer productId)
	{
		
		return inventoryService.getProductByiD(productId);
	}
}
