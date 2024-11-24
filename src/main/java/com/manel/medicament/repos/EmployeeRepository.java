/*package com.manel.medicament.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.manel.medicament.entities.Employee;


@RepositoryRestResource(path = "restt")
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    List<Employee> findByFullNameEmploye(String nom);
    List<Employee> findByOrderByNomEmployeAsc();
    List<Employee> findByFullNameEmployeContains(String fullName);

    @Query("SELECT e FROM Employee e ORDER BY e.fullNameEmploye ASC")
    List<Employee> trierEmployesNom();
}*/
package com.manel.medicament.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import com.manel.medicament.entities.Employee;

@RepositoryRestResource(path = "employees")
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    List<Employee> findByFullNameEmploye(String fullName);
    List<Employee> findByOrderByFullNameEmployeAsc();
    List<Employee> findByFullNameEmployeContains(String fullName);

    @Query("SELECT e FROM Employee e ORDER BY e.fullNameEmploye ASC")
    List<Employee> trierEmployesNom();
}
