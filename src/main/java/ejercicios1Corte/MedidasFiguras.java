
package ejercicios1Corte;

import static java.lang.Math.PI;
import java.util.Scanner;

// Crea una aplicación que nos calcule el área de un circulo, cuadrado o triangulo.  //
// Pediremos que figura queremos calcular su área y según lo introducido pedirá los valores necesarios para calcular el área. //
// Crea un método por cada figura para calcular cada área, este devolverá un número real. Muestra el resultado por pantalla  //

public class MedidasFiguras {
    
     public static Double Circulo(double radio ){
         return (Double) Math.pow(radio,2)*PI;
     }
     
     public static Double Triangulo(double base , double altura ){
         return (Double) (base * altura ) / 2;
     }
     
     public static Double Cuadrado(double lado){
         return (Double) (lado * lado );
     }
    public static void main(String[] args) {
        
        System.out.println(" Ingrese que tipo de figura quiere calcular "); 
        Scanner lectura = new Scanner(System.in);    
        System.out.println(" 1. Para hallar el circulo ");
        System.out.println(" 2. Para hallar el triangulo ");
        System.out.println(" 3. Para hallar el cuadrado ");
        int opcion = lectura.nextInt();
        switch (opcion){
            
            case 1:
                System.out.println(" Escogio Circulo ");
                System.out.println(" Ingrese el Radio ");
                Scanner radio1 = new Scanner(System.in);
                Double radio = radio1.nextDouble();
                Double Circulo1 = Circulo (radio);
                System.out.println(" El resultado del area del circulo es " + Circulo1 );
                break;
                
            case 2:
                System.out.println(" Escogio Triangulo ");
                System.out.println(" Ingrese la base ");
                Scanner base1 = new Scanner(System.in);
                Double base = base1.nextDouble();
                System.out.println(" Ingrese la altura ");
                Scanner altura1 = new Scanner(System.in);
                Double altura = altura1.nextDouble();
                Double Triangulo1 = Triangulo(base , altura);
                System.out.println(" El Resultado del area del triangulo es " + Triangulo1);
                break;
                
            case 3: 
                System.out.println(" Escogio Cuadrado ");
                System.out.println(" Ingrese el lado ");
                Scanner lado1 = new Scanner(System.in);
                Double lado = lado1.nextDouble();
                Double Cuadrado1 = Cuadrado(lado);
                System.out.println(" El Resultado del area del cuadrado es " + Cuadrado1);
                break;
            default:
                System.out.println(" No ha introducido la opcion correcta: vuelva a elegir ");
        }
    }
}
