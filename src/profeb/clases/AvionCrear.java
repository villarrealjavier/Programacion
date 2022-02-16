package profeb.clases;

import java.util.Scanner;

public class AvionCrear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		crearAvionesArray();
	}
public static void crearAvionesArray() {
	String nombre="Avion";
	Scanner sc = new Scanner(System.in);
	System.out.println("Introduce cuantos aviones desea crear");
	int opcionAviones=Integer.valueOf(sc.nextLine());
	Avion[] numAvionesArray= new Avion[opcionAviones];
	for (int i=0;i<opcionAviones;i++) {
		Avion AVION2= new Avion((nombre+String.valueOf(i+1)),120);
		numAvionesArray[i]=AVION2;
	}for (int i=0;i<opcionAviones;i++) {
		System.out.println(numAvionesArray[i]);
	}
	
}
}
