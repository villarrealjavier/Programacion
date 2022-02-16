package profeb.clases;

public class Persona {
	
	private Integer edad;
	private String apellido1;
	private String dni;
	private String nombre;
	private double altura;
	private double peso;
	private String apellido2;
	
	private Persona progenitor1;
	private Persona progenitor2;
	
	
	//CONSTRUCTORES
	
	public Persona () {
		
	}
	
	public Persona(String nombre, String apellido1, String apellido2) {
		this.nombre=nombre;
		this.apellido1=apellido1;
		this.apellido2=apellido2;
		
	}
	
	
	
	@Override
	public boolean equals(Object personaDesconocida) {
		boolean sonLaMismaPersona = false;
		Persona convertida = (Persona) personaDesconocida;
		
		sonLaMismaPersona = this.dni.equals(convertida.getDni()) 
				&&  this.nombre.equals(convertida.getNombre());
		return sonLaMismaPersona;
	}
	
	
	//METODOS
	public boolean esHermano(Persona personanueva) {
		boolean resultado=false;
		resultado = (this.apellido1.equals(personanueva.getApellido1()) && (this.apellido2.equals(personanueva.getApellido2())));
			
		
		
		return resultado;
	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	//GETTER AND SETTERS
	public Integer getEdad() {
		return edad;
	}
	public void setEdad(Integer edad) {
		this.edad = edad;
	}
	public String getApellido1() {
		return apellido1;
	}
	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public Persona getProgenitor1() {
		return progenitor1;
	}
	public void setProgenitor1(Persona progenitor1) {
		this.progenitor1 = progenitor1;
	}
	public Persona getProgenitor2() {
		return progenitor2;
	}
	public void setProgenitor2(Persona progenitor2) {
		this.progenitor2 = progenitor2;
	}

	public String getApellido2() {
		return apellido2;
	}

	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}
	
}
