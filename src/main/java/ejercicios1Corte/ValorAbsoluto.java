
package ejercicios1Corte;

import java.util.Scanner;

public class ValorAbsoluto {  //Valor Absoluto de numero digitado
    
public static int ValorA (int numero1 ){
    return (int)(Math.abs(numero1));
}

    public static void main(String[] args) {
        Scanner numero = new Scanner (System.in);
        System.out.println(" Digite un numero ");
        int numero1 = numero.nextInt();
        int ValorA1 = ValorA(numero1);
        System.out.println(" El valor absoluto es " + ValorA1);
    }
}
