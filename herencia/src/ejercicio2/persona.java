package ejercicio2;
/*2. Clase Persona y Clase Estudiante: Define una clase Persona con atributos nombre y edad, y
un constructor para inicializar esos atributos. Luego, crea una clase Estudiante que herede de
Persona e incluya un atributo adicional carrera y un constructor que haga uso del constructor
de la clase base para inicializar todos los atributos.
*/
public class persona {

	private String nombre;
	private int edad;
	public persona(String nombre, int edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
	}
	public String getNombre() {
		return nombre;
	}
	public int getEdad() {
		return edad;
	}
	
	
}
