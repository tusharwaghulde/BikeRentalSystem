package com.alighthub.BikeRentalSystem.ServiceImplementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alighthub.BikeRentalSystem.DaoInterface.LoginRepository;
import com.alighthub.BikeRentalSystem.Model.LoginDetails;
import com.alighthub.BikeRentalSystem.ServiceInterface.LoginServiceInterface;

@Service
public class LoginServiceImplementation implements LoginServiceInterface{

	@Autowired
	LoginRepository logindao;
	
	@Override
	public LoginDetails show(String username, String password) {
		// TODO Auto-generated method stub
		return logindao.findByUsernameAndPassword(username, password);
	}
	
	
	
}
