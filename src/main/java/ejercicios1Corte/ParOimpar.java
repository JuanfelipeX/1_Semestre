package ejercicios1Corte;

import java.util.Scanner;

public class ParOimpar { //Ingresa numero y dice si es par o impar

    public static void main(String[] args) {
        int x;
        Scanner x1=new Scanner(System.in);
        System.out.println(" digite el valor de x ");
        x = x1.nextInt();
        System.out.println(" El numero " + x + " es " + ParImpar(x));
    }
        public static String ParImpar (int x) {
            String resp= "";
        if (x%2==0){
        resp = "par";
        }else 
        {resp="impar";}
        return resp;
    }
}
    

