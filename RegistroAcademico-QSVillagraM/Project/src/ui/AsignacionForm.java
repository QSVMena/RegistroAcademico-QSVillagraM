package ui;
import java.util.Scanner;

import dol.Asignacion;

public class AsignacionForm {

	private Scanner scan;
	
	public AsignacionForm(Scanner scan) {
		this.scan = scan;
	}
	
	public Asignacion CatchAsignacion () {
		Asignacion a = new Asignacion();
		System.out.println("Ingresar nombre de asignatura: ");
		a.setNombreAsignatura(scan.nextLine());
	
		return a;
	}
	
	public void resultado(Asignacion a) {
		System.out.print("El ID de Asignatura:  "+ a.getAsignacionID());
		System.out.print("Nombre de asignatura: "+ a.getNombreAsignatura());
	}
	
}
