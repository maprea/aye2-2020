package practica7;

public class DocumentoPersonal {
	enum TipoDocumento {LE, CE, DNI};
	
	private final int numero;
	private final TipoDocumento tipo;
	
	public DocumentoPersonal(TipoDocumento tipo, int nro) {
		this.numero = nro;
		this.tipo = tipo;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public TipoDocumento getTipo() {
		return tipo;
	}
	
	public String toString() {
		return "Tipo: " + tipo + ", numero: " + numero;
	}
}
