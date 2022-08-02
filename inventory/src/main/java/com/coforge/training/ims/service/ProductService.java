package com.coforge.training.ims.service;

import java.util.List;


import com.coforge.training.ims.model.Product;
import com.coforge.training.ims.repository.ProductRepository;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ProductService {

	@Autowired
	private ProductRepository prepo;
	
	public void saveProduct(Product p) //User-Defined method in service class
	{
	prepo.save(p); //Invokes save() method defined in JPA Repo.	
	}
	
	public List<Product> listAll()
	{
		return prepo.findAll(); //Defined in JPA Repo.
	}
	
	public Product get(long id) {
        return prepo.findById(id).get();  // defined in JPA repo
    }
		
    public void delete(long id) {
        prepo.deleteById(id);  // defined in JPA repo
    }
}
