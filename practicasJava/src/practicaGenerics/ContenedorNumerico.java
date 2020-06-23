package practicaGenerics;

import java.util.LinkedList;
import java.util.List;

public class ContenedorNumerico<T extends Number> {		// TAD Contenedor(a),	'a' es numérico
	
	private List<T> contenido;
	private List contenido2;		// Raw type List (no usar)

	public ContenedorNumerico() {
		contenido = new LinkedList<>();		// Inferencia de tipo (T)
	}
	
	
	public void mostrarContenido() {
		System.out.println("Mostrando contenido de Contenedor" + this);
		if (contenido.isEmpty()) {
			System.out.println("Contenedor vacio");
		} else {
			for (T e : contenido) {
				System.out.println(e);
			}
		}
	}
	
	public void insertar(T e) {
		contenido.add(e);
	}
	
	public void insertarArray(T[] arreglo) {		// insertarArray(|this|, arreglo)...
		ContenedorNumerico.arrayToContenedor(arreglo, this);
	}
	
	public static <S extends Number> void arrayToContenedor(S[] arreglo, ContenedorNumerico<S> contenedor) {
		for (S x : arreglo) {
			contenedor.insertar(x);
		}
	}
	
	public static <S extends Number> ContenedorNumerico<S> arrayToContenedor(S[] arreglo) {
		ContenedorNumerico<S> contenedor = new ContenedorNumerico<S>();
		ContenedorNumerico.arrayToContenedor(arreglo, contenedor);
		return contenedor;
	}
	
	// Suma la parte entera de sus elementos (solo es posible con T extends Number)
	public int sumarInts() {
		int suma = 0;
		for (T e : contenido) {
			suma = suma + e.intValue();
		}
		return suma;
	}
}
