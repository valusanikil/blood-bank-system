package com.bloodbank.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bloodbank.entity.BloodRequirement;
import com.bloodbank.service.BloodRequirementService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class BloodRequirementController {

	@Autowired
	private BloodRequirementService bloodRequirementService;
	
	@PostMapping("bloodrequirement")
	public BloodRequirement createNewBloodRequirement(@Valid @RequestBody BloodRequirement bloodRequirement) {
		BloodRequirement newBloodRequirement=bloodRequirementService.createNewBloodRequirement(bloodRequirement);
		return newBloodRequirement;
	}
	
	@GetMapping("bloodrequirement/getall")
	public List<BloodRequirement> getAllBloodRequirement(){
		List<BloodRequirement> getAllBlood=bloodRequirementService.getAllBloodRequirement();
		return getAllBlood;
	}
}
