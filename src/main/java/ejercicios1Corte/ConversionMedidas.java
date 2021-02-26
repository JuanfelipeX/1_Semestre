
package ejercicios1Corte;

import java.util.Scanner;

public class ConversionMedidas {  //Ingresa Valor de una Medida y uno escoje en que medida lo quiere
    
    public static double kilometros (double metros){
        return metros*1000;
    }
    
    public static double decimetros(double metros){
        return metros*10;
    }
    
    public static double centimetros (double metros){
        return metros*100;
    }

    public static void main(String[] args) {
       
        Scanner datos = new Scanner(System.in);
        System.out.println(" Ingrese un valor de medida en metros ");
        double metros = datos.nextDouble();
        if (metros > 0){
        System.out.println(" 1. Convertir a centimetros ");
        System.out.println(" 2. Convertir a decimetros ");
        System.out.println(" 3. Convertir a kilometros ");
        int opcion = datos.nextInt();
        switch (opcion){
            case 1:
                double centimetro = centimetros(metros);
                System.out.println( metros + "m" + " equivale a " + centimetro + "cm " );
                break;
            case 2:
                double decimetro = decimetros(metros);
                System.out.println( metros + "m" + " equivale a " + decimetro + "dm " );
                break;
            case 3:
                double kilometro = kilometros(metros);
                System.out.println( metros + "m" + " equivale a " + kilometro + "km " );
                break;
            default: 
                System.out.println(" Error: opción no existe… ");
        }
    } else 
            System.out.println(" Error: medida debe ser mayor a 0… ");
}
}
