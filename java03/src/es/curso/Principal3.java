package es.curso;

public class Principal3 {

	public static void main(String[] args) {

		int numero1 = 5;
		int numero2 = 7;
		int numero3 = 10;
		
		System.out.println(sumar(numero1,numero2,numero3));
		System.out.println(restar(numero1,numero2,numero3));
		
		int numero4 = 8;
		int numero5 = 12;
		int numero6 = 15;
		System.out.println(sumar(numero4,numero5,numero6));
		System.out.println(restar(numero4,numero5,numero6));
		System.out.println(sumaNterminos(4));

	}

	public static int sumar(int n1, int n2, int n3) {
		int suma = n1 + n2 + n3;
		return suma;
		
		
	}
	public static int restar(int n1, int n2, int n3) {
		int resta = n1 - n2 - n3;
		return resta;
		

}
	public static int sumaNterminos(int n) {
	int suma=0;
	for(int i=0;i<n;i++) {
		suma=suma+i;
	}
	return suma;
}
}