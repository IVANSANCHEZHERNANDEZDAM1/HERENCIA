package ejercicio5;
/*Clase DispositivoElectrónico, Clase Telefono y Clase Smartphone: Aunque Java no soporta
herencia múltiple directamente, este ejercicio busca simular una jerarquía que lo requiera. Crea
una clase DispositivoElectrónico con atributos como fabricante y añoDeFabricación. Luego,
define una interfaz Telefono con métodos llamar y recibirLlamadas. Finalmente, crea una clase
Smartphone que herede de DispositivoElectrónico e implemente la interfaz Telefono, añadiendo
características propias de un smartphone como instalarAplicacion.*/
public class DispositivoElectronico {
private String fabricante;
private int añodefabricacion;

 public DispositivoElectronico(String fabricante, int añodefabricacion) {
	super();
	this.fabricante = fabricante;
	this.añodefabricacion = añodefabricacion;
}

public String getFabricante() {
	return fabricante;
}

public int getAñodefabricacion() {
	return añodefabricacion;
}

public void Telefono() {
	 System.out.println("A quien quieres llamar: ");
	 
	 System.out.println("TE ESTA LAMANDO: ");
 }
}
