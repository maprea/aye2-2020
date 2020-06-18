package reportes;

import java.util.ArrayList;

public class SistemaReportes {

	private ArrayList<Imprimible> colaImpresion;
	
	public SistemaReportes() {
		colaImpresion = new ArrayList<>();
	}
	
	public void agregarReporteImprimir(Imprimible r) {
		colaImpresion.add(r);
	}
	
	public void imprimirReportes() {
		for (Imprimible ri : this.colaImpresion) {
			ri.imprimir();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SistemaReportes sistema = new SistemaReportes();
		
		ReporteVenta rv1 = new ReporteVenta();
		ReporteVenta rv2 = new ReporteVenta();
		ReporteCompra rc1 = new ReporteCompra();
		
		sistema.agregarReporteImprimir(rv1);
		sistema.agregarReporteImprimir(rv2);
		sistema.agregarReporteImprimir(rc1);
		
		sistema.imprimirReportes();
	}

}
