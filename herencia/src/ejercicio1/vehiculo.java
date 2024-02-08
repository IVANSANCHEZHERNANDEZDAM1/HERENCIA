package ejercicio1;
/**1. Clase Vehículo y Clase Automóvil: Crea una clase base Vehículo que tenga atributos como
marca, modelo y año. Luego, crea una clase Automóvil que herede de Vehículo y añade un
atributo específico de Automóvil, como tipoDeCombustible. Implementa métodos en ambas
clases para establecer y obtener los valores de los atributos.
*/
public class vehiculo {

private String marca;
private String modelo;
private int año;


public vehiculo(String marca, String modelo, int año) {
	super();
	this.marca = marca;
	this.modelo = modelo;
	this.año = año;
}
public String getMarca() {
	return marca;
}
public String getModelo() {
	return modelo;
}
public int getAño() {
	return año;
}


}
