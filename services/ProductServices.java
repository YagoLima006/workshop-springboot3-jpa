package com.educandoWeb.course.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandoWeb.course.dto.ProductDTO;
import com.educandoWeb.course.entities.Product;
import com.educandoWeb.course.repositories.ProductRepository;

import org.springframework.transaction.annotation.Transactional;

@Service
public class ProductServices
{
	@Autowired
	private ProductRepository productRepository;
	
	@Transactional(readOnly = true) 
    public List<ProductDTO> findAll() {
        List<Product> list = productRepository.findAll();
        return list.stream().map(p -> new ProductDTO(p)).collect(Collectors.toList());
    }

    @Transactional(readOnly = true)
    public ProductDTO findById(Long id) {
        Product entity = productRepository.findById(id).get();
        return new ProductDTO(entity);
    }
	
}
