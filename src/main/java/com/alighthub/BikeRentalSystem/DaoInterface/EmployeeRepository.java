package com.alighthub.BikeRentalSystem.DaoInterface;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


import com.alighthub.BikeRentalSystem.Model.EmployeeDetails;

@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeDetails, Integer>
{
	@Query("from EmployeeDetails e where e.employee_login.login_id=:id")
	EmployeeDetails findByEmployee_Login(int id);
}
