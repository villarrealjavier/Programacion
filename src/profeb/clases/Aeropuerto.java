package profeb.clases;

import java.util.Scanner;

public class Aeropuerto {
	public static String MENU_SECUNDARIO ="Selecciona una opcion: "
			+ "a. Asignar vuelo:\n"
			+ "b. Obtener el numero de vuelos:\n "
			+ "c. Obtener el total de kilmetros volados\n"
			+ "d. Obtener la media de los KM.\n "
			+ "e. Cambiar de compañia\n"
			+ "f. Obtener información del Avion\n"
			+ "g. Salir";

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Avion av1 =new Avion("ryannair", 90);
		//Avion av2 =new Avion("ryannair2020","Vueling", 90);
		
		Avion[] aeropuertoarray =new Avion[50];
		
		//aeropuertoarray[1]=av1;
		//aeropuertoarray[2]=av2;
		//aeropuertoarray[3]= new Avion("flying", 120);
		
		//aeropuertoarray[1].getCapacidad();
		
		String nombre="Avion";
		int[] arrayNumeros= new int[15];
		arrayNumeros[3]=15;
		
		for (int i=0;i<50;i++) {
			Avion avion1=new Avion((nombre+String.valueOf(i)),120);
			aeropuertoarray[i]=avion1;
		}
		for (int i=0; i<50;i++) {
			System.out.println(aeropuertoarray[i]);
		}
		
		
		
		
		//System.out.println(av1);
		Avion jumbo = crearAvionConMenu();
			//jumbo.setCompannia("vueling");
			//jumbo.getCompannia();
			Scanner sc = new Scanner(System.in);
			
			/*jumbo.asignarVuelo(200, 6000);
			jumbo.asignarVuelo(100, 7000);
			jumbo.asignarVuelo(150, 8000);*/
			
			
		
		System.out.println(MENU_SECUNDARIO);
		String opcion = sc.nextLine();
		
		while(!opcion.equalsIgnoreCase("g")){
			
			
		
		if (opcion.equalsIgnoreCase("b")) {
			System.out.println(jumbo.getNumVuelos());
			
		}else if (opcion.equalsIgnoreCase("a")) {
			System.out.println("Introduce el numero de pasajeros:  ");
			int numpasajeros=(Integer.valueOf(sc.nextLine()));
			System.out.println("Introduce los kilometros::  ");
			double km =Integer.valueOf(sc.nextLine());
			
			System.out.println(jumbo.asignarVuelo(numpasajeros, km));
			
			if (jumbo.asignarVuelo(numpasajeros, km)) {
				System.out.println("El vuelo se ha asignado");
			}else {
				System.out.println("No se puede asignar el vuelo");
			}
			
			
			
		}else if (opcion.equalsIgnoreCase("c")) {
			System.out.println(jumbo.getNumVuelos());
		} else if (opcion.equalsIgnoreCase("d")) {
			System.out.println(jumbo.getMediaKm());
		}else if (opcion.equalsIgnoreCase("f")) {
			System.out.println(jumbo.getInformacionAvion());
		}else if (opcion.equalsIgnoreCase("e")) {
			System.out.println("Introduce la nueva compañia.");
			String newcompa = String.valueOf(sc.nextLine());
			jumbo.setCompannia(newcompa);
			
			System.out.println("Su compañia ha cambiado.");
		}
		System.out.println(MENU_SECUNDARIO);
		opcion = sc.nextLine();
		}
		
		
		System.out.println("-----------------------------");
		
	
		
		
	}
	
	public static Avion crearAvionConMenu() {
		System.out.println("MENU CREACIÓN DE AVIÓN: \n"
				+ "1. Crear avión sólo con el identificador.\n"
				+ "2. Crear avión con el identificador y la compañía.\n"
				+ "##########################################");
		Scanner sc = new Scanner(System.in);
		int op = Integer.valueOf(sc.nextLine());
		int capacidad=0;
		String compannia;
		Avion avionCreado=null;
		
		if (op==1) {
			System.out.println("Introduzca el identificador del avión: ");
			String identificador= sc.nextLine();
			System.out.println("Introduzca la capacidad del avión: ");
			capacidad = Integer.valueOf(sc.nextLine());
			
			avionCreado = new Avion(identificador, capacidad);
		} else if (op==2){
			System.out.println("Dime el identificador: ");
			String identificador=(sc.nextLine());
			System.out.println("Dime la capacidad: ");
			capacidad=Integer.valueOf(sc.nextLine());
			System.out.println("Dime la compañía: ");
			compannia=String.valueOf(sc.nextLine());
			
			avionCreado= new Avion(identificador, compannia, capacidad);
		}else {
			System.out.println("La opcion seleccionada no es correcta");
		}
		return avionCreado;
	}

}
