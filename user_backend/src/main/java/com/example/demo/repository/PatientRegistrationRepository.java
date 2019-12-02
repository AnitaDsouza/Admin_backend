package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Enquiry;
import com.example.demo.entity.PatientRegistration;

@Repository
public interface PatientRegistrationRepository extends JpaRepository<PatientRegistration, Integer>{

	ResponseEntity<PatientRegistration> findByEmail(String email);

	
}