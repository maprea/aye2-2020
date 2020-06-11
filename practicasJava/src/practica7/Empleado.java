package practica7;

public class Empleado extends Persona {
	private int legajo;
	
	// Constructor implicito
	/*
	public Empleado() {
		super();
	}
	*/
	
	@Override
	public String toString() {
		return "Empleado - " + super.toString();
	}
	
	public String getNombreEdad() {
		return getNombre() + getEdad();
	}
}
