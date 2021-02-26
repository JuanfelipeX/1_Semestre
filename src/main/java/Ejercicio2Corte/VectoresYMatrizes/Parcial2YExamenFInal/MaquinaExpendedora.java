package Ejercicio2Corte.VectoresYMatrizes.Parcial2YExamenFInal;

import java.awt.Color;

import java.util.Scanner;

//Nota 35 No muy Bueno

public class MaquinaExpendedora {  //Maquina expendedora Hace conmbinacion de todos los temas,matrizes la contraseña es 1001
    
    // Cuando se modifica el Stock, no muestra en el inventario final. Tiene unos errores
    
    public static void cliente(int codigo[] , String productos[] , int precio[] , int stock[]){
         Scanner datos = new Scanner (System.in);
         int x , s , e=0 , h=0 , d=0 ,c=0 ,k=0 , w=0 , j=0 ,f;
         System.out.println(" Digite el codigo producto a comprar");
         x=datos.nextInt();
         for (int i=0; i<codigo.length;i++){
             if(x==codigo[i]){
                 System.out.println(" El precio de: " + productos[i] + " es " + precio[i]);
                 System.out.println(" Digite denominacion del billete ");
                 s = datos.nextInt();
                 if(s>10000 && s<precio[i]){
                     System.out.println(" Error:Pago Insuficiente o Excedido...");
                 }else {
                     System.out.println(" Su cambio es: ");
                     f=(int) (s-precio[i]);
                     e=f/5000;
                     f=f-(e*5000);
                     h=f/2000;
                     f=f-(h*2000);
                     d=f/1000;
                     f=f-(d*100);
                     c=f/500;
                     f=f-(c*500);
                     k=f/500;
                     f=f-(k*200);
                     w=f/100;
                     f=f-(w*100);
                     j=f/50;
                     f=f-(j*50);
                         if(e>0){
                         }System.out.println(" Numero de billetes de 5000 " + e);
                         if(h>0){
                         }System.out.println(" Numero de billetes de 2000 " + h);
                         if(d>0){
                         }System.out.println(" Numero de billetes de 1000 " + d);
                         if(c>0){
                         }System.out.println(" Numero de monedas de 500 " + c);
                         if(k>0){
                         }System.out.println(" Numero de monedas de 200 " + k);
                         if(w>0){
                         }System.out.println(" Numero de monedas de 100 " + w);
                         if(j>0){
                         }System.out.println(" Numero de monedas de 50 " + j);
                     }
                 } 
             }
         }
    
    
    
   public static void productos2(int codigo[] , String productos[] , int precio[] , int stock[]){
       for (int i=0; i<stock.length;i++){
           System.out.println(codigo[i] + "\t" + productos[i] + "\t" + stock [i]);
       }
      
   }
    
    public static void productos(int codigo[] , String productos[] , int stock[] ){
        Scanner datos = new Scanner (System.in);
        int y , b=0 , m , suma=0;
        System.out.println(" Digite el codigo del producto [0 para terminar]:");
        y=datos.nextInt();
        for (int i=0; i<stock.length;i++){
            if(y==codigo[i]){
             System.out.println(codigo[i] + "\t" + "\t" + productos[i] + "\t" + "cantidad" + stock[i]);
                System.out.println(" Digite cantidad a agregar ");
                m=datos.nextInt();
                suma = stock[i]+ m;
            System.out.println(" Producto ha sido actualizado... ");
                System.out.println(codigo[i]+"\t"+"\t"+productos[i]+"\t"+suma);
             b=1;
            } 
        }
             if (y==0){
                 System.out.println(" Saliendo de Stock... ");
        } 
    }
    
    public static void mostrar(int codigo[] , String productos[] , int precio[] , int stock[] ){
        Scanner datos = new Scanner (System.in);
        for(int i=0;i<codigo.length;i++){
            System.out.println(codigo[i] + "\t" + productos[i] + "\t" + stock[i]);
        }
    }
    
     public static int op2(){
         Scanner datos = new Scanner (System.in);
        System.out.println(" 1. Habilitar/Deshabilitar Maquina ");
        System.out.println(" 2. Agregar Stock Productos ");
        System.out.println(" 3. Mostrar inventario ");
        System.out.println(" 4. Salir ");
        System.out.print(" Digite opcion ");
        int opcion = datos.nextInt();
        return opcion;
     }
    
    public static int op(){
        Scanner datos = new Scanner (System.in);
        System.out.println(" 1. Cliente ");
        System.out.println(" 2. Distribuidor ");
        System.out.println(" 3. Salir ");
        System.out.print(" Seleccione el tipo de usuario ");
        int opcion = datos.nextInt();
        return opcion;
    }
    
    public static void contraseña(){
        Scanner datos = new Scanner (System.in);
         System.out.println(" Usuario: ");
         String q =datos.next();
        int  u ;
        do{
            System.out.println(" Clave: ");      
            u = datos.nextInt();
            if(u == 1001){
                System.out.println(" Bienvenido/a " + q + " Su clave ha sido verificada... " );
        }else{
                System.out.println(" \033[31m Clave incorrecta... ");
            }
        }while(u != 1001);
    }
    
    public static void texto(){
        String a= " \033[34m Maquina Dispensora ";
        int p = a.length();
    for(int i=0; i < p-1; i++){
                System.out.print("\033[34m*");
            }
            System.out.println();
            
            for(int i=0; i < 1;i++){
                System.out.print("\033[34m*");
                System.out.print(" " + a.toUpperCase() + " ");
                for(int j=0;j < p; j++){
                }
                System.out.println("\033[34m*");
            }
        int i=0;
            do{
                System.out.print("\033[34m*");
                i++;
            }while(i<p-1);
            System.out.println("\033[34m");
    }
    
    public static void texto2(){
        String a= "     \033[34mModulo Distribuidor     ";
        int p = a.length();
    for(int i=0; i < p-1; i++){
                System.out.print("\033[34m*");
            }
            System.out.println();
            
            for(int i=0; i < 1;i++){
                System.out.print("\033[34m*");
                System.out.print("\033[34m " + a.toUpperCase() + "\033[34m ");
                for(int j=0;j < p; j++){
                }
                System.out.println("\033[34m*");
            }
        int i=0;
            do{
                System.out.print("\033[34m*");
                i++;
            }while(i<p-1);
            System.out.println("\033[34m");
    }
    
     public static void texto4(){
        String a= "     Lista De Productos     ";
        int p = a.length();
    for(int i=0; i < p+2; i++){
                System.out.print("\033[34m*");
            }
            System.out.println();
            
            for(int i=0; i < 1;i++){
                System.out.print("\033[34m*");
                System.out.print("\033[34m" + a.toUpperCase() + "\033[34m");
                for(int j=0;j < p; j++){
                }
                System.out.println("\033[34m*");
            }
        int i=0;
            do{
                System.out.print("\033[34m*");
                i++;
            }while(i<p+2);
            System.out.println("");
    }
    
    public static void texto3(){
        String a= "     Stock De Productos    ";
        int p = a.length();
    for(int i=0; i < p+2; i++){
                System.out.print("\033[34m*");
            }
            System.out.println();
            
            for(int i=0; i < 1;i++){
                System.out.print("\033[34m*");
                System.out.print("\033[34m" + a.toUpperCase() + "\033[34m");
                for(int j=0;j < p; j++){
                }
                System.out.println("\033[34m*");
            }
        int i=0;
            do{
                System.out.print("\033[34m*");
                i++;
            }while(i<p+2);
            System.out.println("\033[34m");
    }
    
    public static void opciones(int codigo[] , String productos[] , int precio[] , int stock[]){
       
        switch (op()){
            case 1:
                texto4();
                productos2(codigo,productos,precio,stock);
                cliente(codigo,productos,precio,stock);
                break;
            case 2:
                 contraseña();
                 texto2();
                 int opc2;
                 do{
                     opc2=op2();
                    switch (opc2){
                        case 1:
                            texto2();
                            int i=0;
                             for(i=0;i<1;i++){
                                 if(i==0 ){
                            System.out.println(" Habiltar/Deshabilitar Maquina " + "\n" + " Estado: " + "\n" + " Cambiando estado... " + "\n" + "\033[34m Maquina Deshabilitada ");
                          //  op2();
                            } }
                            if (i==1){
                            System.out.println(" Habiltar/Deshabilitar Maquina " + "\n" + " Estado: " + "\n" + " Cambiando estado... " + "\n" + "\033[34m Maquina Habilitada ");
                          //  op2();
                            }
                          //  op2();
                            break;
                        case 2:
                            texto3();
                            mostrar(codigo,productos,precio,stock);
                            productos(codigo,productos,stock);
                            productos2(codigo,productos,precio,stock);
                             texto3();
                           // op2();
                            break;
                        case 3:
                            texto3();
                            productos2(codigo,productos,precio,stock);
                            break;
                        case 4:
                            System.out.println(" Regresando a Menu Principal.. ");
                            op();
                            break;
                        default:
                            System.out.println(" Opcion no existente");
                            System.exit(0);
                             }
                 }while(opc2!=4);
                    break;
                    
            case 3:
                System.out.println(" Programa terminado.. ");
                System.exit(0);
                break;
            default:
                System.out.println(" Opcion no existente");
                System.exit(0);
        }
    }

    public static void main(String[] args) {
        int codigo [] = {101, 202 , 303 , 404 , 505};
        String productos [] = {" Speed Max " , " Vive 100" , " Pepsi" , " Coca Cola" , " Gatorade " };
        int precio [] = {1500 , 1300 , 2000 , 1800 , 2700 };
        int stock [] = {1 , 2 , 3 , 3 , 5};
        texto();
        //op();
        opciones(codigo,productos,precio,stock);
    }
    }