
package MetodoPooEjercicios;

import java.util.Date;

import java.util.GregorianCalendar;

import java.util.Scanner;

public class PooEmpleado2 {  //solo debe haber una clase ""public class""

	public static void main(String[] args) {
		Scanner	datos = new Scanner(System.in);
		System.out.println(" Digite la cantidad de empleados");
		int n=datos.nextInt();
		
		Empleado [] empleados = new Empleado[n];
		
		for (int i = 0; i < empleados.length; i++) {
			
		   System.out.println("Introduce el nombre");
		   String nick = datos.next();
		   System.out.println("Introduce el sueldo");
		   double saldo = datos.nextDouble();
		   System.out.println("Introduce el año de alta");
		   int anyo = datos.nextInt();
		   System.out.println("Introduce el mes de alta");
		   int mes = datos.nextInt();
		   System.out.println("Introduce el día de alta");
		   int dia = datos.nextInt();
		   
		   Empleado nuevoEmpleado = new Empleado(nick, saldo, anyo, mes, dia);
		   empleados[i] = nuevoEmpleado;
		   
		}
		
		System.out.println(" Desea agregar subida de sueldo ");
		  String s = datos.next();
		   if(s.equalsIgnoreCase("Si")){
			   System.out.println(" Digite cuanto ");
			   int SubeS = datos.nextInt();
			   
		for (int i = 0; i < n; i++) {
			empleados[i].SubeSueldo(SubeS);
		}
		   }
		
		for (int i = 0; i < n; i++) {
			System.out.println(" Nombre del empleado    " + empleados[i].DameNombre() + 
				           "   Sueldo    " + empleados[i].DameSueldo() +
				           "   Fecha de Alta    " + empleados[i].DameFechaAlta());
		}
	}
}

class Empleado{
	
	public Empleado(String nom , double suel , int agno , int mes , int dia ){
		nombre=nom;
		sueldo=suel;
		GregorianCalendar calendario=new GregorianCalendar(agno, mes-1 , dia);
		altaContrato=calendario.getTime();
	}
	
	public String DameNombre(){            //getter
	return nombre;
	}
	
	public double DameSueldo(){            //getter
	return sueldo;
	}
	
	public Date DameFechaAlta(){           //getter
	return altaContrato;
	}
	
	public void SubeSueldo(double porcentaje){
		double aumento=sueldo*porcentaje/100;
		sueldo+=aumento;
	}
	
	private String nombre;
	private double sueldo;
	private Date altaContrato;
}
