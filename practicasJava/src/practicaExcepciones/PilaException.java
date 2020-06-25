package practicaExcepciones;

public class PilaException extends Exception {

	public PilaException() {
		super("Pila Exception!");
	}
	
	public PilaException(String msg, Throwable e) {
		super("Pila Exception: " + msg, e);
	}
}
