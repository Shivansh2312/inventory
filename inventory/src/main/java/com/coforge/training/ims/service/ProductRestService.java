package com.coforge.training.ims.service;

import java.util.List;
import java.util.Optional;

import com.coforge.training.ims.model.Product;
import com.coforge.training.ims.repository.ProductRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ProductRestService {

	@Autowired
	private ProductRepository prepo;
	
	public Product saveProduct(Product p) //User-Defined method in service class
	{
	return prepo.save(p); //Invokes save() method defined in JPA Repo.	
	}
	
	public Optional<Product> getSingleProduct(long id) {
        return prepo.findById(id);  // defined in JPA repo
    }
	
	 public void delete(long id) {
	        prepo.deleteById(id);  // defined in JPA repo
	    }
	 
		public List<Product> listAll()
		{
			return prepo.findAll(); //Defined in JPA Repo.
		}
}
