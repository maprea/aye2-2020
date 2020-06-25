package practicaExcepciones;

import java.util.ArrayList;
import java.util.List;

public class testMain {

	private static ArrayList<Integer> listaInt;
	private static ArrayList<String> listaStr;
	private static Pila<Integer> pilaInt;
	private static Pila<Integer> pilaNoIniciazalida;
	
	
	public static <T> void mostrarSiListaVacia(ArrayList<T> xs) {		// mostrarSiListaVacia(Lista(a) xs)
		// donde se necesita usar this?? => estatico
		if (esListaVacia(xs)) {
			System.out.println("La lista esta vacia");
		} else {
			System.out.println("La lista no esta vacia");
		}
	}
	
	public static <T> boolean esListaVacia(List<T> xs) {
		boolean ret = xs.isEmpty();		// se lanza NullPointerException
		return ret;
	}
	
	public static <T> void desapilarPila(Pila<T> p) {
		try {
			while (true) {
				//pilaNoIniciazalida.apilar(10);
				T elemento = p.desapilar();
				System.out.println(elemento);
			}
		} catch (PilaEmptyException e) {
			System.out.println(e);
			System.out.println(e.getMessage());
			StackTraceElement elementosStack[] = e.getStackTrace();
			for (StackTraceElement ste : elementosStack) {
				System.err.println(ste.getMethodName() + " - " + ste.getFileName() + ": " + ste.getLineNumber());
			}
		} catch (PilaOneException e) {
			System.out.println("Cuidado, queda solo 1 elemento en la pila.");
		} catch (PilaException e) {
			System.out.println("Ocurrio otra excepcion de Pila");
		} catch (Exception e) {
			System.out.println("Ocurrio otra excepcion" + e);
		} finally {
			System.out.println("Termino desapilarPila, bloque finally");
		}
	}
	
	public static void main(String[] args) {
		
		// 						Throwable (chk)
		//		Error (unchk)					Exception (chk)
		//		...			   		RedSatException (chk)		RuntimeException (unchk)
		
		listaInt = new ArrayList<Integer>();
		// listaInt.get(0);						-> Lanza IndexOutOfBoundsException (unchecked) en RT
		listaStr = new ArrayList<String>();
		
		mostrarSiListaVacia(listaInt);
		mostrarSiListaVacia(listaStr);

		pilaInt = new Pila<>();
		pilaInt.apilar(1);
		pilaInt.apilar(2);
		pilaInt.apilar(3);
		desapilarPila(pilaInt);
		

	}

}
