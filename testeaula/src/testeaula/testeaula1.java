package testeaula;

import java.util.Scanner;

public class testeaula1 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner (System.in);
		
		int a, b, a1, a2, a3, a4, a5;
		int result1, result2, result3, result4, result5;
		
		System.out.print("Qual e o valor do primeiro produto?\n");
		a=ler.nextInt();
		

		System.out.print("Qual e o valor do segundo produto?\n");
		b=ler.nextInt();
		a1=a;
		a2=a;
		a3=a;
		a4=a;
		a5=a;
		result1= a1+=b;
		result2= a2-=b;
		result3= a3*=b;
		result4= a4/=b;
		result5= a5%=b;
		
		System.out.printf("Os valores encontrados foram \na+=b %d\na-=b %d\na*=b %d\na/=b %d \n rest a=b  %d", result1, result2, result3, result4, result5 );
		

	}

}
