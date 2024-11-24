package com.manel.medicament.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.manel.medicament.entities.medicament;


@Service
public interface MedicamentServices {

	medicament saveMedicament(medicament m); 
	medicament updateMedicament(medicament m); 
	void deleteMedicament(medicament m); 
	void deleteMedicamentById(Long id); 
	List<medicament> getAllMedicament(); 
	List<medicament> findByNom(String nom);
	List<medicament> findByNomContains(String nom);
	List<medicament> findByOrderByNomAsc();
	List<medicament> trierMedicamentNom();
	List<medicament> getAllMedicaments();
	medicament getMedicament(Long id);
}
