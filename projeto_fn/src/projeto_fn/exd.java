package projeto_fn;

import java.util.Scanner;

public class exd {

	public static void main(String[] args) {
		int i=0, j=0;
		int[][] Va =new int[3][5];
		int[][] Vb = new int[3][5];
		int[] Vc= new int[20];
		Scanner valor= new Scanner(System.in);
		
		System.out.println("Informe 20 valores");

		System.out.printf("Digite os valor dos vetores:\n");
		for(i=0;i<3;i++) {
			for(j=0;j<5;j++) {
		System.out.printf("Va%d= ",j+1);
		Va[i][j]=valor.nextInt();	
		Vb[i][j]=Va[i][j]*Va[i][j];
		}}
		System.out.printf("\nOs valores de Vc\n");
		for(i=0;i<3;i++) {
			for(j=0;j<5;j++) {
				System.out.println(Vb[i][j]);
		if(i<2) {
			System.out.println();
		}
		}
		}
	}

}
