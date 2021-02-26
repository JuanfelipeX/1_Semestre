package ejercicios1Corte.Parcial1Corte;

import java.util.Scanner;

public class ConversioLIbras {  //Ingresa un peso en libras y usted escoje en que conversion lo quiere
    
    public static double Gramos (double valor ){
        return valor*454;
    }
    
    public static double Kilos (double valor ){
        return valor/2.205;
    }

    public static void main(String[] args) {
        
        Scanner datos = new Scanner(System.in);
        System.out.println(" Ingrese un valor  en libras ");
        double valor = datos.nextDouble();
        if (valor>0){
             System.out.println(" Seleccione una de las opciones ");
             System.out.println(" 1. Gramos ");
             System.out.println(" 2. Onzas ");
             System.out.println(" 3. Kilos");
             int opcion = datos.nextInt();
             switch(opcion){
                 case 1:
                     double gramos = Gramos(valor);
                     System.out.println( valor + "lb" + " = " + gramos + "gr" );
                     break;
                 case 2:
                     double onzas = valor*16;
                     System.out.println( valor + "lb" + " = " + onzas + "oz");
                     break;
                 case 3:
                     double kilos = Kilos(valor);
                     System.out.println( valor + "lb" + " = " + kilos + "kg");
                     break;
                 default:
                     System.out.println(" Error: opción no existe " );
             }
        } else 
            System.out.println(" Error: medida debe ser mayor a 0 ");
        
    }
}
