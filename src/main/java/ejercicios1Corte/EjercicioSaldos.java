
package ejercicios1Corte;

import static java.lang.System.exit;

import java.util.Scanner;

public class EjercicioSaldos {   //Debe ingresar un saldo mayor a 100000 y de hay despliega un menu de opciones

    public static int SaldoN (int saldo , int saldoc) {
     return (saldo + saldoc);
    }
    
    public static int SaldoRetiro (int saldo , int SaldoR1) {
     return (saldo - SaldoR1);
    }
     
    public static void main(String[] args) {
        System.out.println(" Ingrese su Saldo ");
        Scanner saldo1 = new Scanner(System.in);
        int saldo = saldo1.nextInt();
        if ( saldo > 100000){ 
            Scanner lectura = new Scanner(System.in);
            System.out.println(" Ingrese una de las opciones"); 
        System.out.println(" R. Para Retirar ");
        System.out.println(" C. Para Consignar ");
        System.out.println(" S. Para Salir ");
        char opcion = lectura.next().toUpperCase().charAt(0);
        switch (opcion){
            case 'R':{
                System.out.println(" Ingrese el valor que desea retirar ");
                Scanner SaldoR = new Scanner(System.in);
                int SaldoR1 = SaldoR.nextInt();
                int SaldoRe = SaldoRetiro( saldo , SaldoR1);
                if (SaldoRe < 10000 ){
                System.out.println(" Fondos Insuficientes ");
                }
                if (SaldoRe > 10000 ){
                System.out.println(" El nuevo saldo es " + SaldoRe);
                }
                break;
            }
            case 'C':{
                System.out.println(" Ingrese el valor que desea consignar ");
                Scanner SaldoC = new Scanner(System.in);
                int Saldoc = SaldoC.nextInt();
                int SaldoNu = SaldoN( saldo , Saldoc );
                System.out.println(" El nuevo saldo es " + SaldoNu );
                break;
            }
            case 'S':{
                System.out.println(" Programa terminado ");
                exit(1);
                break;
            }
            default:{
                System.out.println(" Error: No escogio ninguno ");
            }
        }
    }
        else{ 
    
        System.out.println(" Error en apertura de cuenta ");
        }
    }
}


