package com.CCRMS.dao;

import java.util.List;

import com.CCRMS.model.Patient;

public interface PatientDao {
	
public List<Patient> getAllPatientInfo();
	
	public boolean insertPatient(Patient patient);
	public boolean deletePatient(Long id);
	public Patient getPatientById(Long id);
	public List<Patient> getAllPatientes();
	public Long updatePatient(Patient patient);
	public Search<Patient> getPatientById(Long id);
	
		
}
