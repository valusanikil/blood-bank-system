package com.bb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bb.entity.Admin;

@Repository
public interface AdminRepository extends JpaRepository<Admin, Integer>{
	
	public Admin findByAdminEmail(String email);

	public Admin findByAdminEmailAndAdminPassword(String email, String password);
}
