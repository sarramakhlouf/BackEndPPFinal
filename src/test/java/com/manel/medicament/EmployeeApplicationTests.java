package com.manel.medicament;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test; 
import org.springframework.boot.test.context.SpringBootTest;

import com.manel.medicament.entities.Employee;
import com.manel.medicament.repos.EmployeeRepository;

import org.springframework.beans.factory.annotation.Autowired;


@SpringBootTest
class EmployeeApplicationTests {
	@Autowired
	private EmployeeRepository employeRepository;

	//@Test
	public void testCreateEmploye() {
		Employee emp = new Employee("saramakkhlouf@gmail.com","Makhlouf Sara",new Date(),50670910);
		employeRepository.save(emp);
		Employee empp = new Employee("boularesm@gmail.com","Boulares Manel",new Date(),52345400);
		employeRepository.save(empp);
		Employee emppp = new Employee("guelbif@gmail.com","Guelbi farah",new Date(),98300780);
		employeRepository.save(emppp);
		Employee empppp = new Employee("kerkenifat@gmail.com","Kerkni Fatma",new Date(),54699800);
		employeRepository.save(empppp);
	}
	@Test
	public void testDeleteEmploye()
	{
		employeRepository.deleteById(3L);
	}
	@Test 
	public void testListerTousEmploye()
	{
		List<Employee> emps = employeRepository.findAll();
			for (Employee em: emps)
			{
				System.out.println(em);
			}
	}
	@Test 
	public void testFindByNomEmploye() {
		List<Employee> emps = employeRepository.findByFullNameEmploye("Boulares Manel");
			for (Employee em : emps) {
				System.out.println(em);
			}
	}
	@Test 
	public void testFindByNomEmployeContains() {
		List<Employee> emps = employeRepository.findByFullNameEmployeContains("Manel Boulares");
			for (Employee em : emps) {
				System.out.println(em);
			}
	}
	@Test
	public void testfindByOrderByNomEmployeAsc() {
		List<Employee> emps= employeRepository.findByOrderByFullNameEmployeAsc();
			for (Employee em : emps) {
				System.out.println(em);
			}
	}
	@Test
	public void testTrierEmployesNom(){
		List<Employee> emps = employeRepository.trierEmployesNom();
		for (Employee em: emps){
			System.out.println(em);
		}
	}	
	@Test
	public void testFindByFullNameEmploye() {
	    List<Employee> emps = employeRepository.findByFullNameEmploye("Manel Boulares");
	    for (Employee em : emps) {
	        System.out.println(em);
	    }
	}

}