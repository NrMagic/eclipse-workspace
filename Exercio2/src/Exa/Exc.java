package Exa;
import java.util.Scanner;

public class Exc {

	public static void main(String[] args) {
		Scanner texto = new Scanner(System.in); 
		Scanner real = new Scanner(System.in);
		
		double a, b, c, d, r, nota, exame;

		System.out.println("Qual e o valor da primeria Nota?");
		a=real.nextDouble();
		
		
		System.out.println("Qual e o valor da Segunda Nota?");
		b=real.nextDouble();
		
		System.out.println("Qual e o valor da terceira Nota");
		c=real.nextDouble();
		
		
		System.out.println("Qual e o valor da quarta Nota?");
		d=real.nextDouble();
		
		r=a+b+c+d;
		nota=r/4;
		
		if(a>=7) 
		{
			System.out.printf("\033[92mParabens aprovado\033[0m");
		}else {
			
			System.out.printf("\nVoce não passou ficou de recuperação, vamos fazer um exame.\nQual e a nota do exame");
			exame=real.nextDouble();
			
			
			if(exame>=5) 
			{
				
				System.out.printf("\033[92mParabens aprovado\033[0m");

			
			}else {
				
				System.out.printf("\n\033[91mParabens nos vemos ano que vem!\033[0m");
				}
	}

}
}