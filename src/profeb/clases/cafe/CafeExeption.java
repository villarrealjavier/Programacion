package profeb.clases.cafe;

public class CafeExeption extends RuntimeException {
	public CafeExeption(String mensaje) {
		super(mensaje);
		getMessage();
	}
}
