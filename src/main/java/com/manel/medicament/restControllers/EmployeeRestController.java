/*package com.manel.medicament.restControllers;

import java.util.List; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.CrossOrigin; 
import org.springframework.web.bind.annotation.PathVariable; 
import org.springframework.web.bind.annotation.RequestBody; 
import org.springframework.web.bind.annotation.RequestMapping; 
import org.springframework.web.bind.annotation.RequestMethod; 
import org.springframework.web.bind.annotation.RestController;

import com.manel.medicament.entities.Employee;
import com.manel.medicament.services.EmployeeServices; 


@RestController 
@RequestMapping("/api/emp") 
@CrossOrigin(origins = "http://localhost:4200")
public class EmployeeRestController {
	@Autowired
	EmployeeServices employeeServices;
	
	@RequestMapping(method = RequestMethod.GET)
	public List<Employee> getAllEmployes(){
		return employeeServices.getAllEmployes();
	}
	@RequestMapping(value="/{id}",method = RequestMethod.GET) 
	public Employee getEmployeById(@PathVariable("id") Long id) {  
		return employeeServices.getEmploye(id); 
	}
	//@RequestMapping(value="/{id}",method = RequestMethod.POST)
	@RequestMapping(method = RequestMethod.POST)
	public Employee createEmploye(@RequestBody Employee employe) { 
		return employeeServices.saveEmploye(employe); 
	} 
	@RequestMapping(method = RequestMethod.PUT) 
	public Employee updateEmploye(@RequestBody Employee employe) { 
		return employeeServices.updateEmploye(employe); 
	} 
	
	@CrossOrigin(origins = "http://localhost:4200")
	@RequestMapping(value="/{id}",method = RequestMethod.DELETE) 
	public void deleteEmploye(@PathVariable("id") Long id) { 
		employeeServices.deleteEmployeById(id); 
	} 
}*/
package com.manel.medicament.restControllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.manel.medicament.entities.Employee;
import com.manel.medicament.services.EmployeeServices;

@RestController
@RequestMapping("/api/emp")
@CrossOrigin(origins = "http://localhost:4200")
public class EmployeeRestController {
    @Autowired
    EmployeeServices employeeServices;

    @RequestMapping(method = RequestMethod.GET)
    public List<Employee> getAllEmployes() {
        return employeeServices.getAllEmployes();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Employee getEmployeById(@PathVariable("id") Long id) {
        return employeeServices.getEmploye(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    public Employee createEmploye(@RequestBody Employee employe) {
        return employeeServices.saveEmploye(employe);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public Employee updateEmploye(@RequestBody Employee employe) {
        return employeeServices.updateEmploye(employe);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteEmploye(@PathVariable("id") Long id) {
        employeeServices.deleteEmployeById(id);
    }
}
