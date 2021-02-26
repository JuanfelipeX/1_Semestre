
package ejercicios1Corte;

public class TiposDeDatos {

    public static void main(String[] args) {  //Tipos de datos
        // tipo de dato primitivos
        // declarar variable
        // tipo de dato y nombre de variable
        byte varByte=127; //almacenar una cantidad de caracteres
        int  VarInt=32500; //declarar e iniciar //minima de enteros preferido
        long Varlong=64000; 
        float Varfloat=1200000;
        double  Vardouble=Math.PI;  //maxima preferidad por desarroladores
        char Varchar='A';
        boolean Varboolean=true;
        System.out.println("Variable Byte" + varByte);
        System.out.println("Variable int" + VarInt);
        System.out.println("Variable long" + Varlong);
        System.out.println("Variable float" + Varfloat);
        System.out.println("Variable double" + Vardouble);
        System.out.println("Variable char" + Varchar);
        System.out.println("Variable boolean" + Varboolean);
        //Datos tipo objeto envoltorio
        Integer objInt= new Integer ("246");
        Double objDouble = Vardouble;   //definir variables
        String objString= "ejemplo de datos"; //nombres,mensajes,textos
        String nombre="Juan Felipe Jimenez";
        System.out.println("Dato integer"+objInt);
        System.out.println("Dato double"+objDouble);
        System.out.println("Dato string texto"+objString);
        System.out.println("Dato string nombre"+nombre);
      
    }
    
}
