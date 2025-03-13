package com.bloodbank.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bloodbank.entity.BloodAvailability;
import com.bloodbank.repository.BloodAvailabilityRepository;

@Service
public class BloodAvailabilityService {

	@Autowired
	private BloodAvailabilityRepository bloodAvailabilityRepository;

	public List<BloodAvailability> getBloodAvailabilityByState(String baState) {
		return bloodAvailabilityRepository.findByBaState(baState);
	}
	
	public List<BloodAvailability> getBloodAvailabilityByArea(String baArea) {
		return bloodAvailabilityRepository.findByBaArea(baArea);
	}
	
	public List<BloodAvailability> getBloodAvailabilityByPincode(int baPincode) {
		return bloodAvailabilityRepository.findByBaPincode(baPincode);
	}
	
	public List<BloodAvailability> getBloodAvailabilityByBloodGroup(String baBloodGroup) {
		return bloodAvailabilityRepository.findByBaBloodGroup(baBloodGroup);
	}

	public BloodAvailability createBloodAvailability(BloodAvailability bloodAvailability) {
		return bloodAvailabilityRepository.save(bloodAvailability);
	}

	public Optional<BloodAvailability> getBloodAvailabilityById(int baId) {
		return bloodAvailabilityRepository.findById(baId);
	}

	public List<BloodAvailability> getAllBloodAvailabilities() {
		return bloodAvailabilityRepository.findAll();
	}

	public void deleteBloodAvailabilityById(int baId) {
		bloodAvailabilityRepository.deleteById(baId);
	}

	public BloodAvailability updateBloodAvailability(BloodAvailability bloodAvailability, int baId) {
		BloodAvailability currentBaObj=bloodAvailabilityRepository.findById(baId).get();
		currentBaObj.setBaId(bloodAvailability.getBaId());
		currentBaObj.setBaState(bloodAvailability.getBaState());
		currentBaObj.setBaArea(bloodAvailability.getBaArea());
		currentBaObj.setBaPincode(bloodAvailability.getBaPincode());
		currentBaObj.setBaBloodGroup(bloodAvailability.getBaBloodGroup());
		return bloodAvailabilityRepository.save(currentBaObj);
	}
}
