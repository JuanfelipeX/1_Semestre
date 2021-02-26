
package ejercicios1Corte.Parcial1Corte;

import java.util.Scanner;

public class PrepagoOPospago {  //Ingresa su numero de cel y escoje que tipo de recarga pospago o prepago y de hay arroja unos datos de minutos diponibles y valor de recarga
    
public static int CantidadMPrepago (int minutoPrepago , int recarga ){
    return (recarga/minutoPrepago);
}

public static int CantidadMPospago (int minutoPospago , int recarga ){
    return (recarga/minutoPospago);
}

    public static void main(String[] args) {
        int minutoPrepago = 100;
        int minutoPospago = 50;
        Scanner datos = new Scanner(System.in);
        System.out.println(" Ingrese el numero de celular ");
        String numero = datos.next();
        System.out.println(" Ingrese el valor de la recarga ");
        int recarga = datos.nextInt();
        System.out.println(" 1. Prepago ");
        System.out.println(" 2. Pospago");
        int opcion = datos.nextInt();
        switch (opcion){
            case 1:
                System.out.println(" Plan: Prepago ");
                int cantidadMPrepago = CantidadMPrepago(minutoPrepago , recarga );
                System.out.println(" Valor recargar: " + recarga);
                System.out.println(" Minutos Disponibles " + cantidadMPrepago );
                break;
            case 2:
                System.out.println(" Plan: Pospago ");
                int cantidadMPospago = CantidadMPospago (minutoPospago , recarga );
                System.out.println(" Valor recargar: " + recarga);
                System.out.println(" Minutos Disponibles " + cantidadMPospago);
                break;
            default: 
                System.out.println(" Error: Vuelva a escojer ");
        }
    }
}
