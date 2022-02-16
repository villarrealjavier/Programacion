package profeb.clases;
/**
 * Calcular area y perímetro y devolverlo
 * @author Javier Villarreal Hinojo
 *
 */
public class Rectangulo {
	private double longitud=1.0;
	private double ancho=1.0;
	
	
	
	//CONSTRUCTORES
	public Rectangulo(double longitud,double ancho) {
		setLongitud(longitud);
		setAncho(ancho);
	}
	public Rectangulo() {
		
	}
	
	//METODOS
	public double averiguarPerimetros() {
		double resultado=0;
			resultado=(longitud*2)+(ancho*2);
		
		
		
		return resultado;
	}
	public double averiguarArea() {
		double area=0;
			area=longitud*ancho;
		
		
		return area;
	}
	
	
	//GETTERS AND SETTERS
	//-------Longitud
	public double getLongitud() {
		return longitud;
	}
	public void setLongitud(double longitud) {
		if (longitud>0 && longitud<20) {
			this.longitud = longitud;
		}
		
	}
	//----------Ancho
	public double getAncho() {
		return ancho;
	}
	public void setAncho(double ancho) {
		if (ancho>0 && ancho<20) {
			this.ancho = ancho;
		}
		
		
	
		
}
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("El ancho del rectangulo es: ");
		sb.append(getAncho());
		sb.append("\n");
		sb.append("y su longitud es: ");
		sb.append(getLongitud());
		sb.append("\n");
		sb.append("Su perímetro es: ");
		sb.append(averiguarPerimetros());
		sb.append("\n");
		sb.append("y su area: ");
		sb.append(averiguarArea());
		return sb.toString();		
		}
}
