package com.educandoWeb.course.dto;

import java.io.Serializable;
import java.time.Instant;
import java.util.HashSet;
import java.util.Set;

import com.educandoWeb.course.entities.Order;
import com.educandoWeb.course.entities.OrderItem;
import com.educandoWeb.course.entities.enums.OrderStatus;

public class OrderDTO implements Serializable 
{
	private static final long serialVersionUID = 1L;

	private Long id;
    private Instant moment;
    private OrderStatus orderStatus;
    private UserDTO client;
    private Set<OrderItemDTO> items = new HashSet<>();
    
    private PaymentDTO payment;

    public OrderDTO(Long id, Instant moment, OrderStatus orderStatus)
    {
		this.id = id;
		this.moment = moment;
		this.orderStatus = orderStatus;
	}
	
	public OrderDTO(Order entity) 
	{
		this.id = entity.getId();
		this.moment = entity.getMoment();
		this.orderStatus = entity.getOrderStatus();
		for (OrderItem x : entity.getItems()) {
			items.add(new OrderItemDTO(x));
		}
		this.payment = new PaymentDTO(entity.getPayment());
	}
    
    public OrderDTO() 
    {}
    
    public UserDTO getClient()
    {
    	return client;
    }
    
    public void setId(UserDTO client)
    {
    	this.client = client;
    }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Instant getMoment() {
		return moment;
	}

	public void setMoment(Instant moment) {
		this.moment = moment;
	}

	public OrderStatus getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(OrderStatus orderStatus) {
		this.orderStatus = orderStatus;
	}
	
	public Set<OrderItemDTO> getItems() {
		return items;
	}

	public void setItems(Set<OrderItemDTO> items) {
		this.items = items;
	}
	
	public PaymentDTO getPayment() {
		return payment;
	}

	public void setPayment(PaymentDTO payment) {
		this.payment = payment;
	}

	public Double getTotal()
	{
		double sum = 0.0;
		for(OrderItemDTO x : items)
		{
			sum += x.getSubTotal();
		}
		return sum;
	}    
}
