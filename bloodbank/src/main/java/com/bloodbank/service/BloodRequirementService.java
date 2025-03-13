package com.bloodbank.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bloodbank.entity.BloodRequirement;
import com.bloodbank.repository.BloodRequirementRepository;

@Service
public class BloodRequirementService {
	
	@Autowired
	private BloodRequirementRepository bloodRequirementRepository;
	
	public BloodRequirement createNewBloodRequirement(BloodRequirement bloodRequirement) {
		return bloodRequirementRepository.save(bloodRequirement);
	}

	public List<BloodRequirement> getAllBloodRequirement() {
		return bloodRequirementRepository.findAll();
	}

}
