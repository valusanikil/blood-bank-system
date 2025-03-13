package com.bloodbank.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bloodbank.entity.BloodFeedback;

@Repository
public interface BloodFeedbackRepository extends JpaRepository<BloodFeedback, Integer>{

}
