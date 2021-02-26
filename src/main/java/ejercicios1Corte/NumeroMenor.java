
package ejercicios1Corte;

import java.util.Scanner;

public class NumeroMenor {   //Numero menor

    public static int Menor(int numero1 , int numero3){  
        return (int)(Math.min(numero1, numero3)) ;
    }
    public static void main(String[] args) {
        Scanner numero = new Scanner (System.in);
        System.out.println(" Ingrese un numero");
        int numero1 = numero.nextInt();
        Scanner numero2 = new Scanner (System.in);
        System.out.println(" Ingrese otro numero");
        int numero3 = numero2.nextInt();
        int Menor1 = Menor (numero1, numero3);
        System.out.println(" El numero menor es " + Menor1);
    }
    
}
