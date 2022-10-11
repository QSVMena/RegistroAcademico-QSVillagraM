package bll;

import java.util.Scanner;

public class Aplication {

	private Scanner scan;
	
	public Aplication(Scanner scan) {
		this.scan= scan;
	}
	
	public void MenuPrincipal() {
		System.out.println("1: Registro Academico");
		System.out.println("2: Menu asignaturas");
		System.out.println("3: Menu grupo");
		System.out.println("4: Menu Profesores");
		System.out.println("5: Menu Estudiantes");
		System.out.println("6: salir");
		int Option=0;
		Option = scan.nextInt();
	}
}
