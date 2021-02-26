package Ejercicio2Corte.VectoresYMatrizes;


public class DosMatrizesMetodo {   //Muesta dos matrizes A y B

    public static void main(String[] args) {
        int [][] numeros = {{2,6},{6,8}};
        int [][] numeros1 = {{4,123},{6,8}};
        System.out.println(" Matriz 1 ");
        mostrar(numeros);
        System.out.println(" Matriz 2");
        mostrar(numeros1);
    }
        public static void mostrar(int [][] numeros){
        for(int i=0; i<numeros.length;i++){
            for(int j=0;j<numeros[i].length;j++){
                System.out.print(numeros[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
