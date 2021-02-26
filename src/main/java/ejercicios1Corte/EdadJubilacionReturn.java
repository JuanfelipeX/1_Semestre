package ejercicios1Corte;


import java.util.Scanner;

public class EdadJubilacionReturn {  //Edad de jubilacion 
    
    public static int Pension (String sexo){
        if ("M".equals(sexo)){
        return 57;
    }else 
        return 67;
    }

    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        System.out.println(" Ingrese el nombre");
        String nombre = lectura.next();
        System.out.println(" Ingrese su sexo ");
        String sexo = lectura.next();
        int pension = Pension(sexo);
        System.out.println( nombre + " con sexo " + sexo + " su edad de jubilacion es " + pension );
    }
}
