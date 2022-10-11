package ui;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.UUID;

import dol.Profesor;

public class ProfesorForm {
	
	private Scanner scan;
	public ProfesorForm(Scanner scan) {
		this.scan=scan;
	}
	
	public Profesor catchProfesor() {
		Profesor p = new Profesor();
		ArrayList <UUID> List= new ArrayList();
		
		System.out.println("Ingrese profesion: ");
		p.setProfesion(scan.nextLine());
		System.out.println("Ingrese Años de experiencia: ");
		p.setAñosExperiencia(0);
		
		String Value = "";
		do {
			System.out.println("Ingrese ID de Asignatura: ");
			List.add(UUID.fromString(scan.nextLine()));
			System.out.println("Desea seguir ingresando si (s) o no (n)");
			
		}while(!Value.equalsIgnoreCase("n"));
		
		do {
			System.out.println("Ingrese ID de grupo: ");
			List.add(UUID.fromString(scan.nextLine()));
			System.out.println("Desea seguir ingresando si (s) o no (n)");
			
		}while(!Value.equalsIgnoreCase("n"));
		
		
		return p;
	}
	
	public void resultado(Profesor p) {
		System.out.println("Id del profesor: "+p.getPersonID());
		System.out.println("Profesion: "+p.getProfesion());
		System.out.println("Experiencia: "+p.getAñosExperiencia());
		
		for (UUID item : p.getAsignatura()) {
			System.out.println("ID Asignatura: "+p.getAsignatura());	
		}
		
		for (UUID items : p.getGrupo()) {
			System.out.println("ID Grupo: "+p.getGrupo());
			
		}
	}

}
