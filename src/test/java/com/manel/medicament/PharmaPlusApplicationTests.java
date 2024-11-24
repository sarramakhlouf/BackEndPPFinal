package com.manel.medicament;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.manel.medicament.entities.medicament;

@SpringBootTest
class PharmaPlusApplicationTests {
	@Autowired 
	private com.manel.medicament.repos.medicamentRepository medicamentRepository;
	
	//@Test
	public void testCreateMedicament() {
		medicament etu = new medicament("Dolirhume","99006699",12400,227);
		medicamentRepository.save(etu);
		
	}
	@Test 
	public void testFindMedicament() 
	{ 
	medicament e = medicamentRepository.findById(1L).get();     
	System.out.println(e); 
	} 
	@Test 
	public void testUpdateMedicament() 
	{ 
	medicament e = medicamentRepository.findById(5L).get();     
	e.setNom("Inflamyl"); 
	medicamentRepository.save(e); 
	} 
	@Test 
	 public void testDeleteMedicament() 
	  { 
	   medicamentRepository.deleteById(7L);
	    
	  } 
	@Test 
	 public void testListerTousMedicaments() 
	  { 
	   List<medicament>  etuds =medicamentRepository.findAll();   
	   for (medicament p : etuds) 
	   { 
	    System.out.println(p); 
	   }   
	  } 
	@Test 
	public void testFindByNom() 
	{ 
	List<medicament> etuds = medicamentRepository.findByNom("maxilase");     
	for (medicament p : etuds) 
	   { 
	    System.out.println(p); 
	   } 
	} 
	@Test
	public void testFindByNomContains() 
	{ 
	List<medicament> etuds = medicamentRepository.findByNomContains("dol");     
	for (medicament p : etuds) 
	   { 
	    System.out.println(p); 
	   } 
	} 
	
	
	@Test
	public void testfindByOrderByNomAsc()
	{
	List<medicament> etuds  = medicamentRepository.findByOrderByNomAsc();
	for (medicament e : etuds)
	{
	System.out.println(e);
	}
	}
	
	@Test
	public void testTrierMedicamentsNom()
	{
	List<medicament> etuds = medicamentRepository.trierMedicamentsNom();
	for (medicament e: etuds)
	{
	System.out.println(e);
	}
	}


	@Test
	void contextLoads() {
	}

}
