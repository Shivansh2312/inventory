package com.coforge.training.ims.repository;

import java.util.List;

import com.coforge.training.ims.model.Product;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

	//Long is a data type of id field of Product class
		/*
	     * This interface has save(),findAll(),findById(),deleteById(),count()
	    etc.. inbuilt methods of jpa repository for various database operations.
	    This interface will be implemented by class automatically
	    */
    //Custom Finder Method. Implementation of this is plugged in by Spring data JPA automatically.
	List<Product> findByMadein(String country);
}
