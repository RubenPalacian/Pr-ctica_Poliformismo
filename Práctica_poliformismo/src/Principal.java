
public class Principal {

	public static void main(String[] args) {
		
		Profesor profesor1= new Profesor("Javier Ortega", 32000, 1985);
		Profesor profesor2= new Profesor("Rocio Monastre", 32000, 1986);
		
		Alumno alumno1= new Alumno("Alicia Moreno", "2018-2019", 1999);
		Alumno alumno2= new Alumno("Rafael Blazquez", "2018-2019", 1999);
		
	System.out.println("PROFESORES: ");	
	System.out.println(profesor1.toString1());
	System.out.println(profesor2.toString1());
	System.out.println("-------------------------------------------");
	System.out.println("ALUMNOS: ");
	System.out.println(alumno1.toString2());
	System.out.println(alumno2.toString2());
		
	System.out.println(profesor1.calculaDescuento());
	System.out.println(alumno1.calculaDescuento());	
	}

}
