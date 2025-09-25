package com.educandoWeb.course.dto;

import java.io.Serializable;
import java.time.Instant;

import com.educandoWeb.course.entities.Payment;

public class PaymentDTO implements Serializable 
{
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private Instant moment;
	
	public PaymentDTO()
	{	
	}
	
	public PaymentDTO(Payment entity)
	{	
		if (entity != null)
		{
			this.id = entity.getId();
			this.moment = entity.getMoment();
		}
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
	
	
}
