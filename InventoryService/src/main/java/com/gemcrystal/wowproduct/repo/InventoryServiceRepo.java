package com.gemcrystal.wowproduct.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gemcrystal.wowproduct.entity.InventoryItem;

public interface InventoryServiceRepo extends JpaRepository<InventoryItem, Integer>
{

}
