package es.curso;

public class Principal8 {

	public static void main(String[] args) {
//array de 3 numeros
	int[] lista= new int[] {5,8,3,6};
	int suma=0;
	for( int i=0; i< lista.length ;i++) {
		System.out.println(lista[i]);
		//suma=suma+lista[i];
		suma+=lista[i];
	}
	System.out.println(suma);
	
		}
}
		
					



