package com.bb.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.bb.entity.BloodAvailability;
import com.bb.entity.User;
import com.bb.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private RestTemplate restTemplate;

	public User saveUser(User user) {
		return userRepository.save(user);
	}

	public User getUserByEmail(String email) {
		return userRepository.findByUserEmail(email);
	}

	public User getUserByEmailAndPassword(String email, String password) {
		return userRepository.findByUserEmailAndUserPassword(email, password);
	}

	public BloodAvailability getBloodAvailabilityByIdFromUser(int baId) {
		BloodAvailability bloodAvailability=restTemplate.getForObject("http://localhost:8090/bloodavailable/"+baId, BloodAvailability.class);
		return bloodAvailability;
	}

	public List<BloodAvailability> getAllBloodAvailableFromUser() {
		HttpHeaders headers=new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity<String> entity=new HttpEntity<String>(headers);
		ResponseEntity<List<BloodAvailability>> response=restTemplate.exchange("http://localhost:8090/bloodavailable/getallbloodavailable",
				HttpMethod.GET, entity,new ParameterizedTypeReference<List<BloodAvailability>>() {});
		return response.getBody();
	}
}
