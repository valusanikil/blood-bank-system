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

import com.bb.entity.Admin;
import com.bb.entity.BloodAvailability;
import com.bb.repository.AdminRepository;

@Service
public class AdminService {
	
	@Autowired
	private AdminRepository adminRepository;
	
	@Autowired
	private RestTemplate restTemplate;
	
	public Admin saveAdmin(Admin admin) {
		return adminRepository.save(admin);
	}
	
	public Admin getAdminByEmail(String email) {
		return adminRepository.findByAdminEmail(email);
	}

	public Admin getAdminByEmailAndPassword(String email,String password) {
		return adminRepository.findByAdminEmailAndAdminPassword(email,password);
	}
	
	public BloodAvailability getBloodAvailabilityByIdFromAdmin(int baId) {
		BloodAvailability bloodAvailability=restTemplate.getForObject("http://localhost:8090/bloodavailable/"+baId, BloodAvailability.class);
		return bloodAvailability;
	}

	public List<BloodAvailability> getAllBloodAvailableFromAdmin() {
		HttpHeaders headers=new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity<String> entity=new HttpEntity<String>(headers);
		ResponseEntity<List<BloodAvailability>> response=restTemplate.exchange("http://localhost:8090/bloodavailable/getallbloodavailable",
				HttpMethod.GET, entity,new ParameterizedTypeReference<List<BloodAvailability>>() {});
		return response.getBody();
	}

	public BloodAvailability createBloodAvailability(BloodAvailability bloodAvailability) {
		HttpHeaders headers=new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity<BloodAvailability> entity=new HttpEntity<BloodAvailability>(bloodAvailability,headers);
		ResponseEntity<BloodAvailability> response=restTemplate.exchange("http://localhost:8090/bloodavailable", HttpMethod.POST,entity,BloodAvailability.class);
		return response.getBody();
	}

	public void deleteBloodById(int baId) {
		HttpHeaders headers=new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity<BloodAvailability> entity=new HttpEntity<BloodAvailability>(headers);
		restTemplate.exchange("http://localhost:8090/bloodavailable/delete/"+baId, HttpMethod.DELETE,entity,BloodAvailability.class);
		
	}

	public BloodAvailability updateBloodAvailability(BloodAvailability bloodAvailability,int baId) {
		HttpHeaders headers=new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity<BloodAvailability> entity=new HttpEntity<BloodAvailability>(bloodAvailability,headers);
		ResponseEntity<BloodAvailability> response=restTemplate.exchange("http://localhost:8090/bloodavailable/update/"+baId,
                HttpMethod.PUT,entity,BloodAvailability.class);
		return response.getBody();
	}
}
