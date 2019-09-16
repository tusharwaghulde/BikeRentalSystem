package com.alighthub.BikeRentalSystem.DaoInterface;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.alighthub.BikeRentalSystem.Model.CustomerDetails;
import com.alighthub.BikeRentalSystem.Model.LoginDetails;

@Repository
public interface CustomerRepository extends JpaRepository<CustomerDetails, Integer> {
		
	
		@Query("from CustomerDetails c where c.customer_login.login_id=:id")
		CustomerDetails findByCustomer_Login(int id);
}
