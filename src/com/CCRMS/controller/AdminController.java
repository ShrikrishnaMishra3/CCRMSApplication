package com.CCRMS.controller;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.sql.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.CCRMS.model.Patient;
import com.CCRMS.service.PatientService;

@Controller
public class AdminController {

	@Autowired
	private PatientService patientService;

	@RequestMapping(value = "/")
	public ModelAndView showHomePage(HttpServletResponse response) throws IOException {
		return new ModelAndView("index");
	}

	@RequestMapping(value = "/addPatient")
	public ModelAndView addNote(HttpServletResponse response) throws IOException {
		return new ModelAndView("addPatient");
	}

	@RequestMapping(value = "/deletePatient")
	public ModelAndView deleteNote(HttpServletRequest request) throws IOException {
		Long patientid = Long.parseLong(request.getParameter("id"));
		patientService.deletePatient(patientid);
		List<Patient> patientes = patientService.getAllPatientInfo();
		return new ModelAndView("tracker", "patientes", patientes);

	}

	@RequestMapping(value = "/editPatient")
	public ModelAndView editBill(HttpServletRequest request) throws IOException {
		System.out.println("EditPatientMetod");
		Long id = Long.parseLong(request.getParameter("id"));
		System.out.println((request.getParameter("id")));
		Patient patient = patientService.getPatientById(id);
		return new ModelAndView("update", "patient", patient);
	}

	@RequestMapping(value = "/PatientTracker")
	public ModelAndView Tracker(HttpServletResponse response) throws IOException {
		List<Patient> patientes = patientService.getAllPatientInfo();
		return new ModelAndView("PatientTracker", "patientes", patientes);
	}

	@RequestMapping(value = "/viewlAll")
	public ModelAndView viewlAll(HttpServletResponse response) throws IOException {
		List<Patient> patientes = patientService.getAllPatientInfo();
		return new ModelAndView("viewall", "patientes", patientes);

	}

	@RequestMapping(value = "/updatePatient", method = RequestMethod.POST)
	public ModelAndView updatePatient(@ModelAttribute("patient") Patient patient) {
		patientService.updatePatient(patient);
		return new ModelAndView("redirect:/PatientTracker");
	}

	@RequestMapping(value = "/addPatient")
	public ModelAndView addNewBill(HttpServletRequest request) throws Exception {
		System.out.println("please Add Patient");
		String AadharId = request.getParameter("AadharId");
		String Name = request.getParameter("Name");
		String State = request.getParameter("State");
		String City= request.getParameter("City");
		String PinCode = request.getParameter("PinCode");
		String Status = request.getParameter("Status");
	

		Patient patient = new Patient();
		patient.setAadharId(AadharId);
		patient.setName(Name);
		patient.setState(State);
		patient.setCity(City);
		patient.setPinCode(PinCode);
		patient.setStatus(Status);
	
		patientService.insertPatient(patient);

		return new ModelAndView("redirect:/PatientTracker");
	}

}
