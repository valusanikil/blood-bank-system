package com.bloodbank.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bloodbank.entity.BloodDonation;

@Repository
public interface BloodDonationRepository extends JpaRepository<BloodDonation, Integer>{

}
