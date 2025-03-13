package com.bloodbank.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import com.bloodbank.entity.BloodAvailability;
import com.bloodbank.service.BloodAvailabilityService;

@WebMvcTest(BloodAvailabilityController.class)
class BloodAvailabilityControllerTest {
	
	@Autowired
	private MockMvc mvc;
	
	@MockBean
	private BloodAvailabilityService bloodAvailabilityService;

	@Test
	void testGetAllBloodAvailabilities() throws Exception {
		BloodAvailability baObj1=new BloodAvailability(121,"Tamilnadu","chennai",909090,"O+");
		BloodAvailability baObj2=new BloodAvailability(122,"Bihar","Boston",809090,"O-");
		BloodAvailability baObj3=new BloodAvailability(123,"Kerala","kutti",906090,"A+");
		List<BloodAvailability> list=new ArrayList<BloodAvailability>();
		list.add(baObj1);
		list.add(baObj2);
		list.add(baObj3);
		Mockito.when(bloodAvailabilityService.getAllBloodAvailabilities()).thenReturn(list);
		mvc.perform(
				get("/bloodavailable/getallbloodavailable").
				contentType(MediaType.APPLICATION_JSON).
				accept(MediaType.APPLICATION_JSON)).
				andDo(print()).andExpect(status().isOk());
	}
	
	@Test
	void testGetBloodAvailabilityById() throws Exception {
		Optional<BloodAvailability> baObj=Optional.of(new BloodAvailability(111,"Andhra","Kurnool",509000,"AB+"));
		Mockito.when(bloodAvailabilityService.getBloodAvailabilityById(111)).thenReturn(baObj);
		mvc.perform(
				get("/bloodavailable/111")
				.contentType(MediaType.APPLICATION_JSON)
				.accept(MediaType.APPLICATION_JSON))
				.andDo(print())
				.andExpect(status().isOk());
	}
}
