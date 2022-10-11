package ui;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.UUID;

import dol.Grupo;

public class GrupoForm {
	
	public Scanner scan;

	public GrupoForm(Scanner scan) {
		this.scan= scan;
	}
	
	public Grupo Catchgrupo() {
		Grupo g = new Grupo();
		
		System.out.println("Nombre del grupo: ");
		g.setNombreGrupo(scan.nextLine());
		ArrayList <UUID> List= new ArrayList();
		
		String Value= " ";
		do {
			System.out.println("Ingresar ID del estudiante");
			List.add(UUID.fromString(scan.nextLine()));
			System.out.println("Desea seguir ingresando si (s) o no (n)");
		
		}while(!Value.equalsIgnoreCase("n"));
		
		return g;
	}
	
	public void resultado(Grupo g) {
		System.out.println("Id del grupo:"+g.getGroupID());
		System.out.println("Nombre del grupo: "+g.getNombreGrupo());
		for (UUID  item: g.getListIDEstudiante()) {
			System.out.println("ID Estudiante:"+g.getListIDEstudiante());
		}
		
	}
}
