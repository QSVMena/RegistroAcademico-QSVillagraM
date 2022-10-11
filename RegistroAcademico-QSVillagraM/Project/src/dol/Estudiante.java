package dol;

import java.util.Date;
import java.util.UUID;

public class Estudiante extends Persona{
	
	public Date FechaIngreso;

	public Estudiante () {
		this.setPersonID(UUID.randomUUID());
	}

	public Date getFechaIngreso() {
		return FechaIngreso;
	}

	public void setFechaIngreso(Date fechaIngreso) {
		FechaIngreso = fechaIngreso;
	}
	
	
}
