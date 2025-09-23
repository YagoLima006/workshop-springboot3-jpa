package com.educandoWeb.course.dto;

import java.io.Serializable;
import java.time.Instant;
import java.util.Set;
import java.util.stream.Collectors;

import com.educandoWeb.course.entities.Order;
import com.educandoWeb.course.entities.enums.OrderStatus;

public class OrderDTO implements Serializable 
{
	private static final long serialVersionUID = 1L;

	private Long id;
    private Instant moment;
    private OrderStatus orderStatus;
    private UserDTO client;
    private Set<OrderItemDTO> items;


    public OrderDTO(Order entity) {
        this.id = entity.getId();
        this.moment = entity.getMoment();
        this.orderStatus = entity.getOrderStatus();
        this.client = new UserDTO(entity.getClient());
        this.items = entity.getItems().stream().map(items -> new OrderItemDTO(items)).collect(Collectors.toSet());
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
	
	
    
}
