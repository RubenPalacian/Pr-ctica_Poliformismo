

public abstract class Persona {

	private String nombre;
	private int anyoNacimiento;
		
	public Persona(String nom, int anyo) {
	
	nombre=nom;
	anyoNacimiento=anyo;
	
	}

	public String getDameNombre() {
		
		return nombre;
	}
	
	public int getDameAnyo() {
		
		return anyoNacimiento;
	}
	public abstract String calculaDescuento();
	
	public String toString() {
		return " El nombre es: " + getDameNombre() + " , el a�o de nacimiento es: " + getDameAnyo();
		
	}
	
	
	
}


