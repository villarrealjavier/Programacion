package profeb.clases;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		
		
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Introduce el saldo inicial: ");
		double saldocreado=Double.valueOf(sc.nextLine());
		Cuenta cuenta1 = new Cuenta(saldocreado);
		boolean salir=true;
		String opcion2="";
		while (salir==true) {
		System.out.println("Seleccione la opción la cual desea realizar: ");
		System.out.println("1. Hacer un reintegro, se pedirá la cantidad a retirar. ");
		System.out.println("2. Hacer un ingreso, se pedirá la cantidad a ingresar.");
		System.out.println("3. Consultar el saldo y el número de reintegros e ingresos realizados.");
		System.out.println("4. Finalizar las operaciones. Debe confirmar si realmente desea salir \n"
				+ "informar del saldo al final de todas las operaciones. ");
		int opcion=Integer.valueOf(sc.nextLine());
		
		if (opcion==1) {
			System.out.println("Introduce la cantidad a retirar: ");
			cuenta1.setRetirada(Integer.valueOf(sc.nextLine()));;
			
			System.out.println(cuenta1.retirarDinero());

		}else if (opcion==2) {
			System.out.println("Introduce la cantidad a ingresar: ");
			cuenta1.setIngreso(Integer.valueOf(sc.nextLine()));
			System.out.println(cuenta1.ingresarDinero());
			
		}else if (opcion==3) {
			System.out.println("El saldo es de " + cuenta1.getSaldo()+"€");
			System.out.println("El numero de ingresos es de "+ cuenta1.getNumreintegros());
			System.out.println("El numero de reintegros es de "+ cuenta1.getNumingresos());
		}else {
			System.out.println("¿Realmente quieres salir, escribe Confirmar o Cancelar?");
			opcion2=String.valueOf(sc.nextLine());
			if (opcion2.equalsIgnoreCase("confirmar")) {
				System.out.println(cuenta1.toString());
				salir=false;
			}else
				System.out.println("Perfecto, siga con sus operaciones: ");
		}
			
		}
		
	}
	}


