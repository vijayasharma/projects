package com.bharatonjava.web;



import java.time.LocalDateTime;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.bharatonjava.domain.Patient;
import com.bharatonjava.domain.Prescription;

@Controller
@RequestMapping("/patients")
public class PatientController {	

	private static final Logger logger = LoggerFactory.getLogger(PatientController.class);
	
	@Autowired
	MongoTemplate mongoTemplate;
	public void setMongoTemplate(MongoTemplate mongoTemplate) {
		this.mongoTemplate = mongoTemplate;
	}
	
	@ModelAttribute("home")
	@RequestMapping(path="/test", method = RequestMethod.GET)
	public ModelAndView showHomePage() {
		logger.info("Inside test method...");
		logger.info("mongotempalte: {}", mongoTemplate);
		
		Patient p = new Patient();
		p.setFirstName("Bharat");
		p.setLastName("Sharma");
		
		Prescription p1 = new Prescription("Disprin", LocalDateTime.now(), "Prashant");
		p.getPrescriptions().add(p1);
		
		this.mongoTemplate.save(p);
		ModelAndView mav = new ModelAndView();
		mav.setViewName("home");
		return mav;
	}
	
	@RequestMapping(path="/all", method = RequestMethod.GET)
	public ModelAndView getAllPatients() {
		logger.info("Inside getAllPatients method...");
		
		List<Patient> patients = this.mongoTemplate.findAll(Patient.class);
		logger.info("patients: {}", patients);
		ModelAndView mav = new ModelAndView();
		mav.addObject("patients", patients);
		mav.setViewName("patient/listAllPatients");
		return mav;
	}
	
	@RequestMapping(path="/new", method = RequestMethod.GET)
	public ModelAndView showPatientRegistrationForm() {
		logger.info("Inside showPatientRegistrationForm method...");
				
		ModelAndView mav = new ModelAndView();
		mav.addObject("patient", new Patient());
		mav.setViewName("patient/registerPatient");
		return mav;
	}
	
}
