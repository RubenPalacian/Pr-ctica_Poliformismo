import java.util.Scanner;

public class Alumno extends Persona {

	private String curso;
	
	public Alumno(String nom, String cur, int anyo) {
		
		super(nom, anyo);
		
		curso=cur;
		
	}
	
	public String calculaDescuento()  {
		
		int total;
		int descuento=10; 
	    double valor_final;
	       Scanner sc = new Scanner(System.in);
	 
	       System.out.println("Valor del producto de secretaría para el alumno: ");       
	       total = sc.nextInt();   
	 
	       valor_final = (descuento *  total)/(100);
	       double valor_con_descuento = total-valor_final;
	 
	      return "El precio final es = " + valor_con_descuento;
	    }
	

	public String getDameCurso() {
		
		return curso;
	}
	
	public String toString2() {
		
		return super.toString() + " . El/la alumno/a esta matriculado en el curso: " + getDameCurso()+".";
	}
}
