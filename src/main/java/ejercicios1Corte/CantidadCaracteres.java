
package ejercicios1Corte;

import java.util.Scanner;

//  Leer un nombre y mostrar la cantidad de letras del nombre usando el siguiente método  

public class CantidadCaracteres {
     public static int Caracteres (String nombre) {
         return nombre.length();
}
    public static void main(String[] args) {
        Scanner Nombre1 = new Scanner(System.in);
        System.out.println(" Ingrese su nombre");
        String nombre = Nombre1.nextLine();
        int Caracter = Caracteres(nombre);
        System.out.println(" La cantidad de la caracter es " + Caracter );
    }
}
