package com.CCRMS.service;

import java.util.List;

import com.CCRMS.model.Patient;

public interface PatientService {
	
	public List<Patient> getAllPatientInfo();
	
	public boolean insertPatient(Patient patient);
		
	public boolean deletePatient(Long id);

	public Patient getPatientById(Long id);
	
	public Long updatePatient(Patient patient);
	
	

}
