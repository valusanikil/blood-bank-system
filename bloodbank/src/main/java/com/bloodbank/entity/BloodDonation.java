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
public class BloodDonation {
	
	@Id
	@NotNull(message="Id is a required field")
	@Min(value=1, message="Id should be greater than 1")
	@Max(value=1000, message="Id should be less than 1000")
	@Positive(message="Id should not be in negative")
	private int bdId;
	
	@NotEmpty(message="State is a required field")
	@Pattern(regexp = "^[A-Z][a-z]*$", message="State starts with capital letter & contain one word")
	private String bdState;
	
	@NotEmpty(message="Area is a required field")
	@Pattern(regexp = "^[A-Z][a-z]*$", message="Area starts with capital letter & contain one word")
	private String bdArea;
	
	@NotNull(message="Pincode is a required field")
	@Min(value=100000,message = "Pincode contains 6 digits")
	@Max(value=999999,message = "Pincode contains 6 digits")
	private int bdPincode;
	
	@NotEmpty(message="Blood group cannot be empty")
	@Pattern(regexp = "^(A|B|AB|O)[-+]$", message = "Valid blood groups are O,A,B,AB and append + or -")
	private String bdBloodGroup;
	
	@NotEmpty(message="Hospital Name cannot be empty")
	@Pattern(regexp = "^[A-Z][a-z]*$", message="Hospital name starts with capital letter & contain one word")
	private String bdHospitalName;
	
	@NotEmpty(message="Date cannot be empty")
	@Pattern(regexp = "^(0?[1-9]|[12][0-9]|3[01])[\\/\\-](0?[1-9]|1[012])[\\/\\-]\\d{4}$",message = "Ex date format: DD-MM-YYYY")
	private String bdDate;
	
	@NotEmpty(message="Time cannot be empty")
	@Pattern(regexp = "^(0[0-9]|1[0-9]|2[0-3]):[0-5][0-9]$",message = "Time format ex: HH:MM")
	private String bdTime;
	
	@NotEmpty(message="City cannot be empty")
	@Pattern(regexp = "^[A-Z][a-z]*$", message="City name starts with capital letter & contain one word")
	private String bdCity;
	
	public BloodDonation() {
		
	}

	public BloodDonation(int bdId, String bdState, String bdArea, int bdPincode, String bdBloodGroup,
			String bdHospitalName, String bdDate, String bdTime, String bdCity) {
		super();
		this.bdId = bdId;
		this.bdState = bdState;
		this.bdArea = bdArea;
		this.bdPincode = bdPincode;
		this.bdBloodGroup = bdBloodGroup;
		this.bdHospitalName = bdHospitalName;
		this.bdDate = bdDate;
		this.bdTime = bdTime;
		this.bdCity = bdCity;
	}

	public int getBdId() {
		return bdId;
	}

	public void setBdId(int bdId) {
		this.bdId = bdId;
	}

	public String getBdState() {
		return bdState;
	}

	public void setBdState(String bdState) {
		this.bdState = bdState;
	}

	public String getBdArea() {
		return bdArea;
	}

	public void setBdArea(String bdArea) {
		this.bdArea = bdArea;
	}

	public int getBdPincode() {
		return bdPincode;
	}

	public void setBdPincode(int bdPincode) {
		this.bdPincode = bdPincode;
	}

	public String getBdBloodGroup() {
		return bdBloodGroup;
	}

	public void setBdBloodGroup(String bdBloodGroup) {
		this.bdBloodGroup = bdBloodGroup;
	}

	public String getBdHospitalName() {
		return bdHospitalName;
	}

	public void setBdHospitalName(String bdHospitalName) {
		this.bdHospitalName = bdHospitalName;
	}

	public String getBdDate() {
		return bdDate;
	}

	public void setBdDate(String bdDate) {
		this.bdDate = bdDate;
	}

	public String getBdTime() {
		return bdTime;
	}

	public void setBdTime(String bdTime) {
		this.bdTime = bdTime;
	}

	public String getBdCity() {
		return bdCity;
	}

	public void setBdCity(String bdCity) {
		this.bdCity = bdCity;
	}

	@Override
	public String toString() {
		return "BloodDonation [bdId=" + bdId + ", bdState=" + bdState + ", bdArea=" + bdArea + ", bdPincode="
				+ bdPincode + ", bdBloodGroup=" + bdBloodGroup + ", bdHospitalName=" + bdHospitalName + ", bdDate="
				+ bdDate + ", bdTime=" + bdTime + ", bdCity=" + bdCity + "]";
	}
	
}
