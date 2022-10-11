package dol;

import java.util.ArrayList;
import java.util.UUID;

public class Grupo {

	private UUID groupID;
	private String NombreGrupo;
	private ArrayList <UUID> ListIDEstudiante;
	
	public Grupo() {
		this.setGroupID(UUID.randomUUID());
	}

	public UUID getGroupID() {
		return groupID;
	}

	public String getNombreGrupo() {
		return NombreGrupo;
	}

	public void setNombreGrupo(String nombreGrupo) {
		NombreGrupo = nombreGrupo;
	}

	public ArrayList<UUID> getListIDEstudiante() {
		return ListIDEstudiante;
	}

	public void setListIDEstudiante(ArrayList<UUID> listIDEstudiante) {
		ListIDEstudiante = listIDEstudiante;
	}

	public void setGroupID(UUID groupID) {
		this.groupID = groupID;
	}
}
