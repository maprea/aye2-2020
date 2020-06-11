package practica7;

public class Genero {
	
	enum GenerosHabilitados {Masculino, Femenino, Indefinido};
	
	private GenerosHabilitados seleccionado;
	
	// Constructor implicito que agrega el compilador 
	// (solo si no hay constructores definidos)
	/*
	public Genero() {
		super();
	}
	*/
	
	public Genero(GenerosHabilitados actual) {
		seleccionado = actual;
	}
	
	public GenerosHabilitados getActual() {
		return seleccionado;
	}
}
