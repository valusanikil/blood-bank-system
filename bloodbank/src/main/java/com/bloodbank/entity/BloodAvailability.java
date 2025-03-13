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
public class BloodAvailability {

	@Id
	@NotNull(message="Id is a required field")
	@Min(value=1, message="Id should be greater than 1")
	@Max(value=1000, message="Id should be less than 1000")
	@Positive(message="Id should not be in negative")
	private int baId;

	@NotEmpty(message="State is a required field")
	@Pattern(regexp = "^[A-Z][a-z]*$", message="State starts with capital letter & contain one word")
	private String baState;
	
	@NotEmpty(message="Area is a required field")
	@Pattern(regexp = "^[A-Z][a-z]*$", message="Area starts with capital letter & contain one word")
	private String baArea;
	
	@NotNull(message="Pincode is a required field")
	@Min(value=100000,message = "Pincode contains 6 digits")
	@Max(value=999999,message = "Pincode contains 6 digits")
	private int baPincode;
	
	@NotEmpty(message="Blood group cannot be null")
	@Pattern(regexp = "^(A|B|AB|O)[-+]$", message = "Valid blood groups are O,A,B,AB and append + or -")
	private String baBloodGroup;

	public BloodAvailability() {

	}

	public BloodAvailability(int baId, String baState, String baArea, int baPincode, String baBloodGroup) {
		super();
		this.baId = baId;
		this.baState = baState;
		this.baArea = baArea;
		this.baPincode = baPincode;
		this.baBloodGroup = baBloodGroup;
	}

	public int getBaId() {
		return baId;
	}

	public void setBaId(int baId) {
		this.baId = baId;
	}

	public String getBaState() {
		return baState;
	}

	public void setBaState(String baState) {
		this.baState = baState;
	}

	public String getBaArea() {
		return baArea;
	}

	public void setBaArea(String baArea) {
		this.baArea = baArea;
	}

	public int getBaPincode() {
		return baPincode;
	}

	public void setBaPincode(int baPincode) {
		this.baPincode = baPincode;
	}

	public String getBaBloodGroup() {
		return baBloodGroup;
	}

	public void setBaBloodGroup(String baBloodGroup) {
		this.baBloodGroup = baBloodGroup;
	}

	@Override
	public String toString() {
		return "BloodAvailability [baId=" + baId + ", baState=" + baState + ", baArea=" + baArea + ", baPincode="
				+ baPincode + ", baBloodGroup=" + baBloodGroup + "]";
	}

}
