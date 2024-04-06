package ar.edu.unju.fi.ejercicio6.model;

import java.time.LocalDate;

public class Persona {

	private String dni;
	private String name;
	private LocalDate birthday;
	private String province;
	
	public Persona() {
		
	}
	
	
	public Persona(String dni, String name, LocalDate birthday, String province) {
		super();
		this.dni = dni;
		this.name = name;
		this.birthday = birthday;
		this.province = province;
	}
	
	
	public Persona(String dni, String name, LocalDate birthday) {
		super();
		this.dni = dni;
		this.name = name;
		this.birthday = birthday;
		this.province = "Jujuy";
	}


	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDate getBirthday() {
		return birthday;
	}
	public void setBirthday(LocalDate birthday) {
		this.birthday = birthday;
	}
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	
	
	public int calculateAge() {
		return LocalDate.now().getYear() - this.birthday.getYear();
	}
	
	public boolean isAdult() {
		boolean adult = false;
		if(calculateAge()>= 18)
			adult = true;
		return adult;
	}
	
	public void showInfo() {
		System.out.println("dni: "+this.dni+", nombre: "+this.name+", Fecha Nacimiento: "+this.birthday);
		System.out.println("provincia "+this.province+", edad: "+calculateAge()+", es mayor de edad: "+isAdult());
	}
	
}
