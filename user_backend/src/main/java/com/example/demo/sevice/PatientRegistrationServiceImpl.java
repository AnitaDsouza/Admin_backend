package com.example.demo.sevice;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import com.example.demo.entity.PatientRegistration;
import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.repository.PatientRegistrationRepository;

@Service
public class PatientRegistrationServiceImpl implements PatientRegistrationService {
	
	@Autowired
	PatientRegistrationRepository patientRegistrationrepository;

	@Override
	public List<PatientRegistration> getAllPatientRegistration() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<PatientRegistration> getPatientRegistrationById(Integer patientRegistrationId)
			throws ResourceNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PatientRegistration createPatientRegistration(PatientRegistration patientRegistration) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<PatientRegistration> updatePatientRegistration(Integer patientRegistrationId,
			PatientRegistration patientRegistrationDetails) throws ResourceNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<String, Boolean> deletePatientRegistration(Integer patientRegistrationId)
			throws ResourceNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<PatientRegistration> getPatientRegistrationByEmail(String email)
			throws ResourceNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	
}