package es.curso;

public class Principal7 {

	public static void main(String[] args) {
//array de 3 numeros
	int[] lista= new int[] {5,8,20,6};
	for( int i=0; i< lista.length ;i++) {
		System.out.println(lista[i]);
	}
		int menor=numeroMenor(lista);
		System.out.println("******");
		System.out.println(menor);
		
	}
		
		public static int numeroMenor(int[] miArray) {
			int menor= Integer.MAX_VALUE;
			for( int i=0; i<miArray.length;i++) {
			if(miArray[i]<menor){
				menor=miArray[i];
			}
		}
			return menor;
	}
		
}


