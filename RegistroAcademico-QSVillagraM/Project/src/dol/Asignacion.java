package dol;

import java.util.UUID;

public class Asignacion {

	private UUID AsignacionID;
	private String NombreAsignatura;
	
	public Asignacion() {
		this.setAsignacionID(UUID.randomUUID());
	}
	
	public String getNombreAsignatura() {
		return NombreAsignatura;
	}

	public void setNombreAsignatura(String nombreAsignatura) {
		NombreAsignatura = nombreAsignatura;
	}

	public UUID getAsignacionID() {
		return AsignacionID;
	}

	public void setAsignacionID(UUID asignacionID) {
		AsignacionID = asignacionID;
	}
	
	
}
