package com.manel.medicament.entities;

import org.springframework.data.rest.core.config.Projection;

	@Projection(name = "nomEmploye", types = {Employee.class})
	public interface EmployeeProjection {
		public String getFullNameEmploye();

	}

