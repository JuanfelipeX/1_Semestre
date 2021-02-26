
package ejercicios1Corte;

import java.util.Scanner;

public class SwitchOperaciones {
    
    // Metodo switch escoje numero y lanza un menu donde escoje la operacion que quiera //

    public static void main(String[] args) {
        Scanner numero = new Scanner (System.in);
        System.out.println(" Ingrese un numero ");
        Double numero1 = numero.nextDouble();
        Scanner numero2 = new Scanner (System.in);
        System.out.println(" Ingrese otro numero ");
        Double numero3 = numero2.nextDouble();
        
        System.out.println(" 1. Para hacer suma ");
        System.out.println(" 2. Para hacer resta ");
        System.out.println(" 3. Para hacer multiplicacion ");
        System.out.println(" 4. Para hacer division ");
        System.out.println(" 5. Para saca el residuo de una division ");
        int opcion = numero.nextInt();
        switch (opcion){
            case 1: 
                double Resultado = (numero1 + numero3);
                System.out.println(" El resultado de la suma es " + Resultado );
                break;
            case 2:
                Double Resultado1 = (numero1 - numero3);
                System.out.println(" El resultado de la resta es " + Resultado1 );
                break;
            case 3:
                double Resultado2 = (numero1 * numero3);
                System.out.println(" El resultado de la multiplicacion es " + Resultado2);
                break;
            case 4:
                double Resultado3 = (numero1 / numero3);
                System.out.println(" El resultado de division es " + Resultado3);
                break;
            case 5:
                double Resultado4 = (numero1 % numero3);
                System.out.println(" El resultado del residuo de la division es " + Resultado4);
                break;
            default:
                System.out.println(" Ingreso una opcion no disponible");
                break;
        }
        
    }
    
}
