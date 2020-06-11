package simulacion_imperativa;

public class Main {

	// Variables de clase
	private static enum Prueba {A, B, C};
	private static int var1;
	private static int var2;
	private final static int constante = 15;
	private static int[] xs;	// xs -> null
	private static Prueba enum1 = Prueba.A;

	// Metodo de clase
	static void mostrarArreglo(int[] xs) {
		for (int x : xs) {
			System.out.println("var en xs: " + x );
		}
	}
	
	public static void main(String[] args) {

		var1 = 5;
		var2 = 6;
		xs = new int[4];
		xs[0] = var1 + var2;
		enum1 = Prueba.B;
		
		System.out.println("var1: " + var1 );
		System.out.println("var2: " + var2 );
		System.out.println("enum1: " + enum1 );
		System.out.println("constante: " + constante );
		
		mostrarArreglo(xs);
	}
}
