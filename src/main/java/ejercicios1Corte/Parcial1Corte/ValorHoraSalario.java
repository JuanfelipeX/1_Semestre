
package ejercicios1Corte.Parcial1Corte;

import java.util.Scanner;

public class ValorHoraSalario {    // Ingresa el valor del empleado y de hay se le asigna el valor de hora extra dependiente y se le da su salario dependiente del trabajo hecho extra
    // HEO = HORA EXTRA ORDINARIA
    // HED = HORA EXTRA DIURNA 
    // HEN  = HORA EXTRA NOCTURNA
    // HEDDF = HORA EXTRA DIURNA DOMINICAL FESTIVO
    // HENDF
     public static double heo (int salario ){
         return (salario/180);
     }
     public static double Hed (double Heo ){
         return (Heo*0.25)+Heo;
     }
     public static double Hen (double Heo ){
         return (Heo*0.75)+Heo;
     }

    public static void main(String[] args) {
   Scanner nombre1 = new Scanner (System.in);
        System.out.println(" Ingrese el nombre ");
        String nombre = nombre1.next();
        Scanner salario1 = new Scanner (System.in);
        System.out.println(" Ingrese el salario ");
        int salario = salario1.nextInt();
        Scanner lectura = new Scanner (System.in);
        System.out.println(" 1. Valor hora ordinaria ");
        System.out.println(" 2. Valor hora extra diurna ");
        System.out.println(" 3. Valor hora extra nocturna ");
        System.out.println(" 4. Valor hora extra diurna Festivo/Dominical ");
        System.out.println(" 5. Valor hora extra nocturna Festivo/Dominical ");
        int opcion = lectura.nextInt();
         double Heo = heo(salario);
         double hed = Hed(Heo);
         double hen = Hen(Heo);
         double heddf = (Heo+hed);
         double hendf = ( heddf + hen);
        switch (opcion){
            case 1:
                System.out.println( " La persona " + nombre + " con salario de " + salario + " tiene un valor de hora extra ordinaria de " + Heo );
                break;
            case 2:
                System.out.println("  La persona " + nombre + " con salario de " + salario + " tiene un valor de hora extra diurna de " + hed );
                break;
            case 3:
                System.out.println("  La persona " + nombre + " con salario de " + salario + " tiene un valor de hora extra diurna de " + hen );
                break;
            case 4:
                System.out.println("  La persona " + nombre + " con salario de " + salario + " tiene un valor de hora extra diurna de " + heddf );
                break;
            case 5:
                System.out.println("  La persona " + nombre + " con salario de " + salario + " tiene un valor de hora extra diurna de " + hendf );
                break;
            default:
                System.out.println(" Error: Vuelva a escojer ");
                
        }
    }
}
