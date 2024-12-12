package projeto_fn;

import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		int i=0,V1=0,V2=0;
		int[] Vb = new int[8];
		Scanner valor= new Scanner(System.in);
		int[] Va =new int[8];
		System.out.println("Informe 8 valores");
		for(i=0;i<8;i++) {
		System.out.printf("Digite o %d valor:",i+1);
		Va[i]=valor.nextInt();	
		Vb[i]=Va[i]*3;
		}
		System.out.printf("\nOs valores de Va e de Vb são:\n");
		for(i=0;i<8;i++) {
			
		System.out.printf("Va%d. %d Vb%d. %d",i+1, Va[i], i+1, Vb[i]); 	
		if(i<10) {
			System.out.println();
		}
		}
		valor.close();
	}

}
