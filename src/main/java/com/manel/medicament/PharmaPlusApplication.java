package com.manel.medicament;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import com.manel.medicament.entities.Commande;
import com.manel.medicament.entities.Employee;
import com.manel.medicament.entities.medicament;

@SpringBootApplication
public class PharmaPlusApplication implements CommandLineRunner{
	@Autowired
	private RepositoryRestConfiguration repositoryRestConfiguration;
	public static void main(String[] args) {
		SpringApplication.run(PharmaPlusApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
	repositoryRestConfiguration.exposeIdsFor(medicament.class,Employee.class,Commande.class);
	}

}
