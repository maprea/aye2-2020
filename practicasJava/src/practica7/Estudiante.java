package practica7;

public class Estudiante extends Persona {
	private int matricula;

	public Estudiante() {
		super("Nombre Estudiante");
	}
	
	// Sobrecarga de constructor
	public Estudiante(String nombre) {
		super(nombre);
	}
	
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
	
	public void controlarAsistencia() {
		System.out.println("Control de Asistencia de Estudiante");
	} 

	@Override
	public void descripcion() {
		System.out.println("Estudiante: " + this);
	}

	// Sobrecarga de metodo 'descripcion'
	public void descripcion(int formato) {
		if (formato == 1) {
			System.out.println("Estudiante: \t" + this);
		} else {
			System.out.println("Estudiante: " + this);
		}
	}
	
	public String descripcion(String formato) {
		if (formato == "1") {
			System.out.println("Estudiante: \t" + this);
		} else {
			System.out.println("Estudiante: " + this);
		}
		return "pepe";
	}

}
