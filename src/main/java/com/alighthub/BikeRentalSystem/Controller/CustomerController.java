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

import com.alighthub.BikeRentalSystem.Model.CustomerDetails;

import com.alighthub.BikeRentalSystem.ServiceInterface.CustomerServiceInterface;


@RestController
@RequestMapping("/cust")
@CrossOrigin("*")
public class CustomerController {
	@Autowired
	CustomerServiceInterface service;
	
	@PostMapping("/addCustomer")
	public String addCustomer(@RequestBody CustomerDetails customer) {
		
		service.addCustomer(customer);
		return "customer added successful";
		
	}
	
	@GetMapping("/getCustomer/{id}")
	public CustomerDetails showCustomer(@PathVariable int id) {
		return service.showCustomer(id);
			 
	}
	
	@GetMapping("/editCustomer/{customer_id}")
	public CustomerDetails editCustomer(@PathVariable int customer_id) {
		return service.editCustomer(customer_id);
	}
	
	@PatchMapping("/updateCustomer")
	public String updateCustomer(@RequestBody CustomerDetails customer)
	{
		service.updateCustomer(customer);
		return "Customer Updated";
	}
	
	@DeleteMapping("/deleteCustomer/{customer_id}")
	public List<CustomerDetails> deleteCustomer(@PathVariable int customer_id){
		return service.deleteCustomer(customer_id);
	}
	
	@GetMapping("/showAllCustomers")
	public List<CustomerDetails> showAllCustomers()
	{
		return service.showAllCustomer();
	}

}
