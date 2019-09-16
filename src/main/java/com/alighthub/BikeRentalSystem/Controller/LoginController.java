package com.alighthub.BikeRentalSystem.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alighthub.BikeRentalSystem.Model.LoginDetails;
import com.alighthub.BikeRentalSystem.ServiceInterface.LoginServiceInterface;

@RestController
@CrossOrigin("*")
@RequestMapping("/login")
public class LoginController {
	
	@Autowired
	LoginServiceInterface service;
	@GetMapping("/get/{username}/{password}")
	public LoginDetails show(@PathVariable String username,@PathVariable String password) {
		return service.show(username,password);
			 
	}
}
