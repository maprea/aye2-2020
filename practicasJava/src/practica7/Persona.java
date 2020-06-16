package practica7;

import practica7.DocumentoPersonal.TipoDocumento;
import practica7.Genero.GenerosHabilitados;

public abstract class Persona {

	private String nombre;
	private Genero genero;
	Genero2 genero2;		// visibilidad por defecto: paquete
	protected int edad;
	private DocumentoPersonal documento;
	
	public Persona(String nombre) {
		this.nombre = nombre;
		genero = new Genero(GenerosHabilitados.Indefinido);
		genero2 = Genero2.Indefinido;
	}
	
	public void setDocumento(TipoDocumento tipo, int numero) {
		documento = new DocumentoPersonal(tipo, numero);
	}
	
	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getNumeroDocumento() {
		return documento.getNumero();
	}
	
	public TipoDocumento getTipoDocumento() {
		return documento.getTipo();
	}

	public String getNombre() {
		return nombre;
	}

	void setNombre(String n) {
		this.nombre = n;
	}
	
	@Override
	public String toString() {
		//return this.getClass() + "@" + this.hashCode();
		return "Nombre: " + nombre + ", documento: " + documento;
	}
	
	public void descripcion() {
		System.out.println("Persona: " + this);
	}
	
	// Metodo abstracto
	public abstract void controlarAsistencia();
}
