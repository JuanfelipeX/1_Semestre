
package ejercicios1Corte;

import java.util.Scanner;

public class SignoContrario {  //Muestra el signo contraio del numero digitado
    
 public static void Signo(int x){
     int numero1 = x*-1;
        System.out.println(" El signo contrario es " + numero1);
 }
    public static void main(String[] args) {
      int x;
      Scanner x1 = new Scanner(System.in);
        System.out.println("ingrese un valor");
        x = x1.nextInt();
        Signo(x);
    }
    }


