
package Repaso;

import java.util.Scanner;
import javax.swing.JOptionPane;

 public class ClaveWhile {  // Clave con while
	public static void main(String[] args) {
		Scanner datos = new Scanner(System.in);
		System.out.println(" Ingrese la clave ");
		String clave=datos.nextLine();
		String pass="";
		while (clave.equals(pass)==false){
			pass=JOptionPane.showInputDialog("Introduce la clave");
			if(clave.equals(pass)==false){
				System.out.println(" Contraseña incorrecta ");
			}
		}
		System.out.println(" Contraseña Correcta. Acceso Permitido");
	}
}
