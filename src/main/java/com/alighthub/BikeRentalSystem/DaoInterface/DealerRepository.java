package com.alighthub.BikeRentalSystem.DaoInterface;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.alighthub.BikeRentalSystem.Model.DealerDetails;

@Repository
public interface DealerRepository extends JpaRepository<DealerDetails, Integer> {

	@Query("from DealerDetails d where d.dealer_login.login_id=:id")
	DealerDetails findByDealer_Login(int id);
}
