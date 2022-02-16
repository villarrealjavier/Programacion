package profeb.clases;

public class GestionFamiliaApp {

	public static void main(String[] args) {
		Persona hermano1 = new Persona("Javier","Villarreal","Hinojo");
		Persona hermano2 = new Persona("Vicente","Villarreal","Hinojo");
		
		System.out.println(hermano1.esHermano(hermano2));
		
		
		

	}

}
