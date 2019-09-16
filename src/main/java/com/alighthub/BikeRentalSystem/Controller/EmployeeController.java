package com.alighthub.BikeRentalSystem.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alighthub.BikeRentalSystem.Model.EmployeeDetails;
import com.alighthub.BikeRentalSystem.ServiceInterface.EmployeeServiceInterface;


@RestController
@CrossOrigin("*")
@RequestMapping("/emp")
public class EmployeeController {
	
	@Autowired
	EmployeeServiceInterface service;
	
	@PostMapping("/addEmployee")
	public String addEmployee(@RequestBody EmployeeDetails employee ) {
		
		service.addEmployee(employee);
		return "Employee added successful";
		
	}
	
	@GetMapping("/getEmployee/{id}")
	public EmployeeDetails showEmployee(@PathVariable int id) {
		return service.showEmployee(id);
			 
	}
	
	@GetMapping("/editEmployee/{Employee_id}")
	public EmployeeDetails editEmployee(@PathVariable int employee_id) {
		return service.editEmployee(employee_id);
	}
	
	@PatchMapping("/updateEmployee")
	public String updateEmployee(@RequestBody EmployeeDetails employee)
	{
		service.updateEmployee(employee);
		return "Employee Updated";
	}
	
	@DeleteMapping("/deleteEmployee/{Employee_id}")
	public List<EmployeeDetails> deleteEmployee(@PathVariable int employee_id){
		return service.deleteEmployee(employee_id);
	}
	
	@GetMapping("/showAllEmployees")
	public List<EmployeeDetails> showAllEmployees()
	{
		return service.showAllEmployee();
	}
}
