package Exa;
import java.util.Scanner;

public class Exb {

	public static void main(String[] args) {
		Scanner texto = new Scanner(System.in); 
		Scanner real = new Scanner(System.in);
		
		double a, r;

		System.out.println("Qual e o valor da primeria varialvel?");
		a=real.nextDouble();
	
		if(a<=0) 
		{
			r=a*(-1);
			System.out.printf("\nO valor é de %.0f positivo!",r);

		
		}else {
			r=a*1;
			System.out.printf("\nO valor é de %.0f positivo!",r);

			
			  }
	}

}
