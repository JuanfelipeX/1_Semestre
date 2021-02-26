
package ejercicios1Corte;

import java.util.Scanner;

public class OrdenarNumerosMayoraMenor {
    
    // ordenar 3 numeros de mayor a menor//

    public static void main(String[] args) {
     Scanner numero =  new Scanner (System.in);
        System.out.println(" Ingrese un numero ");
        int numero1 = numero.nextInt();
         Scanner numero2 =  new Scanner (System.in);
        System.out.println(" Ingrese otro numero ");
        int numero3 = numero2.nextInt();
        Scanner numero4 =  new Scanner (System.in);
        System.out.println(" Ingrese otro numero ");
        int numero5 = numero4.nextInt();
        if ((numero1>numero3) && (numero3>numero5)){
        System.out.println(" El orden es " + numero1 + "  " + numero3 + "  " + numero5 );
    }
        else if ((numero1>numero5) && (numero5>numero3)) {
        System.out.println(" El orden es " + numero1 +"  "+ numero5 +"  " + numero3 );
    }
        else if ((numero3>numero1) && (numero1>numero5)) {
            System.out.println(" El orden es " + numero3 +"  " +numero1 +"  "+ numero5 );
    }
        else if ((numero3>numero5) && (numero5>numero1)) {
            System.out.println(" El orden es " + numero3 +"  "+ numero5+"  " + numero1 );
    }
        else if ((numero5>numero3) && (numero3>numero1)) {
            System.out.println(" El orden es " + numero5 +"  " + numero3 +"  " + numero1 );
    }
        else {
            System.out.println(" El orden es " + numero5 +"  "+ numero1 + "  " + numero3);
    }
    }
}
