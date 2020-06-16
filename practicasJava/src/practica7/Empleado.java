package practica7;

public abstract class Empleado extends Persona {
	private int legajo;
	
	// Constructor implicito
	/*
	public Empleado() {
		super();			// Persona()
	}
	*/
	
	public Empleado() {
		super("Nombre Empleado");
	}
	
	public int getLegajo() {
		return legajo;
	}
	
	public void setLegajo(int legajo) {
		this.legajo = legajo;
	}
	
	@Override
	public String toString() {
		return "Empleado - " + super.toString();
	}
	
	public String getNombreEdad() {
		return getNombre() + getEdad();
	}
}
