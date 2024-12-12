package Aula;
import java.util.*;

public class AL21_10 {

	public static void main(String[] args) {
		Scanner text = new Scanner(System.in);
		Scanner valor= new Scanner(System.in);
		
		int num, contImpar, contPar, produto,soma;
		num=1;
		contPar=0;
		contImpar=0;
		produto=1;
		soma=0;
		System.out.println("Caso queira parar, digite 0");

		while(num!=0) {

			System.out.println("digite um número");
			num=valor.nextInt();
if(num>=0) {
				if(num%2==1){
				produto*=num;
				contImpar++;
				}	
					else {
					soma+=num;
					contPar++;
					}
			}
		};
		System.out.printf("Total de ímpares: %d \nTOtal de Produto: %d",contImpar, produto);
		System.out.printf("\nTotal de pares: %d \nTotal de soma: %d",contPar, soma);

	}

}
