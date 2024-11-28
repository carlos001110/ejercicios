package es.curso;

public class Principal5 {

	public static void main(String[] args) {
//cambiado hace una copia de la variable anterior
	int numero1=2;
	cambiar(numero1);
	System.out.println(numero1);

	}
public static void  cambiar(int n1) {
	
	n1=10;
	System.out.println("cambiado"+n1);
	}
}


