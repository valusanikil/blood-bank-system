package com.bloodbank.service;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import com.bloodbank.entity.BloodAvailability;
import com.bloodbank.repository.BloodAvailabilityRepository;

@ExtendWith(MockitoExtension.class)
class BloodAvailabilityServiceTest {
	
	@InjectMocks
	private BloodAvailabilityService bloodAvailabilityService;
	
	@Mock
	private BloodAvailabilityRepository bloodAvailabilityRepository;

	@Test
	void testCreateBloodAvailability() {
		BloodAvailability baObj=new BloodAvailability(134,"Telangana","Warangal",506002,"O+");
		Mockito.when(bloodAvailabilityRepository.save(baObj)).thenReturn(baObj);
		BloodAvailability actual=bloodAvailabilityService.createBloodAvailability(baObj);
		assertEquals(baObj, actual);
	}

	@Test
	void testGetBloodAvailabilityById() {
		Optional<BloodAvailability> baObj=Optional.of(new BloodAvailability(111,"Andhra","Kurnool",509000,"AB+"));
		Mockito.when(bloodAvailabilityRepository.findById(111)).thenReturn(baObj);
		Optional<BloodAvailability> actual=bloodAvailabilityService.getBloodAvailabilityById(111);
		assertEquals(baObj,actual);
	}

	@Test
	void testGetAllBloodAvailabilities() {
		BloodAvailability baObj1=new BloodAvailability(121,"Tamilnadu","chennai",909090,"O+");
		BloodAvailability baObj2=new BloodAvailability(122,"Bihar","Boston",809090,"O-");
		BloodAvailability baObj3=new BloodAvailability(123,"Kerala","kutti",906090,"A+");
		List<BloodAvailability> list=new ArrayList<BloodAvailability>();
		list.add(baObj1);
		list.add(baObj2);
		list.add(baObj3);
		Mockito.when(bloodAvailabilityRepository.findAll()).thenReturn(list);
		List<BloodAvailability> actual=bloodAvailabilityService.getAllBloodAvailabilities();
		assertEquals(list,actual);
	}

}
