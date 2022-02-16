package profeb.clases;

public class Avion {
	
	private final String idAvion;
	private final Integer capacidad;
	private Integer numVuelos = 0;
	private Double kmVolados = 0.0;
	private String compannia;
	
	//CONSTRUCTORES
	public Avion(String idAvion, int capacidad){
		this.idAvion=idAvion;
		this.capacidad=capacidad;
	}
	public Avion (String idAvion, String compannia, int capacidad) {
		this.idAvion=idAvion;
		this.compannia=compannia;
		this.capacidad=capacidad;
	}
	
	//METODOS
	public boolean asignarVuelo(int capacidad,double kilometros) {
		boolean asignar=false;
		if (capacidad<=this.capacidad) {
			this.kmVolados+=kilometros;
			this.numVuelos++;
			asignar=true;
		}
		return asignar;
	}
	public int getNumVuelos() {
		return numVuelos;
	}
	
	public double getTotalKm () {
		
		return kmVolados;
	}
	public String getInformacionAvion() {
		return "“Avión con id: " + getIdAvion()+ " la compañía " + getCompannia()+ " realizado\n"
				+ getNumVuelos() + " vuelos, con un total de " + getKmVolados() + " y una media de "+ getMediaKm()+ " de\n"
				+ " km por vuelo.”";
	}
	
	
	public double getMediaKm () {
		double resultado=0.0;
		if (numVuelos>=0) {
			resultado= kmVolados/numVuelos;
		}
		return resultado;
	}
	
	//GETTER AND SETTER DE TODOS:
	public String getIdAvion() {
		return idAvion;
	}
	
	public Integer getCapacidad() {
		return capacidad;
	}
	
	public double getKmVolados() {
		return kmVolados;
	}
	
	public String getCompannia() {
		return compannia;
	}
	public void setCompannia(String compannia) {
		this.compannia = compannia;
	}
	public String toString() {
		return "Avion con id: "+ getIdAvion(); 
	}
}
