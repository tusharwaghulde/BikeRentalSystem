package com.alighthub.BikeRentalSystem.ServiceInterface;

import java.util.List;

import com.alighthub.BikeRentalSystem.Model.DealerDetails;

public interface DealerServiceInterface {

	void addDealer(DealerDetails dealer);

	DealerDetails showDealer(int id);

	DealerDetails editDealer(int dealer_id);

	void updateDealer(DealerDetails dealer);

	List<DealerDetails> deleteDealer(int dealer_id);

	List<DealerDetails> showAllDealer();

}
