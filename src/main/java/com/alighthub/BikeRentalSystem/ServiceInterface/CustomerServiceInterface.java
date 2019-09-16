package com.alighthub.BikeRentalSystem.ServiceInterface;

import java.util.List;

import com.alighthub.BikeRentalSystem.Model.CustomerDetails;



public interface CustomerServiceInterface {
	public void addCustomer(CustomerDetails customer);
	public CustomerDetails showCustomer(int id);
	public CustomerDetails editCustomer(int customer_id);
	public void updateCustomer(CustomerDetails customer);
	public List<CustomerDetails> deleteCustomer(int customer_id);
	public List<CustomerDetails> showAllCustomer();
	


}
