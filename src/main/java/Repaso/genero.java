
package Repaso;

import javax.swing.JOptionPane;

public class genero {

	public static void main(String[] args) {
		String genero="";
		do{
		genero=JOptionPane.showInputDialog(" Introduce tu genero (Hombre/Mujer)");	
		}while(genero.equalsIgnoreCase("Hombre")==false && genero.equalsIgnoreCase("Mujer")==false);
		int altura=Integer.parseInt(JOptionPane.showInputDialog(" Introduce tu edad en cm "));
		int pesoI=0;
		if(genero.equalsIgnoreCase("Hombre")){
			pesoI=altura-110;
		}else if(genero.equalsIgnoreCase("Mujer")){
			pesoI=altura-120;
		}
		System.out.println(" Tu genero es " + genero + " Y tu peso ideal es " + pesoI + "KG");
	}
}
