/*package com.manel.medicament.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.manel.medicament.entities.Employee;
import com.manel.medicament.repos.EmployeeRepository;


@Service
public class EmployeeServicesImpl implements EmployeeServices{
	
	@Autowired
	EmployeeRepository employeRepository;
	
	@Override
	public Employee saveEmploye(Employee em) {
		return employeRepository.save(em);
	}
	@Override
	public Employee updateEmploye(Employee em) {
		return employeRepository.save(em);
	}
	@Override
	public void deleteEmploye(Employee em) {
		employeRepository.delete(em);
	}
	@Override
	public void deleteEmployeById (Long id) {
		employeRepository.deleteById(id);
	}
	@Override
	public Employee getEmploye (Long id) {
		return employeRepository.findById(id).get();
	}
	@Override
	public List<Employee> getAllEmployes(){
		return employeRepository.findAll();
	}
	@Override 
	public List<Employee> findByFullNameEmploye(String nom) { 
	   return employeRepository.findByFullNameEmploye(nom); 
	}  
	@Override 
	public List<Employe> findByNomEmployeContains(String FullName) { 
	   return employeRepository.findByNomEmployeContains(FullName); 
	}  
	@Override 
	public List<Employee> findByOrderByFullNameEmployeAsc() { 
	   return employeRepository.findByOrderByNomEmployeAsc(); 
	} 
	@Override 
	public List<Employee> trierEmployesNom() { 
	   return employeRepository.trierEmployesNom(); 
	} 
}*/
package com.manel.medicament.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.manel.medicament.entities.Employee;
import com.manel.medicament.repos.EmployeeRepository;

@Service
public class EmployeeServicesImpl implements EmployeeServices {
    @Autowired
    EmployeeRepository employeRepository;

    @Override
    public Employee saveEmploye(Employee em) {
        return employeRepository.save(em);
    }

    @Override
    public Employee updateEmploye(Employee em) {
        return employeRepository.save(em);
    }

    @Override
    public void deleteEmploye(Employee em) {
        employeRepository.delete(em);
    }

    @Override
    public void deleteEmployeById(Long id) {
        employeRepository.deleteById(id);
    }

    @Override
    public Employee getEmploye(Long id) {
        return employeRepository.findById(id).get();
    }

    @Override
    public List<Employee> getAllEmployes() {
        return employeRepository.findAll();
    }

    @Override
    public List<Employee> findByFullNameEmploye(String fullName) {
        return employeRepository.findByFullNameEmploye(fullName);
    }

    @Override
    public List<Employee> findByOrderByFullNameEmployeAsc() {
        return employeRepository.findByOrderByFullNameEmployeAsc();
    }

    @Override
    public List<Employee> trierEmployesNom() {
        return employeRepository.trierEmployesNom();
    }
}
