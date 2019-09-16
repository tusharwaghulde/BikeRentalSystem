package com.alighthub.BikeRentalSystem.DaoInterface;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.alighthub.BikeRentalSystem.Model.DealerDetails;

@Repository
public interface DealerRepository extends JpaRepository<DealerDetails, Integer> {

}
