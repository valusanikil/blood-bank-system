package com.bloodbank.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bloodbank.entity.BloodAvailability;

@Repository
public interface BloodAvailabilityRepository extends JpaRepository<BloodAvailability, Integer> {
	
	public List<BloodAvailability> findByBaState(String baState);
	
	public List<BloodAvailability> findByBaArea(String baArea);
	
	public List<BloodAvailability> findByBaPincode(int baPincode);
	
	public List<BloodAvailability> findByBaBloodGroup(String baBloodGroup);
}
