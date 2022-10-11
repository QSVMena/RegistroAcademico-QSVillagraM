package dol;

import java.util.Date;
import java.util.UUID;

public abstract class Persona {
	
	private UUID PersonID;
	private String FirstName;
	private String SecondName;
	private String FirstLastName;
	private String SecondLastName;
	private String Genero;
	private Date Birthdate;
	private int Age;
	
	public UUID getPersonID() {
		return PersonID;
	}
	public void setPersonID(UUID personID) {
		PersonID = personID;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getSecondName() {
		return SecondName;
	}
	public void setSecondName(String secondName) {
		SecondName = secondName;
	}
	
	public String getGenero() {
		return Genero;
	}
	public void setGenero(String genero) {
		Genero = genero;
	}
	public Date getBirthdate() {
		return Birthdate;
	}
	public void setBirthdate(Date birthdate) {
		Birthdate = birthdate;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	public String getFirstLastName() {
		return FirstLastName;
	}
	public void setFirstLastName(String firstLastName) {
		FirstLastName = firstLastName;
	}
	public String getSecondLastName() {
		return SecondLastName;
	}
	public void setSecondLastName(String secondLastName) {
		SecondLastName = secondLastName;
	}
	


}
