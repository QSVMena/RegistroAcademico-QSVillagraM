package ui;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import dol.Estudiante;

public class EstudianteForm {

	public Scanner scan;
	public EstudianteForm(Scanner scan) {
		this.scan = scan;
	}
	
	public Estudiante CacthEstudiante() {
		Estudiante e = new Estudiante();
		SimpleDateFormat formato = new SimpleDateFormat ("dd/MM/yyyy");
		Date fecha = new Date();
		
		System.out.println("Ingrese primer nombre: ");
		e.setFirstName(scan.nextLine());
		System.out.println("Ingrese segundo nombre: ");
		e.setSecondName(scan.nextLine());
		System.out.println("Ingrese primer apellido: ");
		e.setFirstLastName(scan.nextLine());
		System.out.println("Ingrese segundo apellido: ");
		e.setSecondLastName(scan.nextLine());
		System.out.println("Ingrese genero: ");
		e.setGenero(scan.nextLine());
		System.out.println("Edad: ");
		e.setAge(0);
		try {
			System.out.println("Ingrese fecha de nacimiento: ");
			e.setBirthdate(formato.parse(scan.nextLine()));
		} catch (ParseException e1) {
		
		}
		
		try {
			System.out.println("Ingrese fecha de ingreso: ");
			e.setFechaIngreso(formato.parse(formato.format(fecha)));
		} catch (ParseException e1) {
			
		}
		
		return e;
	}
	
	public void resultado(Estudiante e) {
		System.out.println("ID:" +e.getPersonID());
		System.out.println("primer nombre:" +e.getFirstName());
		System.out.println("segundo nombre:" +e.getSecondName());
		System.out.println("1er apellido:" +e.getFirstLastName());
		System.out.println("2doApellido:" +e.getSecondLastName());
		System.out.println("genero:" +e.getGenero());
		System.out.println("ID:" +e.getPersonID());
		System.out.println("Fecha de Nacimiento:" +e.getBirthdate());
		System.out.println("Fecha de Ingreso:" +e.getFechaIngreso());
	}
}
