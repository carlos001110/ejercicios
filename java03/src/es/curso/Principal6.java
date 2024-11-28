package es.curso;

public class Principal6 {

	public static void main(String[] args) {
//array de 3 numeros
	int[] lista= new int[] {5,8,20,6};
	for( int i=0; i< lista.length ;i++) {
		System.out.println(lista[i]);
	}
		int mayor=numeroMayor(lista);
		System.out.println("******");
		System.out.println(mayor);
	}
		
		public static int numeroMayor(int[] miArray) {
			int mayor=0;
			for( int i=0; i<miArray.length;i++) {
			if(miArray[i]>mayor){
				mayor=miArray[i];
			}
		}
			return mayor;
	}
		
}


