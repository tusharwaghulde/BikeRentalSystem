package com.alighthub.BikeRentalSystem.ServiceImplementation;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alighthub.BikeRentalSystem.DaoInterface.CustomerRepository;
import com.alighthub.BikeRentalSystem.DaoInterface.LoginRepository;
import com.alighthub.BikeRentalSystem.Model.CustomerDetails;
import com.alighthub.BikeRentalSystem.Model.LoginDetails;
import com.alighthub.BikeRentalSystem.ServiceInterface.CustomerServiceInterface;

@Service
public class CustomerServiceImplementation implements CustomerServiceInterface {
	
	@Autowired
	CustomerRepository customerdao;
	
	
	@Override
	public void addCustomer(CustomerDetails customer) {
			customerdao.save(customer);
			
	}

	@Override
	public CustomerDetails showCustomer(int id) {
		return customerdao.findByCustomer_Login(id);
			
	}

	@Override
	public CustomerDetails editCustomer(int customer_id) {
		// TODO Auto-generated method stub
		return customerdao.findById(customer_id).get();
	}

	@Override
	public void updateCustomer(CustomerDetails customer) {
		// TODO Auto-generated method stub
		customerdao.save(customer);
	}

	@Override
	public List<CustomerDetails> deleteCustomer(int customer_id) {
		// TODO Auto-generated method stub
		customerdao.deleteById(customer_id);
		return customerdao.findAll();
	}

	@Override
	public List<CustomerDetails> showAllCustomer() {
		// TODO Auto-generated method stub
		return customerdao.findAll();
	}

	
}
