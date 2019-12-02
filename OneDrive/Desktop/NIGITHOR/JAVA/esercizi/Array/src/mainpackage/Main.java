package mainpackage;

public class Main {

	public static void main(String[] args) {
		
		
		Persona x = new Persona("Tiziano", "Cassetta");
		String str = x.toString();
		
		//Dichiarazione e inizializzazione array (La dimensione è n-1)
		int[] vett1= new int[]{1,4,5,7,3,6,4};
		
		//Ciclo per scorrere l'array e stamparlo 
		for(int i=0;i<vett1.length;i++ ) {
			System.out.println(vett1[i]);
		}
		
		
		//Creazione dell'oggetto "Oggetto" che come attributo ha un array di interi (qui vett1)
		Oggetto ogg= new Oggetto(vett1);
		
		//Set della variabile, uguale a qualunuqe altro set, l'unica differenza è che viene passato un array
		ogg.setArrayOggetto(vett1);
		
		//Dichiarazione di un array di tipo Persona
		Persona[] arrayPersona;
		
		//Allocazione/Istanziazione dell'array di tipo Persona
		arrayPersona= new Persona[5];
		
		for(int i=0; i<arrayPersona.length;i++) {
			
			arrayPersona[i]=new Persona("Antonio", "piripippi");
			
		}
		
		int i = 0;
		for(Persona p:arrayPersona) {
			// utilizza i come indice d'appoggio (ad esempio nel caso volessimo inserire oggetti)
			i++;
		}
		
		for(Persona p:arrayPersona) {
			System.out.println(p);
		}
		
		
	}

}
