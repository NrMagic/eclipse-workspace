package AulaVetor;
import java.util.*;

public class AulaVTop04_11 {

	public static void main(String[] args) {
int[]v2=new int[5];
int[]v3=new int[5];
int i;
//Entrada fixa
int v1[]= {1,2,3,4,5};
Scanner vlr = new Scanner(System.in);
//Entrada de dados
for(i=0; i<5; i++) {
	System.out.printf("V2[%d]:",i);
	v2[i]=vlr.nextInt();
					}
//Processamento: Soma de vetores
for(i=0; i<5; i++) {
	
	v3[i]=v2[i]+v1[i];
	
}for(i=0;i<5;i++) {
	
	
	System.out.printf("\nSoma[%d}=%d",i,v3[i]);
}


		
		
	}

}
