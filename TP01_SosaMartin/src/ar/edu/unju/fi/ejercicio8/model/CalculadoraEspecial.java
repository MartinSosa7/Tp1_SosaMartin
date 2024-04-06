package ar.edu.unju.fi.ejercicio8.model;

public class CalculadoraEspecial {

	private Integer n;

	public CalculadoraEspecial() {
		
	}
	
	public Integer getN() {
		return n;
	}

	public void setN(Integer n) {
		this.n = n;
	}
	
	public int calcularSumatoria() {
		int sum = 0;
		for(int k = 1;k<=this.n;k++) {
			sum+= Math.pow((k*(k+1))/2,2); 
		}
		return sum;
	}
	
	public int calcularProductoria() {
		int sum = 1;
		for(int k = 1; k<=this.n;k++) {
			sum*= k * (k+4);
		}
		return sum;
	}
}
