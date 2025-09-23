package com.educandoWeb.course.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.educandoWeb.course.dto.OrderDTO;
import com.educandoWeb.course.entities.Order;
import com.educandoWeb.course.repositories.OrderRepository;

@Service
public class OrderService
{

	@Autowired
	private OrderRepository orderRepository;
	
	@Transactional(readOnly = true)
	public List<OrderDTO> findAll()
	{
		List<Order> list = orderRepository.findAll();
		return list.stream().map(o -> new OrderDTO(o)).collect(Collectors.toList());
	}
	
	@Transactional(readOnly = true)
	public OrderDTO findById(Long id)
	{
		Order entity = orderRepository.findById(id).get();
		return new OrderDTO(entity);
		
	}
}
