package ejercicios1Corte.Parcial1Corte;

import java.util.Scanner;

public class EnviosMercancia2 {  //En una empresa de envios hay dos tipos de envios terrestre o aereo dependiendo del peso se le asigna el precio de envio y hay un incremento

   public static double aereo (double peso , double incremento ){
        return incremento*peso;
    }
    
    public static double Terrestre (double peso ){
        return 6.000*peso;
    }
    public static double Incremento (double envio ){
        return (envio * 0.10)+envio ;
    }

    public static void main(String[] args) {
        double envio = 6000;
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
                double incremento = Incremento(envio);
                double aereo = aereo(peso , incremento);
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
   

