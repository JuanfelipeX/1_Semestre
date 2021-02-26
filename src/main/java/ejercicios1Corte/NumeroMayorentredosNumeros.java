
package ejercicios1Corte;

import java.util.Scanner;


public class NumeroMayorentredosNumeros {
    
    // muestra cual es el numero mayor//

    public static void main(String[] args) {
      Scanner numero =  new Scanner (System.in);
        System.out.println(" Ingrese un numero ");
        int numero1 = numero.nextInt();
         Scanner numero2 =  new Scanner (System.in);
        System.out.println(" Ingrese otro numero ");
        int numero3 = numero2.nextInt();
        if (numero1>numero3){
            System.out.println(" El numero mayor es " + numero1 );
        }
        else {
            System.out.println(" El numero mayor es " + numero3 );
      
    }
    }
}
