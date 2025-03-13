package com.bb.controller;

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

import com.bb.entity.Admin;
import com.bb.entity.BloodAvailability;
import com.bb.exception.InvalidException;
import com.bb.exception.NoDataFoundException;
import com.bb.service.AdminService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class AdminController {

	@Autowired
	private AdminService adminService;

	@PostMapping("/registeradmin")
	public Admin registerAdmin(@Valid @RequestBody Admin admin) throws Exception {
		String tempAdminEmail = admin.getAdminEmail();
		if (tempAdminEmail != null && !"".equals(tempAdminEmail)) {
			Admin adminObj = adminService.getAdminByEmail(tempAdminEmail);
			if (adminObj != null) {
				throw new Exception("Admin with " + tempAdminEmail + " is already exist");
			}
		}
		Admin adminObj = null;
		adminObj = adminService.saveAdmin(admin);
		return adminObj;
	}

	@PostMapping("/loginadmin")
	public Admin loginAdmin(@RequestBody Admin admin) throws InvalidException {
		String tempAdminEmail = admin.getAdminEmail();
		String tempAdminPassword = admin.getAdminPassword();
		Admin adminObj = null;
		if (tempAdminEmail != null && tempAdminPassword != null) {
			adminObj = adminService.getAdminByEmailAndPassword(tempAdminEmail, tempAdminPassword);
		}
		if (adminObj == null) {
			throw new InvalidException("Invalid Credentials");
		}
		return adminObj;
	}

	@GetMapping("admin/bloodavailable/{id}")
	public BloodAvailability getBloodAvailabilityByIdFromAdmin(@PathVariable("id") int baId) {
		return adminService.getBloodAvailabilityByIdFromAdmin(baId);
	}

	@GetMapping("admin/bloodavailable/getallbloodavailable")
	public List<BloodAvailability> getAllBloodAvailabilityFromAdmin() throws NoDataFoundException {
		List<BloodAvailability> bloodList=adminService.getAllBloodAvailableFromAdmin();
		if(bloodList.isEmpty()) {
			throw new NoDataFoundException("No data found");
		}
		return bloodList;
	}
	
	@PostMapping("admin/bloodavailable/add")
	public BloodAvailability createBloodAvailability(@Valid @RequestBody BloodAvailability bloodAvailability) {
		return adminService.createBloodAvailability(bloodAvailability);
	}
	
	@DeleteMapping("admin/bloodavailable/delete/{id}")
	public void deleteBloodById(@PathVariable("id") int baId) {
		adminService.deleteBloodById(baId);
	}
	
	@PutMapping("admin/bloodavailable/update/{id}")
	public BloodAvailability updateBloodAvailability(@RequestBody BloodAvailability bloodAvailability,
			@PathVariable ("id") int baId) {
		return adminService.updateBloodAvailability(bloodAvailability,baId);
	}
}
