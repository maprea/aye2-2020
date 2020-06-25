package practicaExcepciones;

import java.util.ArrayList;

public class Pila<T> {

	private ArrayList<T> elementos;
	
	public Pila() {
		elementos = new ArrayList<>();
	}
	
	public boolean esVacia() {
		return this.elementos.isEmpty();
	}
	
	public T desapilar() throws PilaEmptyException, PilaOneException {		// Especifica que lanza PilaEmptyException
		/* Forma onda imperativa
		if (elementos.isEmpty()) {
			throw new PilaEmptyException();
		}
		*/	
		try {											// Capturar excepciones
			T e = elementos.get(0);
			this.elementos.remove(0);
			if (elementos.size() == 1) {
				throw new PilaOneException();
			}
			return e;
		} catch(IndexOutOfBoundsException excp) {		// Exception handler para excepciones de tipo IndexOutOfBoundsException
			System.out.println("Ojo, salto una excepcion IndexOutOfBoundsException");
			throw new PilaEmptyException();				// Chained exception
		}
	}
	
	public void apilar(T e) {
		this.elementos.add(0, e);
	}
}
