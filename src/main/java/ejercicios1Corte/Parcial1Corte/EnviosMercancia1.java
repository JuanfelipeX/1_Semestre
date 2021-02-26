package ejercicios1Corte.Parcial1Corte;

import java.util.Scanner;
 
public class EnviosMercancia1 {  //En una empresa de envios hay dos tipos de envios terrestre o aereo dependiendo del peso se le asigna el precio de envio
        
    public static double aereo (double peso ){
        return 6.600*peso;
    }
    
    public static double Terrestre (double peso ){
        return 6.000*peso;
    }

    public static void main(String[] args) {
        
        Scanner datos = new Scanner(System.in);
        System.out.println(" Ingrese el nombre de la mercancia ");
        String mercancia = datos.next();
        System.out.println(" Ingrese el peso de la mercancia en kilos ");
        double peso = datos.nextDouble();
        System.out.println(" Ingrese el tipo de envio ");
        System.out.println(" 1. Aereo ");
        System.out.println(" 2. Terrestre ");
        int opcion = datos.nextInt();
        switch (opcion){
            case 1:
                double aereo = aereo(peso);
                System.out.println(" Mercancia: " + mercancia + "\n"
                + " peso: " + peso + "kg" + "\n"
                + " Tipo de envio: Aereo " + "\n"
                + " Valor a pagar: " + aereo );
                break;
            case 2:
                double terrestre = Terrestre(peso);
                System.out.println(" Mercancia: " + mercancia + "\n"
                + " peso: " + peso + "kg" + "\n"
                + " Tipo de envio: Terrestre " + "\n"
                + " Valor a pagar: " + terrestre );
                break;
            default:
                System.out.println(" Error: opcion no existe.. ");    
        }
    }
}