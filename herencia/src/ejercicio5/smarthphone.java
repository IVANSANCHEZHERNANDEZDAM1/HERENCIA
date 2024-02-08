package ejercicio5;

public class smarthphone extends DispositivoElectronico{

	private String marca;
	
	
	public smarthphone(String fabricante, int añodefabricacion, String marca) {
		super(fabricante, añodefabricacion);
		this.marca = marca;
	}
	
	public String getMarca() {
		return marca;
	}

	public void Telefono() {
		 System.out.println("LLAMANDO A IVAN ....");
		 
		 System.out.println("TE ESTA LAMANDO IVAN....");
		 
		 System.out.println("Instalar whatsapp");
	}
	public void muestraDatos() {
		System.out.println("\n Fabricante: "+ getFabricante() +"\n Año De Fabricacion:  "+getAñodefabricacion()+"\n Marca: "+getMarca());
	}
}
