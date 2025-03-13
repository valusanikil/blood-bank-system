package com.bloodbank.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bloodbank.entity.BloodDonation;
import com.bloodbank.service.BloodDonationService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class BloodDonationController {
	
	@Autowired
	private BloodDonationService bloodDonationService;
	
	@PostMapping("blooddonation")
	public BloodDonation createNewBloodDonation(@Valid @RequestBody BloodDonation bloodDonation) {
		BloodDonation newBloodDonation=bloodDonationService.createNewBloodDonation(bloodDonation);
		return newBloodDonation;
	}
}
