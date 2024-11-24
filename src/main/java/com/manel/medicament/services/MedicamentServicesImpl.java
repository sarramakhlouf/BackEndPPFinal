package com.manel.medicament.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.manel.medicament.entities.medicament;

@Service
public class MedicamentServicesImpl implements MedicamentServices{
	@Autowired 
	 com.manel.medicament.repos.medicamentRepository medicamentRepository;
	
	@Override
	public medicament saveMedicament(medicament e) {
		return medicamentRepository.save(e);
	}

	@Override
	public medicament updateMedicament(medicament e) {
		// TODO Auto-generated method stub
		return medicamentRepository.save(e);
	}
	

	@Override
	public void deleteMedicament(medicament e) {
		medicamentRepository.delete(e);
	}

	@Override
	public void deleteMedicamentById(Long id) {
		medicamentRepository.deleteById(id);
		
	}

	
	public medicament getMedicament(Long id) {
		return medicamentRepository.findById(id).get();
	}
	@Override
	public List<medicament> getAllMedicaments() {
		return medicamentRepository.findAll();
	}

	@Override
	public List<medicament> findByNom(String nom) {
		
		return medicamentRepository.findByNom(nom);
	}

	@Override
	public List<medicament> findByNomContains(String nom) {
		// TODO Auto-generated method stub
		return medicamentRepository.findByNomContains(nom);
	}

	

	

	@Override
	public List<medicament> findByOrderByNomAsc() {
		// TODO Auto-generated method stub
		return medicamentRepository.findByOrderByNomAsc();
	}

	
	public List<medicament> trierMedicamentsNom() {
		// TODO Auto-generated method stub
		return medicamentRepository.trierMedicamentsNom();
	}

	

	@Override
	public List<medicament> trierMedicamentNom() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<medicament> getAllMedicament() {
		// TODO Auto-generated method stub
		 return medicamentRepository.findAll();
	}

	/*@Override
	public medicament updateMedicament(medicament m) {
		// TODO Auto-generated method stub
		return null;
	}*/

	

}
