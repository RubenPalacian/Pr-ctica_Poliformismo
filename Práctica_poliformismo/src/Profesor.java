
import java.util.Scanner;

public class Profesor extends Persona {
	
	
	private int salario;
	
		public Profesor(String nom, int sue, int anyo) {    
			super(nom, anyo);
			
			salario=sue;
			
		}		
		public String calculaDescuento()  {
			
			double total;
			double descuento=2; 
		    double valor_final;
		       Scanner sc = new Scanner(System.in);
		 
		       System.out.println("Valor del producto de secretaría que compra el profesor: ");       
		       total = sc.nextInt();   
		 
		       valor_final = (descuento *  total)/(100);
		       double valor_con_descuento = total-valor_final;		 
		       return "El precio final es = " + valor_con_descuento;
		    }
		
		public  double getDameSueldo() {
			return salario;
		}
		public String toString1() {
			
			return super.toString()+ ", el salario del profesor es: " + getDameSueldo() + " euros al año. ";
		}
						
	}

