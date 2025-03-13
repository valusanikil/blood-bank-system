package com.bloodbank.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bloodbank.entity.BloodFeedback;
import com.bloodbank.repository.BloodFeedbackRepository;


@Service
public class BloodFeedbackService {

	@Autowired
	private BloodFeedbackRepository bloodFeedbackRepository;
	
	public BloodFeedback createNewBloodFeedback(BloodFeedback bloodFeedback) {
		return bloodFeedbackRepository.save(bloodFeedback);
	}
}
