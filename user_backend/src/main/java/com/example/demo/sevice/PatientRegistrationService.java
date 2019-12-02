package com.example.demo.sevice;

import java.util.List;
import java.util.Map;


import org.springframework.http.ResponseEntity;

import com.example.demo.entity.PatientRegistration;
import com.example.demo.exception.ResourceNotFoundException;

public interface PatientRegistrationService {
	
	List<PatientRegistration> getAllPatientRegistration();

	ResponseEntity<PatientRegistration> getPatientRegistrationById(Integer patientRegistrationId) throws ResourceNotFoundException;

	PatientRegistration createPatientRegistration(PatientRegistration patientRegistration);

	ResponseEntity<PatientRegistration> updatePatientRegistration(Integer patientRegistrationId, PatientRegistration patientRegistrationDetails) throws ResourceNotFoundException;

	Map<String, Boolean> deletePatientRegistration(Integer patientRegistrationId) throws ResourceNotFoundException;
	
	ResponseEntity<PatientRegistration> getPatientRegistrationByEmail(String email) throws ResourceNotFoundException;

	
}
