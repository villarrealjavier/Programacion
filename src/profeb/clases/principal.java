package profeb.clases;

public class principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		persona antonio= new persona("Antonio","Sevillano",50,1.72);
		persona maria = new persona();
		
		
		
		antonio.equals(maria);
		antonio.setAltura(1.8);
		antonio.setEdad(30);
		antonio.setNombre("Antonio");
		
		maria.setNombre("Maria");;
		maria.setEdad(28);
		maria.setAltura(1.90);
		maria.setApellidos("Ramirez");
		System.out.println(antonio);
		System.out.println(antonio.getEdad());
		
		
		
		
	}

}
