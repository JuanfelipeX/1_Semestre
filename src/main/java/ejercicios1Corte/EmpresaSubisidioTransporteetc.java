package ejercicios1Corte;

import java.util.Scanner;

public class EmpresaSubisidioTransporteetc {

    public static void main(String[] args) {  // Ingresa nombre Sueldo año ingreso empresa y bonificaciones
        
        Scanner nombre= new Scanner (System.in);
        String nombre1;
        System.out.println(" Ingrese el nombre ");
       nombre1 = nombre.nextLine();
       Scanner sueldo= new Scanner (System.in);
        double sueldo1;
        System.out.println(" Ingrese el sueldo ");
       sueldo1 = sueldo.nextDouble();
        Scanner año= new Scanner (System.in);
        int año1;
        System.out.println(" Ingrese el año ");
       año1 = año.nextInt();
        double subtrans=0, quinquenio=0;
       if (sueldo1<=890000){
        subtrans = 90000;  
       }
       
       if (año1+5<=2020){
          quinquenio = (sueldo1*10)/10;
       }
    
        System.out.println(" El señor/a " + nombre1 + " con sueldo de " + sueldo1 + " y año de ingreso " + año1 + "\n" + " tiene las siguientes bonificacione " + "\n" + " Subsidio de tranporte " + subtrans + "\n" + " Quinqenio " + quinquenio ); 
           
       }
    
}
