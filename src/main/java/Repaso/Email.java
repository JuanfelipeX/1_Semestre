
package Repaso;

import javax.swing.JOptionPane;

public class Email {

	public static void main(String[] args) {
		int arroba=0;
		boolean punto=false;
		String mail=JOptionPane.showInputDialog(" Introduce tu correo ");
		for(int i=0;i<mail.length();i++){
			if(mail.charAt(i)=='@' ){
				arroba++;
			} 
			if(mail.charAt(i)=='.' ){
				punto=true;
			}
		}
		if(arroba==1 && punto==true){
			System.out.println(" El email es correcto ");
		} else {
			System.out.println(" El email esta mal");
		}
	}	
}
