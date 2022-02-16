package profeb.clases;

public class Cuenta {

		private double saldo;
		private static int numreintegros=0;
		private static int numingresos=0;
		private double retirada;
		private int ingreso;
	
		
		



		//CONSTRUCTORES
		public Cuenta (double saldo) {
			setSaldo(saldo);
		}
	
		
		
		//METODOS
		public String retirarDinero() {
			double resultado=0;
			if (retirada>0 && retirada<getSaldo()) {
			resultado=saldo-retirada;
			setSaldo(resultado);
			numreintegros++;
			;
			}else {
				System.out.println("La operación no se pudo realizar");
			}return "El saldo restante en la cuenta es de "+ resultado;
			
		}
		public String ingresarDinero() {
			double resultado=0;
			if (ingreso>0) {
			resultado=saldo+ingreso;
			setSaldo(resultado);
			numingresos++;
			}else {
				System.out.println("La operacion no se pudo realizar");
			}
			return "El saldo restante en la cuenta es de "+ resultado;
		}
		
		//GETTER AND SETTERS
		public double getSaldo() {
			return saldo;
		}

		public void setSaldo(double saldo) {
			if (saldo>=0) {
				this.saldo=saldo;
			}else {
				System.out.println("Introduce bien el sueldo");
			}
			
		}

		public static int getNumreintegros() {
			return numreintegros;
		}

		public static void setNumreintegros(int numreintegros) {
			Cuenta.numreintegros = numreintegros;
		}

		public double getRetirada() {
			return retirada;
		}

		public void setRetirada(double retirada) {
			this.retirada = retirada;
		}



		public int getIngreso() {
			return ingreso;
		}



		public void setIngreso(int ingreso) {
			this.ingreso = ingreso;
		}



		public static int getNumingresos() {
			return numingresos;
		}



		public static void setNumingresos(int numingresos) {
			Cuenta.numingresos = numingresos;
		}
		
		public String toString() {
			return "La cuenta tiene un saldo de " + getSaldo()
			+ "€ con un numero de ingresos de " + getNumingresos()
			+ " y con un numero de reintegros de "+ getNumreintegros();
		}
	
		
	}




