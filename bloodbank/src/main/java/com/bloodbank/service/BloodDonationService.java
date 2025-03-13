package com.bloodbank.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bloodbank.entity.BloodDonation;
import com.bloodbank.repository.BloodDonationRepository;

@Service
public class BloodDonationService {

	@Autowired
	private BloodDonationRepository bloodDonationRepository;

	public BloodDonation createNewBloodDonation(BloodDonation bloodDonation) {
		return bloodDonationRepository.save(bloodDonation);
	}
	
}
