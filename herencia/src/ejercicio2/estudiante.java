package ejercicio2;

public class estudiante extends persona{
private String Carrera;

public estudiante(String nombre, int edad, String Carrera) {
	super(nombre, edad);
	this.Carrera = Carrera;
}

public String getCarrera() {
	return Carrera;
}

public void mostrardatos() {
	System.out.println("\n Nombre: "+getNombre()+"\n Edad: "+getEdad()+"\n Carrera: "+getCarrera());
}
}
