package ar.edu.unju.fi.ejercicio1;

public class Main {

	public static void main(String[] args) {
		System.out.println(promedy(integersSum()));
	}

	static int integersSum() {
		int number1 = 8, number2 = 5, number3 = 1, number4 = 20, number5 = 9;
		return number1+number2+number3+number4+number5;
	}
	
	static float promedy(int finalSum) {
		return (finalSum)/5;
	}
}
