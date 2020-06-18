package reportes;

public class ReporteVenta extends Reporte implements Imprimible, Customizable {


	// Metodos de Imprimible
	public void imprimir() {
		System.out.println("Imprimiendo reporte Venta");
	}
	
	@Override
	public void logImpresion() {
		System.out.println("Imprimiendo log impresion venta");
	}
	
	
	// Metodos de Customizable
	public void cambiarBg(int bg) {
		this.setBgColor(bg);
	}
	
	public void cambiarFont(String font) {
		this.setFontFamily(font);
	}
	
}
