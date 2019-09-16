package com.alighthub.BikeRentalSystem.ServiceInterface;

import java.util.List;

import com.alighthub.BikeRentalSystem.Model.EmployeeDetails;

public interface EmployeeServiceInterface {

	void addEmployee(EmployeeDetails employee);

	EmployeeDetails showEmployee(int id);

	EmployeeDetails editEmployee(int employee_id);

	void updateEmployee(EmployeeDetails employee);

	List<EmployeeDetails> deleteEmployee(int employee_id);

	List<EmployeeDetails> showAllEmployee();

}
