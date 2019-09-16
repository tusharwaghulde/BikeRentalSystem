package com.alighthub.BikeRentalSystem.ServiceImplementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alighthub.BikeRentalSystem.DaoInterface.EmployeeRepository;
import com.alighthub.BikeRentalSystem.Model.EmployeeDetails;
import com.alighthub.BikeRentalSystem.ServiceInterface.EmployeeServiceInterface;

@Service
public class EmployeeServiceImplementation implements EmployeeServiceInterface{
	@Autowired
	EmployeeRepository Employeedao;
	
	
	@Override
	public void addEmployee(EmployeeDetails employee) {
			Employeedao.save(employee);
			
	}

	@Override
	public EmployeeDetails showEmployee(int id) {
		return Employeedao.findById(id).get();
			
	}

	@Override
	public EmployeeDetails editEmployee(int employee_id) {
		// TODO Auto-generated method stub
		return Employeedao.findById(employee_id).get();
	}

	@Override
	public void updateEmployee(EmployeeDetails Employee) {
		// TODO Auto-generated method stub
		Employeedao.save(Employee);
	}

	@Override
	public List<EmployeeDetails> deleteEmployee(int employee_id) {
		// TODO Auto-generated method stub
		Employeedao.deleteById(employee_id);
		return Employeedao.findAll();
	}

	@Override
	public List<EmployeeDetails> showAllEmployee() {
		// TODO Auto-generated method stub
		return Employeedao.findAll();
	}

}
