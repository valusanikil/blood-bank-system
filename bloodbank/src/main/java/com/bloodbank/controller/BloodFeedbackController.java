package com.bloodbank.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bloodbank.entity.BloodFeedback;
import com.bloodbank.service.BloodFeedbackService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")

public class BloodFeedbackController {
	
	@Autowired
	private BloodFeedbackService bloodFeedbackService;
	
	@PostMapping("bloodfeedback")
	public BloodFeedback createNewBloodFeedback(@Valid @RequestBody BloodFeedback bloodFeedback) {
		BloodFeedback newBloodFeedback=bloodFeedbackService.createNewBloodFeedback(bloodFeedback);
		return newBloodFeedback;
	}
}
