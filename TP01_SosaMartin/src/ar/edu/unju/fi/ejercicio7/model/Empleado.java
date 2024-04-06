package ar.edu.unju.fi.ejercicio7.model;

public class Empleado {

	private String name;
	private Integer legajo;
	private Float salary;
	private final Float miniumSalary = 210000.00f;
	private final Float merit = 20000.00f;
	
	
	public Empleado(String name, Integer legajo, Float salary) {
		super();
		this.name = name;
		this.legajo = legajo;
		this.salary = returnSalary(salary);
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Integer getLegajo() {
		return legajo;
	}


	public void setLegajo(Integer legajo) {
		this.legajo = legajo;
	}


	public Float getSalary() {
		return salary;
	}


	public void setSalary(Float salary) {
		this.salary = salary;
	}

	
	Float returnSalary(Float salary) {
		if(salary<this.miniumSalary)
			return this.miniumSalary;
		return salary;
	}
	
	public void incrementSalary() {
		this.salary += this.merit;
	}
	
	public void showInfo() {
		System.out.println("Nombre del empelado: "+getName());
		System.out.println("Legajo: "+getLegajo());
		System.out.println("Salario: $"+getSalary());
	}
	
}
