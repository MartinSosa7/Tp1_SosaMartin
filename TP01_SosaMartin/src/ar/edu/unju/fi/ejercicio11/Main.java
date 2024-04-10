package ar.edu.unju.fi.ejercicio11;


public class Main {

	public static void main(String[] args) {
		System.out.println(generateSecuence());

	}
	
	static String generateSecuence() {
		String secuence = " ";
		int i = 2;
		for (int j = 40; j > 0; j--) {
			int value = j * i;
			secuence+=value+" ";
			i++;
			
		}
		
		return secuence;
	}
	

}
