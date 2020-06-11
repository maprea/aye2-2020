package com.empresa.dev.productname;

import com.empresa.dev.productname.modulo1.*;
import com.empresa.dev.productname.modulo1.submod1.*;			// Si no especifico que importo Clase2, el compilador no me deja usarla porque es ambigua (esta definida en modulo1 y submodulo1)
import com.empresa.dev.productname.modulo1.submod1.Clase2;		// Por lo comentado arriba, se hace el import explicito de submodulo1.Clase2

public class Producto {

	private Clase1 c1;
	private Clase2 c2;
	private Clase3 c3;

}
