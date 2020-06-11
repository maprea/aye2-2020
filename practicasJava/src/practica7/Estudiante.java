package practica7;

public class Estudiante extends Persona {
	private int matricula;

	@Override
	public void setNombre(String n) {
		super.setNombre(n);
	}
	
	public void setGenero2(Genero2 x) {
		this.genero2 = x;					// Esto funciona porque Estudiante esta en el mismo paquete que Persona, sino no tendria acceso a genero2 porque tiene visibilidad paquete.
	}
	
	public void setEdadEstudiante(int e) {
		this.edad = e;
	}
	
	@Override
	public String toString() {
		return "Estudiante - " + super.toString();
	}
	
	public String getNombreEdad() {
		return getNombre() + getEdad();
	}
	
	
	
}
