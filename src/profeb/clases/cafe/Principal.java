package profeb.clases.cafe;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		boolean bucle =true;
		MaquinaCafe primercafe = new MaquinaCafe();
		try {
			
			System.out.println("Introduce el dinero con el que desea pagar: ");
			primercafe.setSaldo(Double.valueOf(sc.nextLine()));
			while(bucle==true) {
			System.out.println("Seleccione una de las siguientes opciones: ");
			System.out.println("1.Servir café solo (1 euro)");
			System.out.println("2. Servir leche (0,8 euros)");
			System.out.println("3. Servir café con leche (1,5 euros)");
			System.out.println("4. Consultar estado máquina. Aparecen los datos de los depósitos y del\n"
					+ "monedero");
			
			System.out.println("5. Apagar máquina, y salir");
			
			int opcion =(Integer.valueOf(sc.nextLine()));
			if (opcion==1) {
				System.out.println(primercafe.servirCafe());
				System.out.println(primercafe.getSaldo());
				if (primercafe.getDepositoCafe()<=0) {
					primercafe.llenarDepositos();
					System.out.println("Los depositos han sido llenados");
				}
			}else if (opcion==2) {
				System.out.println(primercafe.servirLeche());
				System.out.println(primercafe.getSaldo());
				if (primercafe.getDepositoLeche()<=0) {
					primercafe.llenarDepositos();
					System.out.println("Los depositos han sido llenados");
				}
			}else if (opcion==3) {
				System.out.println(primercafe.servirCafeLeche());
				System.out.println(primercafe.getSaldo());
				if (primercafe.getDepositoVasos()<=0) {
					primercafe.llenarDepositos();
					System.out.println("Los depositos han sido llenados");
				}
			}else if (opcion==4) {
				System.out.println(primercafe.toString());
			}else if (opcion==5) {
				System.out.println(primercafe.vaciarMonedero());
				bucle=false;
				
				
			}
		}
			
		}catch(Exception errorMaquinaCafe){
			System.out.println("Se ha producido una excepcion:"+ errorMaquinaCafe.getMessage());
			
		}
		
		
		
		
		
		
	}

}
