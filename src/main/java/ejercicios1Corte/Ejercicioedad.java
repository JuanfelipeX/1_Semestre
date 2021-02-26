
package ejercicios1Corte;

import java.util.Scanner;

public class Ejercicioedad {  //Mayor o Menor de edad
    
    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        int edad;
        System.out.println("Digite edad");
        edad=datos.nextInt();
        if (edad>=18){
            System.out.println("Es mayor de edad");
        }else{
            System.out.println("Es menor de edad");
        }
    }
    
}
