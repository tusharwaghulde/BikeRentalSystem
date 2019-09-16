package com.alighthub.BikeRentalSystem.DaoInterface;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.alighthub.BikeRentalSystem.Model.LoginDetails;

@Repository
public interface LoginRepository extends JpaRepository<LoginDetails, Integer> {
	@Query("from LoginDetails where login_username=:username and login_password=:password")
	LoginDetails findByUsernameAndPassword(String username,String password);
}
