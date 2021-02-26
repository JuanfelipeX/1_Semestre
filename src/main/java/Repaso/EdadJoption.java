
package Repaso;

import javax.swing.JOptionPane;

public class EdadJoption {  //Opcion JOptingPane introduce la edad y dice el nombre

    public static void main(String[] args) {
	    
	    String nombre=JOptionPane.showInputDialog(" Introduce your name please ");	
	    String edad=JOptionPane.showInputDialog("Introduce your age ");
	    int edades=Integer.parseInt(edad);
	    System.out.println(" Hello" + nombre + " your age is " + edades);
    }
}