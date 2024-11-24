package com.manel.medicament.entities;
import org.springframework.data.rest.core.config.Projection;


@Projection(name = "nomMedicament", types = { medicament.class })
public interface MedicamentProjection {
	public String getNom();

}
