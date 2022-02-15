package com.gemcrystal.wowproduct.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class InventoryItem {

	@Id
	private Integer productId;
	
	private String productCategory;
	
	private String productName;
	
	private Integer price;
	
	private Integer noOfItems;

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public String getProductCategory() {
		return productCategory;
	}

	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public Integer getNoOfItems() {
		return noOfItems;
	}

	public void setNoOfItems(Integer noOfItems) {
		this.noOfItems = noOfItems;
	}

	@Override
	public String toString() {
		return "InventoryItem [productId=" + productId + ", productCategory=" + productCategory + ", productName="
				+ productName + ", price=" + price + ", noOfItems=" + noOfItems + "]";
	}
	
	
}
