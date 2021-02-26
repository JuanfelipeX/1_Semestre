
package ejercicios1Corte;

import java.util.Scanner;

public class VocalOConsonante {  //Determina si una palabra es consonante o vocal
    public static String letras(char letra) {
    String respuesta = "";
    if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u' )
    respuesta = "vocal";
    else if (Character.isLetter(letra)){
        respuesta = " consonante ";
    } else 
        respuesta = " Error! ";
    return respuesta;
}
    public static void main(String[] args) {
String nombre;
    char letra;
    Scanner leer = new Scanner (System.in);
        System.out.println(" Ingrese un caracter ");
    nombre = leer.next();
    if (nombre.length()>1){
        System.out.println(" Error! ");
    }
    else {
        letra = nombre.charAt(0);
        System.out.println(letras(letra));
    }
    }
}

