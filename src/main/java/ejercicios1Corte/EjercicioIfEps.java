
package ejercicios1Corte;

import java.util.Scanner;

public class EjercicioIfEps {  //Debe ingresar Un tipo de eps A,B,C y de hay corresponde su categoria

    public static int categoria (String eps ){
        
        if (eps.equals("A")){
            return 2500;
        } if (eps.equals("B")){
            return 12000;
        } if (eps.equals("C")){
            return 35000;
        }
        return 0;
    }
    
    public static void main(String[] args) {
        
        System.out.println(" Ingrese su nombre ");
        Scanner datos = new Scanner(System.in);
        String nombre = datos.next();
        System.out.println(" Ingrese su categoria de eps ");
        String eps = datos.next();
        int Categoria = categoria(eps);
        System.out.println(" El valor de la cuota moderada de: " + nombre + " con categoria " + eps + " corresponde " + Categoria );
    }
}
