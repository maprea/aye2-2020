package practica7;

import practica7.DocumentoPersonal.TipoDocumento;
import practica7.Genero.GenerosHabilitados;

public final class testPractica {
	
	public static void main(String[] args) {
		// Inicializacion de instancias
		Persona p1 = new Estudiante("Estudiante p1");
		Estudiante es1 = new Estudiante();
		Empleado em1 = new Docente();
		
		p1.setDocumento(TipoDocumento.DNI, 12345678);
		//p1.setNombre("Laura");
		p1.setEdad(25);
		p1.setGenero(new Genero(GenerosHabilitados.Femenino));
		
		es1.setNombre("Pedro");
		em1.setNombre("Pepe");
		
		System.out.println(p1.toString());
		System.out.println(es1.toString());
		System.out.println(em1.toString());
		
		// Modificadores de Visibilidad
		/*
		 * El atributo nombre de la clase Persona es privado, por lo cual no puede accederse por fuera de la clase.
		 * String n = p1.nombre;   <- Error de compilacion
		 */
		// El atributo edad si puede accederse porque es protegido, porque testPractica pertenece al mismo paquete que Persona
		int x = p1.edad;
		// El atributo genero2 si puede accederse porque tiene visibilidad de paquete, porque testPractica pertenece al mismo paquete que Persona
		Genero2 g2 = p1.genero2;
		
		// Dynamic binding
		Persona[] personas = new Persona[3];
		personas[0] = p1;
		personas[1] = es1;
		personas[2] = em1;
		
		for (Persona p : personas) {
			System.out.println("Call toString() de instancia " +
					p.getClass().getSimpleName() +
					" -> " + p);							// dynamic binding de metodo toString()
			p.controlarAsistencia();						// dynamic binding de metodo controlarAsistencia()
		}
		
		// Casting
		String texto;
		
		Persona p2 = new Administrativo();					// Upcasting (implicito)
		p2.setNombre("Juana");
		if (p2 instanceof Empleado) {
			texto = ((Empleado) p2).getNombreEdad();		// Downcasting explicito
		} else {
			texto = p2.toString();
		}
		System.out.println(texto);
		
		p2 = es1;											// Upcasting: p2 es una Persona que apunta a instancia de Estudiante

		if (p2 instanceof Estudiante) {
			p1 = (Estudiante) p2;							// Downcasting explicito (verificado)
		}
		
		
		// Sobre carga metodos
		for (Persona p : personas) {
			p.descripcion();								// Bindeo dinamico (RT)
			if (p instanceof Estudiante) {
				((Estudiante) p).descripcion(1);			// Bindeo estatico (CT)
				texto = ((Estudiante) p).descripcion("1");	// Bindeo estatico (CT)
			}
		}
		
		
	}
}
