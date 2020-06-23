package practicaGenerics;

import java.util.ArrayList;
import java.util.List;

public class testMain {

	public static void main(String[] args) {
		ContenedorNumerico<Number> c1 = new ContenedorNumerico<>();
		
		// Tratamientos con primitivas/referencias
		int p1 = 8;
		c1.insertar(p1);						// Autoboxing: Integer.valueOf(p1)
		c1.insertar(Integer.valueOf(p1));		// Autoboxing: Integer.valueOf(p1)
		
		int p2 = Integer.valueOf(p1);			// Unboxing
		System.out.println(p2);					// println(int) => no hay autoboxing
		
		// Contenedor de numeros generico
		Number n1 = 10;
		Integer i1 = new Integer(11);
		Double d1 = new Double(5.3);

		c1.insertar(n1);
		c1.insertar(i1);						// Upcasting de Integer a Number
		c1.insertar(d1);						// Upcasting de Double a Number
		c1.mostrarContenido();					
		
		Number[] a1 = new Number[3];
		a1[0] = 1;
		a1[1] = 2;
		a1[2] = 3;
		ContenedorNumerico<Number> c2 = new ContenedorNumerico<>();
		ContenedorNumerico.arrayToContenedor(a1, c2);	// Se infiere <Number>arrayToContenedor de los args
		c2.mostrarContenido();
		
		ContenedorNumerico<Number> c3;
		c3 = ContenedorNumerico.arrayToContenedor(a1);
		c3.mostrarContenido();
		
		c1.insertarArray(a1);			// insertarArray(|c1|, a1);
		c1.mostrarContenido();
		
		ContenedorNumerico<Integer> ci1 = new ContenedorNumerico<>();
		// c3 = ci1;					-> Contenedor<Number> NO ES PADRE de Contenedor<Integer>
		c3.insertar(n1);
		
		// Wildcards generics
		List<? extends Number> l1;					// En compilacion T se reemplaza con Number
		List<Integer> l2 = new ArrayList<>();		// En compilacion T se reemplaza con Integer
		List<Double> l3 = new ArrayList<>();		// En compilacion T se reemplaza con Double
		List<?> l4;									// En compilacion T se reemplaza con Object
		
		l2.add(i1);
		l3.add(d1);
				
		l1 = l2;						// OK. List<? extends Number> SI ES PADRE de List<Integer>
		l1 = l3;						// OK. List<? extends Number> SI ES PADRE de List<Double>
		// l1.add(i1);					-> Error. No se puede agregar elementos (solo consultarlos)
		for (Number n : l1) {
			System.out.println(n);
		}
		
		l4 = l1;						// OK. List<?> SI ES PADRE de List<Double>	
	}

}
