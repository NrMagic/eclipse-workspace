package aula30_09;
import java.util.*;

public class AulaFor {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
	double volta, vezes, opc; 
	int aux=0;	
	int i;	
		System.out.println("Quantas voltas, serão dadas?:");
		volta=leitor.nextDouble();
		vezes=0;
		
		for(i=1;i<=volta;i++) {
			for(vezes=1;vezes<=5;vezes++) {	
			aux++;	
			}
			}
		System.out.printf("As voltas foram:%.0f \nas abdominal foram:%d ",volta, aux);

	}
	}