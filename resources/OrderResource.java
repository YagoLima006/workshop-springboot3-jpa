package com.educandoWeb.course.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.educandoWeb.course.dto.OrderDTO;
import com.educandoWeb.course.services.OrderService;

@RestController
@RequestMapping(value = "/orders")
public class OrderResource 
{
	@Autowired
	private OrderService orderService;
	
	@GetMapping
	public ResponseEntity<List<OrderDTO>> findAll()
	{
		List<OrderDTO> list = orderService.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<OrderDTO> findById(@PathVariable Long id)
	{
		OrderDTO obj = orderService.findById(id);
		return ResponseEntity.ok().body(obj);
	}
	
}
