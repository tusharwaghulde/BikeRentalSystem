package com.alighthub.BikeRentalSystem.ServiceImplementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alighthub.BikeRentalSystem.DaoInterface.DealerRepository;
import com.alighthub.BikeRentalSystem.Model.DealerDetails;
import com.alighthub.BikeRentalSystem.ServiceInterface.DealerServiceInterface;

@Service
public class DealerServiceImplementation implements DealerServiceInterface{
	
	@Autowired 
	DealerRepository Dealerdao;
	@Override
	public void addDealer(DealerDetails dealer) {
			Dealerdao.save(dealer);
			
	}

	@Override
	public DealerDetails showDealer(int id) {
		return Dealerdao.findById(id).get();
			
	}

	@Override
	public DealerDetails editDealer(int dealer_id) {
		// TODO Auto-generated method stub
		return Dealerdao.findById(dealer_id).get();
	}

	@Override
	public void updateDealer(DealerDetails dealer) {
		// TODO Auto-generated method stub
		Dealerdao.save(dealer);
	}

	@Override
	public List<DealerDetails> deleteDealer(int dealer_id) {
		// TODO Auto-generated method stub
		Dealerdao.deleteById(dealer_id);
		return Dealerdao.findAll();
	}

	@Override
	public List<DealerDetails> showAllDealer() {
		// TODO Auto-generated method stub
		return Dealerdao.findAll();
	}

	
}
