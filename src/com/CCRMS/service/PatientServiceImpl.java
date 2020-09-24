package com.CCRMS.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.CCRMS.dao.PatientDao;
import com.CCRMS.model.Patient;

@Service
@Transactional
public class PatientServiceImpl implements PatientService{
	
	@Autowired
	private PatientDao patientDao;
		
	@Override
	public List<Patient> getAllPatientInfo() {
		return patientDao.getAllPatientes();
	}

	@Override
	public boolean insertPatient(Patient patient) {
		return patientDao.insertPatient(patient);
		
	}

	@Override
	public boolean deletePatient(Long id) {
		return patientDao.deletePatient(id);
		
	}

	@Override
	public Patient getPatientById(Long id) {
		return patientDao.getPatientById(id);
	}

	@Override
	public Long updatePatient(Patient patient) {
		patientDao.updatePatient(patient);
		  return  patient.getId();
	}
	@Override
	public Search<Patient> getPatientById(Long id) {
		return patientDao.getPatientById(id);
	
		
	}
	

	
	

}
