package profeb.clases;

import java.util.Scanner;

public class MenuRectangulo {
	
		
	public static void main(String[] args) {
		Rectangulo nuevorectangulo = menuRectangulo();
				
		System.out.println("El area del rectángulo es: "+nuevorectangulo.averiguarArea());
		System.out.println("El perímtero del rectángulo: "+nuevorectangulo.averiguarPerimetros());
		System.out.println(nuevorectangulo);
				
				
				
		
		
	}
	public static Rectangulo menuRectangulo() {
		Scanner sc = new Scanner(System.in);
		Rectangulo rectangulocreado=null;
		System.out.println("Introduce el ancho del rectangulo: ");
		double ancho=Double.valueOf(sc.nextLine());
		System.out.println("Introduce la longitud del rectángulo: ");
		double longitud=Double.valueOf(sc.nextLine());
		
		rectangulocreado = new Rectangulo(longitud, ancho);
		return rectangulocreado;
	}
}
