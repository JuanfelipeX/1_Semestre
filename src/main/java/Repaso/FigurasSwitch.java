
package Repaso;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class FigurasSwitch {  // Switch el area de figuras 
	public static void main(String[] args) {
		Scanner datos = new Scanner(System.in);
		System.out.println(" Ingrese la opcion \n1: Cuadrado \n2: Rectangulo \n3: Triangulo \n4: Circulo");
		int opcion=datos.nextInt();
		switch(opcion){
			case 1:
				int lado=Integer.parseInt(JOptionPane.showInputDialog("Introduce the side"));
				System.out.println(" El area del cuadrado es " + Math.pow(lado, 2));
				break;
			case 2:
				int base=Integer.parseInt(JOptionPane.showInputDialog("Introduce the base"));
				int alture=Integer.parseInt(JOptionPane.showInputDialog("Introduce the alture"));
				System.out.println(" The area of rectangule is " + base*alture );
				break;
			case 3:
				int base2=Integer.parseInt(JOptionPane.showInputDialog("Introduce the base"));
				int alture2=Integer.parseInt(JOptionPane.showInputDialog("Introduce the alture"));
				System.out.println(" The area of triangule is " + (base2*alture2)/2 );
			case 4:
				int radio=Integer.parseInt(JOptionPane.showInputDialog("Introduce the radio"));
				System.out.println(" The area of circule is ");
				System.out.printf("%1.2f", Math.PI*(Math.pow(radio, 2)));
				break;
			default:
				System.out.println(" Error.. opcion no disponible");		
		}
}	
}
