
package ejercicios1Corte.Parcial1Corte;

import java.util.Scanner;

public class Brazalete {  //Dependiendo del brazalete y personas se le da precio por el ingreso al parque
    
    public static int titanium (int personas , int TITANIUM ){
        return (TITANIUM*personas);
    }
    public static int silver (int personas , int SILVER ){
        return ( SILVER*personas);
    }
    public static int infantil (int personas , int INFANTIL ){
        return ( INFANTIL*personas);
    }   
    public static int ingreso (int personas , int INGRESO ){
        return ( INGRESO*personas);
    }

    public static void main(String[] args) {
        int TITANIUM = 59000;
        int SILVER = 49000;
        int INFANTIL = 39000; 
        int INGRESO = 5000;
        Scanner datos = new Scanner (System.in);
        System.out.println(" Ingrese el numero de personas que desean entrar ");
        int personas = datos.nextInt();
        System.out.println(" Ingrese que tipo de brazalete desea ");
        System.out.println(" 1. Titanium");
        System.out.println(" 2. Silver ");
        System.out.println(" 3. Infantil ");
        System.out.println(" 4. Ingreso ");
        int opcion = datos.nextInt();
        switch(opcion){
            case 1:
                int Titanium = titanium(personas, TITANIUM );
                System.out.println(" TITANIUM = 59000 ");
                System.out.println(" El numero de personas es " + personas );
                System.out.println(" El total a pagar es " + Titanium );
                break;
            case 2:
                int Silver = silver(personas , SILVER );
                System.out.println(" SILVER = 49000 ");
                System.out.println(" El numero de personas es " + personas );
                System.out.println(" El total a pagar es " + Silver );
                break;
            case 3:
                int Infantil = infantil (personas , INFANTIL );
                System.out.println(" INFANTIL = 39000 ");
                System.out.println(" El numero de personas es " + personas);
                System.out.println(" El total a pagar es " + Infantil);
                break;
            case 4:
                int Ingreso = ingreso (personas , INGRESO );
                System.out.println(" INGRESO = 5000 ");
                System.out.println(" El numero de personas es " + personas);
                System.out.println(" El total a pagar es " + Ingreso);
                break;
            default:
                System.out.println(" No ha escojido bien: Porfavor vuelva a escojer ");
        }
    }
}
