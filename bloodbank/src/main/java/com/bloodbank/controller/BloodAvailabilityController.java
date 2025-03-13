package com.bloodbank.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bloodbank.entity.BloodAvailability;
import com.bloodbank.exception.NoBloodAvailabilityFoundException;
import com.bloodbank.service.BloodAvailabilityService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")

public class BloodAvailabilityController {
	
	@Autowired
	private BloodAvailabilityService bloodAvailabilityService;
	
	@GetMapping("bloodavailable/getallbloodavailable")
	public List<BloodAvailability> getAllBloodAvailabilities(){
		List<BloodAvailability> list=bloodAvailabilityService.getAllBloodAvailabilities();
		return list;
	}
		
	@GetMapping("bloodavailable/{id}")
	public Optional<BloodAvailability> getBloodAvailabilityById(@PathVariable ("id") int baId) throws NoBloodAvailabilityFoundException {
		Optional<BloodAvailability> bloodAvailability= Optional.of(bloodAvailabilityService.getBloodAvailabilityById(baId).orElseThrow(
				()->new NoBloodAvailabilityFoundException("No blood found with the id : "+baId)));
		return bloodAvailability;
	}
	
	@GetMapping("bloodavailable/state/{state}")
	public List<BloodAvailability> getBloodAvailabilityByState(@PathVariable ("state") String baState) {
		List<BloodAvailability> bloodAvailabilityByState= bloodAvailabilityService.getBloodAvailabilityByState(baState);
		return bloodAvailabilityByState;
	}
	
	@GetMapping("bloodavailable/area/{area}")
	public List<BloodAvailability> getBloodAvailabilityByArea(@PathVariable ("area") String baArea) {
		List<BloodAvailability> bloodAvailabilityByArea= bloodAvailabilityService.getBloodAvailabilityByArea(baArea);
		return bloodAvailabilityByArea;
	}
	
	@GetMapping("bloodavailable/pincode/{pincode}")
	public List<BloodAvailability> getBloodAvailabilityByPincode(@PathVariable ("pincode") int baPincode) {
		List<BloodAvailability> bloodAvailabilityByPincode= bloodAvailabilityService.getBloodAvailabilityByPincode(baPincode);
		return bloodAvailabilityByPincode;
	}
	
	@GetMapping("bloodavailable/bloodgroup/{bloodgroup}")
	public List<BloodAvailability> getBloodAvailabilityByBloodGroup(@PathVariable ("bloodgroup") String baBloodGroup) {
		List<BloodAvailability> bloodAvailabilityByBloodGroup= bloodAvailabilityService.getBloodAvailabilityByBloodGroup(baBloodGroup);
		return bloodAvailabilityByBloodGroup;
	}
	
	@PostMapping("bloodavailable")
	public BloodAvailability createBloodAvailability(@Valid @RequestBody BloodAvailability bloodAvailability) {
		BloodAvailability newBloodAvailability=bloodAvailabilityService.createBloodAvailability(bloodAvailability);
		return newBloodAvailability;
	}
	
	@DeleteMapping("bloodavailable/delete/{id}")
	public void deleteBloodAvailabilityById(@PathVariable("id") int baId) {
		bloodAvailabilityService.deleteBloodAvailabilityById(baId);
	}
	
	@PutMapping("bloodavailable/update/{id}")
	public BloodAvailability updateBloodAvailability(@RequestBody BloodAvailability bloodAvailability, 
			@PathVariable ("id") int baId) {
		return bloodAvailabilityService.updateBloodAvailability(bloodAvailability, baId);
	}
	
}
