package com.gemcrystal.wowproduct.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gemcrystal.wowproduct.entity.InventoryItem;
import com.gemcrystal.wowproduct.repo.InventoryServiceRepo;

@Service
public class InventoryService {

	@Autowired
	private InventoryServiceRepo inventoryServiceRepo;
	
	public List<InventoryItem> showInventory() {
		
		return inventoryServiceRepo.findAll();
		
		
	}

	public java.util.Optional<InventoryItem> getProductByiD(Integer productId) 
	{
		return inventoryServiceRepo.findById(productId);
	}

}
