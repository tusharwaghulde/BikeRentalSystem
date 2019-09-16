package com.alighthub.BikeRentalSystem.ServiceInterface;

import com.alighthub.BikeRentalSystem.Model.LoginDetails;

public interface LoginServiceInterface {
	public LoginDetails show(String username, String password);
}
