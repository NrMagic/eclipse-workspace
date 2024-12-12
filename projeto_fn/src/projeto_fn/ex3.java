package projeto_fn;

import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {
		int i=0, j=0;
		int[][] Va =new int[2][5];
		int[][] Vb = new int[2][5];
		int[] Vc= new int[20];
		Scanner valor= new Scanner(System.in);
		
		System.out.println("Informe 20 valores");

		System.out.printf("Digite os valor dos vetores:\n");
		for(i=0;i<2;i++) {j=0;
			for(j=0;j<5;j++) {
		System.out.printf("Va%d= ",j+1);
		Va[i][j]=valor.nextInt();	
		System.out.printf("Vb%d= ",j+1);
		Vb[i][j]=valor.nextInt();
		Vc[i]=Va[i][j]-Vb[i][j];
		}}
		System.out.printf("\nOs valores de Vc\n");
		for(i=0;i<2;i++) {
			for(j=0;j<5;j++) {

		System.out.printf("Vc%d = Va[%d].[%d] %d - Vb[%d].[%d] %d",Vc[i],j+1,i+1, Va[i][j], j+1,i+1, Vb[i][j]); 	
		if(i<2) {
			System.out.println();
		}
		}
		}
		}
	}


