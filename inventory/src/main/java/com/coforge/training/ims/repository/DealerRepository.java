package com.coforge.training.ims.repository;

import java.util.List;
import java.util.Optional;

import com.coforge.training.ims.model.Dealer;
import com.coforge.training.ims.model.DealerAddress;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface DealerRepository extends JpaRepository<Dealer, Long> {
	//Long is a data type of id field of Dealer class
	/*
     * This interface has save(),findAll(),findById(),deleteById(),count()
    etc.. inbuilt methods of jpa repository for various database operations.
    This interface will be implemented by class automatically
    */
	
	//Custom Method to fetch record/object based on email field - non id field.  
	//public Dealer findByEmail(String email);
	
	public Optional<Dealer> findByEmail(String email);
	
	//Custom Query using JPQL
	@Query("SELECT new com.coforge.training.ims.model.DealerAddress(d.id,d.email,d.fname,d.lname,"
			+ "d.password,d.dob,d.phoneNo,a.street,a.city,a.pincode) "
			+ "FROM Dealer d INNER JOIN d.address a")
	 public List<DealerAddress> fetchDealerInnerJoin();
}
