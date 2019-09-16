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

import com.alighthub.BikeRentalSystem.Model.DealerDetails;
import com.alighthub.BikeRentalSystem.ServiceInterface.DealerServiceInterface;

@RestController
@CrossOrigin("*")
@RequestMapping("/deal")
public class DealerController {
	
	@Autowired
	DealerServiceInterface service;
	@PostMapping("/addDealer")
	public String addDealer(@RequestBody DealerDetails dealer ) {
		
		service.addDealer(dealer);
		return "Dealer added successful";
		
	}
	
	@GetMapping("/getDealer/{id}")
	public DealerDetails showDealer(@PathVariable int id) {
		return service.showDealer(id);
			 
	}
	
	@GetMapping("/editDealer/{Dealer_id}")
	public DealerDetails editDealer(@PathVariable int dealer_id) {
		return service.editDealer(dealer_id);
	}
	
	@PatchMapping("/updateDealer")
	public String updateDealer(@RequestBody DealerDetails Dealer)
	{
		service.updateDealer(Dealer);
		return "Dealer Updated";
	}
	
	@DeleteMapping("/deleteDealer/{Dealer_id}")
	public List<DealerDetails> deleteDealer(@PathVariable int Dealer_id){
		return service.deleteDealer(Dealer_id);
	}
	
	@GetMapping("/showAllDealers")
	public List<DealerDetails> showAllDealers()
	{
		return service.showAllDealer();
	}

}
