package Ejercicio2Corte.VectoresYMatrizes.Parcial2YExamenFInal;

import java.util.Scanner;

public class ExamenFInal {  //45 
    
    // falta mostrar la placa y el total de pasajeros del vehículo que tenga la mayor cantidad de pasajeros en total.
    
   public static int opCaso2(){
        Scanner datos = new Scanner (System.in);
        System.out.println(" 1. Placa ");
        System.out.println(" 2. Pasajaeros ");
        System.out.print(" Digite la opcion ");
        int opcion = datos.nextInt();
        return opcion;
    }
    
    public static int op(){
        Scanner datos = new Scanner (System.in);
        System.out.println(" 1. Listado Inicial ");
        System.out.println(" 2. Registrar Vehiculos ");
        System.out.println(" 3. Modificar Datos ");
        System.out.println(" 4. Retirar Vehiculo ");
        System.out.println(" 5. Generar Reporte");
        System.out.println(" 6. Salir ");
        System.out.println(" Digite la opcion: ");
        int opcion = datos.nextInt();
        return opcion;
    }
    
    public static void texto1(){
        String a= " Empresa Transporte TransProgramming ";
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
    
    public static void texto2(){
        String a= "        Listado Vehiculos Registrados        ";
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
    
    public static void texto3(){
        String a= " Registro De vehiculos ";
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
    
    public static void texto4(){
        String a= "     Modificar Vehiculos     ";
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
    
    public static void texto5(){
        String a= "       Reporte Vehiculos       ";
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
    
    public static void texto6(){
        String a= "       Retirar Vehiculos       ";
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
    
    public static int Buscar(String[] nombre  ){
        String buscando="LIBRE";
        int pos=-1;
        for(int i=0; i<nombre.length;i++){
            if(nombre[i].equalsIgnoreCase(buscando)){
                pos=i;
            }
        }
        return pos;
}
    public static void llenar(double [][] pasajeros , String [] placas  ){
        Scanner datos = new Scanner(System.in);
        int p=Buscar(placas);
        if(p==-1){
            System.out.println("No hay cupos para nuevos vehiculos... ");
        }else{
            System.out.println(" DATOS NUEVO VEHICULO ");
            System.out.println(" PLACA "); 
            placas[p]=datos.next();
            for (int i = 0; i < pasajeros[p].length; i++) {
                System.out.println(" Pasajeros Semana "+(i+1)+": ");
                pasajeros[p][i]=datos.nextDouble();
                System.out.println(" Vehiculo ha sido registrado ");
            }
            
        }
    }
    public static void mostrar(double [][] pasajeros , String [] placas  ){
        for(int i=0; i<pasajeros.length;i++){ 
           
               System.out.print(placas[i]+ " \t ");
                       for(int j=0; j<pasajeros[i].length;j++){
                System.out.print(pasajeros[i][j] + " \t ");
            }
            System.out.println("");
        }
    }

    
    public static void DatosFilas(int c , double [][] pasajeros , String []vehiculos  ){
        System.out.print(vehiculos[c] + "\t" );
        for(int i=0;i<pasajeros[c].length;i++){
           System.out.print("\t" + pasajeros[c][i]); 
        }   
        System.out.println("");
    }
    
    public static void caso4(double [][] pasajeros , String []vehiculos){
         Scanner datos = new Scanner (System.in);
         String n , a="1" , r;
         boolean t=false;
         do{
           System.out.println(" Digite Placa del vehiculo [0 para terminar] ");
                n=datos.next();
                for(int c=0;c<vehiculos.length;c++){
                    if(vehiculos[c].equalsIgnoreCase(n)){
                        System.out.println(" El Vehiculo seleccionado es: ");
                        DatosFilas(c,pasajeros,vehiculos);
                        System.out.println("");
                        System.out.println(" Esta seguro de eliminar (1 para confirmar) ");
                        a=datos.next();
                        for(int b=0;b<pasajeros[0].length;b++){
                        if(a.equals("1")){
                            vehiculos[c]="libre";
                            pasajeros[c][b]=0; 
                       }
                        else {
                        }
                        t=true;
                    }
                    }
                }
                   texto2();
                    mostrar(pasajeros,vehiculos);
                if(!t){
                    System.out.println(" Vehiculo no existente... ");
                }
         }while(!n.equals("0"));
         System.out.println(" Terminar proceso retiro de vehiculos ... ");
    }
            
     public static void caso3(double [][] pasajeros , String []vehiculos){
         Scanner datos = new Scanner (System.in);
         String n ;
         boolean t=false;
         do{
           System.out.println(" Digite Placa del vehiculo [0 para terminar] ");
                n=datos.next();
                for(int c=0;c<vehiculos.length;c++){
                    if(vehiculos[c].equalsIgnoreCase(n)){
                        System.out.println(" El Vehiculo seleccionado es: ");
                        DatosFilas(c,pasajeros,vehiculos);
                        System.out.println(" ");
                        System.out.println(" Que dato desea modificar: ");
                        int opc=opCaso2();
                        switch(opc){
                            case 1:
                                System.out.println(" Digite nueva placa ");
                                vehiculos[c]=datos.next();
                                System.out.println(" Vehiculo actualizado... ");
                                DatosFilas(c,pasajeros,vehiculos);
                                break;
                            case 2:
                                System.out.println(" Digite numero de la semana(1-4): ");
                                int sem=datos.nextInt();
                                System.out.println(" Digite nueva cantidad de pasajeros: ");
                                pasajeros[c][sem-1]=datos.nextDouble();
                                System.out.println(" Vehiculo ha sido actualizado... ");
                                DatosFilas(c,pasajeros,vehiculos);
                                break;
                            default:
                                System.out.println(" Error: Opcion no existente... ");
                                break;
                        }
                       t=true; 
                    }
                }
                
                if(!t){
                    System.out.println(" Vehiculo no existente... ");
                }
         }while(!n.equals("0"));
         System.out.println(" Saliendo De Modificar... ");
         }
     
     public static void caso5(double [][] pasajeros , String [] vehiculos , double [] total){
       for(int i=0;i<pasajeros.length;i++){
                    System.out.print(vehiculos[i]+" \t ");  
                    double sum=0;
                    for(int j=0;j<pasajeros[0].length;j++){
                        System.out.print(pasajeros[i][j]+"\t");
                        sum+=pasajeros[i][j];
                    }
                    System.out.println( sum );
                }
                System.out.println(""); 
               
               /* for(int x=0;x<pasajeros.length;x++){
                    double mayor=0;
                   // if(total[x] > mayor){
                      //  mayor=total[x];
                    }
                }*/
     }
     
       
      
    public static void datos(){
        String [] vehiculos = {"QWE123","ASD345","ZXC567","JKL789", "Libre","Libre"};
        double [][] pasajeros ={{1,2,3,4},
                                {5,6,7,8},
                               {9,10,11,12},
                               {13,14,15,16},
                               {0,0,0,0},
                               {0,0,0,0}};
         double [] total = {};
        int opc;
        do{ 
              texto1();
             opc=op();
        switch (opc){
            case 1:
                texto2();
                System.out.println("PLACA " + "SEMANA 1 " + "SEMANA 2 " + "SEMANA 3 " + "SEMANA 4 ");
                mostrar(pasajeros,vehiculos);
                break;
            case 2:
                texto3();   
                llenar(pasajeros,vehiculos);
                texto2();
                mostrar(pasajeros,vehiculos);
                break;
            case 3:
                texto2();
                mostrar(pasajeros,vehiculos);               
                caso3(pasajeros,vehiculos);
                break;
            case 4:
                 texto2();
                 mostrar(pasajeros,vehiculos);             
                 texto6();
                 caso4(pasajeros,vehiculos);
                break;
            case 5:
                texto5();
                System.out.println("PLACA " + "SEMANA 1 " + "SEMANA 2 " + "SEMANA 3 " + "SEMANA 4 " + "Totales");
                caso5(pasajeros,vehiculos,total);
                break;
            case 6:
                System.out.println(" Programa Terminado");
                break;
            default:
                System.out.println(" Error: Opcion no existente... ");
                System.exit(0);
               
    }
        }while(opc!=6);
    }
    
    public static void main(String[] args) {
        datos();
    }
}