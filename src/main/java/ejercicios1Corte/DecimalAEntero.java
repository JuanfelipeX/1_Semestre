
package ejercicios1Corte;

import java.util.Scanner;

public class DecimalAEntero {  // Muestra el valor entero de un numero decimal digitado
    
public static int Entero(double decimal1 ){  
                return (int)(Math.rint(decimal1*100)/100);
}
    public static void main(String[] args) {
        Scanner decimal = new Scanner (System.in);
        System.out.println(" Ingrese un numero decimal ");
        Double decimal1 = decimal.nextDouble();
        int Entero1 = Entero(decimal1);
        System.out.println(" El valor de decimal a entero es " + Entero1 );
    }
}