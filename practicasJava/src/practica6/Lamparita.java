package practica6;

public class Lamparita {
	
	// Atributo de instancia (cada objeto lamparita tendra su estado)
	private boolean estado;
	
	// Atributo de clase
	private static int lamparitasTotales = 0;
	
	// Metodo de clase
	public static int totalesCreadas() {
		return lamparitasTotales;
	}
	
	// Constructor de lamparita
	public Lamparita() {
		super();	// constructor del padre (java.lang.Object) - no es necesaria
		estado = false;
		Lamparita.lamparitasTotales += 1;
	}
		
	// getter de 'estado'
	public boolean getEstado() {
		return estado;
	}
	
	public boolean estaEncendida() {
		return estado;
	}
	
	// setter de 'estado'
	public void setEstado(boolean estado) {
		this.estado = estado;			// El parametro 'estado' oculta al atributo de instancia 'estado'
	}

	public void encender() {
		estado = true;
	}
	
	public void apagar() {
		estado = false;
	}
	
	public void cambiarEstado() {
		//estado = ! estado;
		if (this.estaEncendida()) {
			estado = false;
		} else {
			estado = true;
		}
		
	}
	
	public static void main(String[] args) {
		
		System.out.println("Ejemplo lamparita...");
		
		// Mostrar lamparitas totales
		System.out.println("En el sistema hay creadas " + Lamparita.totalesCreadas() + " lamparitas.");
				
				
		// Declaracion de variable de tipo Lamparita
		Lamparita lamp1;
		Lamparita lamp2 = new Lamparita();	// invocacion al constructor de Lamparita
		
		// Instanciacion de 1 objeto de tipo Lamparita, apuntado por lamp1
		lamp1 = new Lamparita();
		
		// Encender la instancia lamp1
		lamp1.encender();	// lamp1.encender(lamp1);

		// Mostrar estado
		System.out.println("Es estado de la lampara lamp1 es: " + lamp1.getEstado()); 
		System.out.println("Es estado de la lampara lamp2 es: " + lamp2.getEstado()); 
		
		// Mostrar lamparitas totales
		System.out.println("En el sistema hay creadas " + Lamparita.totalesCreadas() + " lamparitas.");
	}

}