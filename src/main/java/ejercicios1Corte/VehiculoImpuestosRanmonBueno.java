
package ejercicios1Corte;

import java.util.Scanner;

public class VehiculoImpuestosRanmonBueno {  //Random pero efectivo xd
    
    public static void main(String[] args) {
        String nombre= "Juan Felipe Jimenez";
        int edad = 16;
        double estatura = 1.72 ;
        
        System.out.println( nombre + " es una persona de " + edad + " años con una estatura de " + estatura  );
        
        
        
        String placa = "BIG456";
    int modelo = 2019;
    double valor = 45000000 ;
    int porcentaje = (int) (valor*10)/100;
    
    System.out.println( " El vehiculo de placas " + placa + " de modelo " + modelo + " cuyo valor es " + valor + " millones, debe pagar un impuesto de " + porcentaje );
                
    }
   
    
    
    static {
     Scanner placa=new Scanner(System.in);
     String placa1;
     System.out.println(" ingrese la placa ");
     placa1 = placa.nextLine();
     
     Scanner modelo=new Scanner(System.in);
     String modelo1;
     System.out.println(" ingrese el modelo ");
     modelo1 = modelo.nextLine();
     
     Scanner precio=new Scanner(System.in);
     String precio1;
     System.out.println(" ingrese el precio del automovil ");
     precio1 = precio.nextLine();
     
     int model = 2001;
     int modelo2 = Integer.parseInt(modelo1);
     int precio2 = Integer.parseInt(precio1);
     
     int porcentaje = (precio2*5)/100;
       int porcentaje2 = (precio2*8)/100;
         
     if (modelo2>model){ 
          System.out.println(" su impuesto del automovil es del 5% y queda asi " + porcentaje );
     System.out.println( " El vehiculo de placas " + placa1 + " de modelo " + modelo1 + " cuyo valor es " + precio2 + " millones, debe pagar un impuesto de " + porcentaje );
     }
         else {
         System.out.println(" su impuesto del automovil es del 8% y queda asi " + porcentaje2 );
    System.out.println( " El vehiculo de placas " + placa1 + " de modelo " + modelo1 + " cuyo valor es " + precio2 + " millones, debe pagar un impuesto de " + porcentaje2 );
     }
    
   
    }
}