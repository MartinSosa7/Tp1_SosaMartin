package ar.edu.unju.fi.ejercicio12.main;

import java.util.Calendar;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio12.model.Persona;

public class Main {

	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		showInfo(createPersona());
		
	}

	
	static Persona createPersona() {
		Persona persona = new Persona();
		persona.setBirthday(Calendar.getInstance());
		System.out.println("Ingrese Nombre");
		persona.setName(scanner.next());
		System.out.println("ingrese dia de nacimiento");
		persona.getBirthday().set(Calendar.DAY_OF_MONTH, scanner.nextInt());
		System.out.println("ingrese el mes de nacimiento");
		persona.getBirthday().set(Calendar.MONTH, (scanner.nextInt()-1));	
		System.out.println("ingrese año de nacimiento");
		persona.getBirthday().set(Calendar.YEAR, scanner.nextInt());
		return persona;
	}
	
	static void showInfo(Persona persona) {
		System.out.println("Nombre: "+persona.getName()
				+ "\nFecha de nacimiento: "+persona.getBirthday().get(Calendar.DAY_OF_MONTH)+"/"+(persona.getBirthday().get(Calendar.MONTH)+1)+"/"+persona.getBirthday().get(Calendar.YEAR)
				+ "\nEdad: "+persona.calculateAge()
				+ "\nSigno del zodiaco: "+persona.getZodiacSign()
				+ "\nEstacion: "+persona.season());
	}
}
