
package Repaso;

import java.util.Scanner;

public class NumeroAleatorio {  // Hallar el numero aleatorio por la maquina
	
	public static void main(String[] args) {
		int aleatorio = (int)(Math.random()*100);  //Refundicion math.random devuelve un numero decimal 
		                                           //pero Haciendo REFUNDICION lo devuelve en entero
		Scanner datos = new Scanner(System.in);
		int numero=0;
		int intentos=0;
		while(numero!=aleatorio){
			intentos++;
		System.out.println(" Ingrese el numero ");
		numero=datos.nextInt();
		if(numero<aleatorio){
			System.out.println(" Te Falta");
			
		} else if(numero>aleatorio){
			System.out.println(" Te pasastes ");
		}
		}
		System.out.println(" Correcto el numero hallado es " + numero + " El numero de intentos usados son " + intentos );
	}
}
