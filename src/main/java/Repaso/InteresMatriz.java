
package Repaso;

public class InteresMatriz { //Tabla interes ver en forma horizontal

	public static void main(String[] args) {
		double acumulado;
		double interes=0.10;
		double [][] saldo = new double [6][5];
		for(int i=0;i<saldo.length;i++){
			saldo[i][0]=10000;
			acumulado=10000;
			for(int j=1;j<saldo[i].length;j++){
				acumulado=acumulado+(acumulado*interes);
				saldo[i][j]=acumulado;
			}
			interes=interes+0.01;
		}
		for(int k=0;k<saldo.length;k++){
		for(int n=0;n<saldo[k].length;n++){
			 System.out.print(saldo[k][n] + "  \t  ");
		}
			System.out.println("");
		}
	}
}

