package profeb.clases;

public class persona {


		// TODO Auto-generated method stub
		//atributos --> características
		private String nombre;
		private String apellidos;


		private int edad;
		private double altura;
		
		
		//métodos --> comportamiento
		

		//Constructor
		public persona() {
			apellidos="Ramirez";
			nombre="Juan";
			edad=18;
			altura=1.78;
		}
		
		public persona(String name,String surname, int age,double height) {
			this.nombre=name;
			this.apellidos=surname;
			this.edad=age;
			this.altura=height;
		}
		public String getNombre() {
			return nombre;
		}
		
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		
		public String getApellidos() {
			return apellidos;
		}
		
		public void setApellidos(String apellidos) {
			this.apellidos = apellidos;
		}
		public double getAltura() {
			return altura;
		}
		
		public void setAltura(double altura) {
			this.altura = altura;
		}
		
		public void setEdad(int edad) {
			if (edad > 0 && edad<100) {
				this.edad=edad;
			}
			
		}
		public int getEdad() {
			return edad;
		}
		

}
