package com.bloodbank.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Positive;

@Entity
public class BloodFeedback {
	
	@Id
	@NotNull(message="Id is a required field")
	@Min(value=1, message="Id should be greater than 1")
	@Max(value=1000, message="Id should be less than 1000")
	@Positive(message="Id should not be in negative")
	private int bfId;
	
	@NotEmpty(message="Hospital Name cannot be empty")
	@Pattern(regexp = "^[A-Z][a-z]*$", message="Hospital name starts with capital letter & contain one word")
	private String bfHospitalName;
	
	@NotEmpty(message="City cannot be empty")
	@Pattern(regexp = "^[A-Z][a-z]*$", message="City name starts with capital letter & contain one word")
	private String bfCity;
	
	@NotEmpty(message="Comments cannot be empty")
	private String bfComments;
	
	public BloodFeedback() {
		
	}

	public BloodFeedback(int bfId, String bfHospitalName, String bfCity, String bfComments) {
		super();
		this.bfId = bfId;
		this.bfHospitalName = bfHospitalName;
		this.bfCity = bfCity;
		this.bfComments = bfComments;
	}

	public int getBfId() {
		return bfId;
	}

	public void setBfId(int bfId) {
		this.bfId = bfId;
	}

	public String getBfHospitalName() {
		return bfHospitalName;
	}

	public void setBfHospitalName(String bfHospitalName) {
		this.bfHospitalName = bfHospitalName;
	}

	public String getBfCity() {
		return bfCity;
	}

	public void setBfCity(String bfCity) {
		this.bfCity = bfCity;
	}

	public String getBfComments() {
		return bfComments;
	}

	public void setBfComments(String bfComments) {
		this.bfComments = bfComments;
	}

	@Override
	public String toString() {
		return "BloodFeedback [bfId=" + bfId + ", bfHospitalName=" + bfHospitalName + ", bfCity=" + bfCity
				+ ", bfComments=" + bfComments + "]";
	}
	
}
