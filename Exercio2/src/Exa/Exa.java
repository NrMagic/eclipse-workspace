package Exa;
import java.util.Scanner;
public class Exa {

	public static void main(String[] args) {
		Scanner texto = new Scanner(System.in); 
		Scanner real = new Scanner(System.in);
		
		double a, b, r;

		System.out.println("Qual e o valor da primeria varialvel?");
		a=real.nextDouble();
		
		
		System.out.println("\nQual e o valor da Segunda varialvel?");
		b=real.nextDouble();
		
		if(a<=b) 
		{
			r=b-a;
			System.out.printf("\nO valor de diferença entre ambos e de %.2f!",r);

		
		}else {
			r=a-b;
			System.out.printf("\nO valor de diferença entre ambos e de %.2f!",r);

			
			  }
		
		
}
}
