package com.bb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bb.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{

	public User findByUserEmail(String email);

	public User findByUserEmailAndUserPassword(String email,String password);

}
