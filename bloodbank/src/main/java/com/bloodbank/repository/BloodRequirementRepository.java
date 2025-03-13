package com.bloodbank.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bloodbank.entity.BloodRequirement;

@Repository
public interface BloodRequirementRepository extends JpaRepository<BloodRequirement, Integer>{

}
