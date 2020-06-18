package reportes;

public interface Imprimible {
	// Todos los componentes de una interfaz son implicitamente publicos
	
	void imprimir();
	
	default void logImpresion() {
		System.out.println("Imprimiendo Log...");
	}
	
}
