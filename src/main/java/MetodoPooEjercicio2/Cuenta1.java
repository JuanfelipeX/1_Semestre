
package MetodoPooEjercicio2;

import java.util.Scanner;

public class Cuenta1 {

	public static void main(String[] args) {
		Scanner	datos = new Scanner(System.in);
		
		cuenta [] personas = new cuenta[2];
		
		for (int i = 0; i < personas.length; i++) {
			
		   System.out.println("Introduce el nombre");
		   String name = datos.next();
		   System.out.println("Introduce el sueldo");
		   double check = datos.nextDouble();
		
		   cuenta peoples = new cuenta(name , check);
		   personas[i] = peoples;
		   
		}
		
		System.out.println(" Desea Retirar dinero ");
		String R = datos.next();
		if (R.equalsIgnoreCase("si")) {
			System.out.println(" Digite cuanto va a retirar ");
			double Ret = datos.nextDouble();
			
			for (int i = 0; i < 2; i++) {
			personas[i].Retiro(Ret);
		}
		}
		
		for (int i = 0; i < 2; i++) {
			System.out.println(" Nombre del Titular    " + personas[i].DameTitular()+ 
				           "   Cantidad    " + personas[i].DameCantidad());
		}
		
	}
}
class cuenta {
	
	public cuenta(String titular , double cantidad){
	Tit = titular;
	Cant = cantidad;
		if (Cant<0) {
			System.out.println(" Esta mal ingresada la cantidad debe ser mayor a 0 ");
		}
	}
	
	public String DameTitular(){        
	return Tit;
	}
	
	public double DameCantidad(){        
	return Cant;
	}
	
	public void Retiro(double Money){
		double Retira = Cant-Money;
		Cant-=Retira;
		
	}
	
	private String Tit;
	private double Cant;
	private double Retiro;
	
}
