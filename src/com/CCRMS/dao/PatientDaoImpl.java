package com.CCRMS.dao;

import java.io.Serializable;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.CCRMS.model.Patient;

@Repository
public class PatientDaoImpl implements PatientDao {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List<Patient> getAllPatientes() {
		return sessionFactory.getCurrentSession().createQuery("from Patientes").getResultList();
	}

	@Override
	public boolean insertPatient(Patient patient) {
		Serializable serializable = sessionFactory.getCurrentSession().save(patient);
		if(serializable!=null)
			return true;
		else
			return false;
		
	}

	@Override
	public boolean deletePatient(Long id) {
		Patient patient = (Patient) sessionFactory.getCurrentSession().load(Patient.class, id);
		if (null != patient) {
			this.sessionFactory.getCurrentSession().delete(patient);
		   }
				return true;
			}

	@Override
	public Patient getPatientById(Long id) {
		System.out.println("Dao of getPatientBy iD");
		Patient patient=  sessionFactory.getCurrentSession().load(Patient.class, id);
		System.out.println(patient);
		return patient;

	}

	@Override
	public List<Patient> getAllPatientInfo() {
		return sessionFactory.getCurrentSession().createQuery("from Patientes").getResultList();
	}

	@Override
	public Long updatePatient(Patient patient) {
			sessionFactory.getCurrentSession().update(patient);
			return patient.getId();
	}

}
