/*package com.manel.medicament.services;

import java.util.List;

import com.manel.medicament.entities.Employee;

public interface EmployeeServices {
	Employee saveEmploye(Employee em); 
	Employee updateEmploye(Employee em); 
	void deleteEmploye(Employee em); 
	void deleteEmployeById(Long id); 
	List<Employee> findByFullNameEmploye(String FullName); 
	//List<Employe> findByNomEmployeContains(String FullName); 
	//List<Employe> findByNom(String FullName);  
	List<Employee> findByOrderByFullNameEmployeAsc(); 
	List<Employee> trierEmployesNom();
	List<Employee> getAllEmployes();
	Employee getEmploye(Long id);
}*/
package com.manel.medicament.services;

import java.util.List;
import com.manel.medicament.entities.Employee;

public interface EmployeeServices {
    Employee saveEmploye(Employee em);
    Employee updateEmploye(Employee em);
    void deleteEmploye(Employee em);
    void deleteEmployeById(Long id);
    List<Employee> findByFullNameEmploye(String fullName);
    List<Employee> findByOrderByFullNameEmployeAsc();
    List<Employee> trierEmployesNom();
    List<Employee> getAllEmployes();
    Employee getEmploye(Long id);
}
