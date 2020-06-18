package reportes;

public abstract class Reporte {

	private String titulo;
	private String contenido;
	private String fontFamily;
	private int bgColor;
	
	
	
	public String getFontFamily() {
		return fontFamily;
	}
	public void setFontFamily(String fontFamily) {
		this.fontFamily = fontFamily;
	}
	public int getBgColor() {
		return bgColor;
	}
	public void setBgColor(int bgColor) {
		this.bgColor = bgColor;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getContenido() {
		return contenido;
	}
	public void setContenido(String contenido) {
		this.contenido = contenido;
	}
	
	
}
