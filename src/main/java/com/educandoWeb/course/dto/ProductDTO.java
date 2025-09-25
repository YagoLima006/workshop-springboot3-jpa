package com.educandoWeb.course.dto;

import java.io.Serializable;
import java.util.Set;
import java.util.stream.Collectors;

import com.educandoWeb.course.entities.Product;

public class ProductDTO implements Serializable  
{
	private static final long serialVersionUID = 1L;

	private Long id;
    private String name;
    private String description;
    private Double price;
    private String imgUrl;
    private Set<CategoryDTO> categories;

    public ProductDTO() {
    }

    public ProductDTO(Product entity) {
        this.id = entity.getId();
        this.name = entity.getName();
        this.description = entity.getDescription();
        this.price = entity.getPrice();
        this.imgUrl = entity.getImgUrl();
        this.categories = entity.getCategories().stream().map(cat -> new CategoryDTO(cat)).collect(Collectors.toSet());
    }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	public Set<CategoryDTO> getCategories() {
		return categories;
	}
}