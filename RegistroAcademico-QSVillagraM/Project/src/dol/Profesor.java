package dol;
import dol.Asignacion;
import dol.Grupo;

import java.util.ArrayList;
import java.util.Date;
import java.util.UUID;

public class Profesor extends Persona {
	
	private String Profesion;
	private int AñosExperiencia;
	private ArrayList <UUID> asignatura;
	private ArrayList <UUID> grupo;
	

	public Profesor() {
		this.setPersonID(UUID.randomUUID());
	}

	public String getProfesion() {
		return Profesion;
	}


	public void setProfesion(String profesion) {
		Profesion = profesion;
	}


	public int getAñosExperiencia() {
		return AñosExperiencia;
	}


	public void setAñosExperiencia(int añosExperiencia) {
		AñosExperiencia = añosExperiencia;
	}

	public ArrayList<UUID> getAsignatura() {
		return asignatura;
	}

	public void setAsignatura(ArrayList<UUID> asignatura) {
		this.asignatura = asignatura;
	}

	public ArrayList<UUID> getGrupo() {
		return grupo;
	}

	public void setGrupo(ArrayList<UUID> grupo) {
		this.grupo = grupo;
	}


}
