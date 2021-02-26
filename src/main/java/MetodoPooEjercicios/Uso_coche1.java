
package MetodoPooEjercicios;

import javax.swing.JOptionPane;

public class Uso_coche1 {  // 2 ficheros uno con void main donde ejecuta los procesos y otro estan todas las clases

	public static void main(String[] args) {
		
	DatosCoche1 Carro= new DatosCoche1();    //INSTANCIAR UNA CLASE. EJEMPLAR CLASE
	
		// Datos pide System.out.println("Las ruedas del coche tiene " + Carro.ruedas + " Ruedas"); 
		
		System.out.println(Carro.DatosGenereales()); //getter
		
		Carro.EstableceColor(JOptionPane.showInputDialog(" Introduce el color del coche "));  // esteblece color
		
		System.out.println(Carro.DimeColor()); //getter

		
		Carro.Asientos(JOptionPane.showInputDialog(" ¿Tiene asientos de cuero? "));  //establece el asiento
		
		System.out.println(Carro.dimeasientos());
		
		Carro.Clima(JOptionPane.showInputDialog(" ¿Tiene climatizador? ")); 
		
		System.out.println(Carro.dimeClima());
		
		System.out.println(Carro.dimePeso());
		
		System.out.println(" El precio final del coche es " + Carro.preciocoche());
	}
}
