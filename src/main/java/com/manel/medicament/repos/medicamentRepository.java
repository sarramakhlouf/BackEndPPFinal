package com.manel.medicament.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.manel.medicament.entities.medicament;

@RepositoryRestResource(path = "medicaments")
public interface medicamentRepository extends JpaRepository<medicament, Long>{
	List<medicament> findByNom(String nom);
	List<medicament> findByNomContains(String nom);
	List<medicament> findByOrderByNomAsc();
	
	
	
	

	@Query("select e from medicament e order by e.nom ASC")
	List<medicament> trierMedicamentsNom();
	



}
