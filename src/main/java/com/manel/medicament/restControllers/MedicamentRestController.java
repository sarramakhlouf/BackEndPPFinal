package com.manel.medicament.restControllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.manel.medicament.entities.medicament;
import com.manel.medicament.services.MedicamentServices;

import org.springframework.web.bind.annotation.RequestMethod;

@RestController
@RequestMapping("/api/medicament")
@CrossOrigin(origins = "http://localhost:4200")

public class MedicamentRestController {
	@Autowired
	MedicamentServices medicamentService;
	
	@RequestMapping(method=RequestMethod.GET)
	List <medicament> getAllMedicaments(){
		return medicamentService.getAllMedicament();
		
		
	}
	
	@CrossOrigin(origins = "http://localhost:4200")
	@RequestMapping(value="/{id}",method = RequestMethod.GET)
	public medicament getMedicamentById(@PathVariable("id") Long id) {
	return medicamentService.getMedicament(id);
	}
	
	//@RequestMapping(method = RequestMethod.PUT)
	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)

	public medicament updateMedicament(@RequestBody medicament medicament) {
	return medicamentService.updateMedicament(medicament);
	}
	
	
	@RequestMapping(method = RequestMethod.POST)
	public medicament createMedicament(@RequestBody medicament medicament) {
	return medicamentService.saveMedicament(medicament);
	}
	
	@CrossOrigin(origins = "http://localhost:4200")
	@RequestMapping(value="/{id}",method = RequestMethod.DELETE)
	public void deleteMedicament(@PathVariable("id") Long id)
	{
	medicamentService.deleteMedicamentById(id);
	}
	


}



