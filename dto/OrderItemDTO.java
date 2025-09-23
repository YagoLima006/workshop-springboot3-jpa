package com.educandoWeb.course.dto;

import java.io.Serializable;

import com.educandoWeb.course.entities.OrderItem;

public class OrderItemDTO implements Serializable
{
	private static final long serialVersionUID = 1L;

	private long productId;
	private String productName;
	private Integer quantity;
	private Double price;
	
	 public OrderItemDTO(OrderItem entity) {
		this.productId = entity.getProduct().getId();
	    this.productName = entity.getProduct().getName();
	    this.quantity = entity.getQuantity();
	    this.price = entity.getPrice();
	 }
	
	public OrderItemDTO()
	{}

	public long getProductId() {
		return productId;
	}

	public void setProductId(long productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	
	
	
	
}
