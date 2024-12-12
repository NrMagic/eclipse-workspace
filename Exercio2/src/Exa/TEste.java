package Exa;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.List;


public class TEste {

	public static void main(String[] args) {


Scanner texto = new Scanner(System.in);
		double a,b,c;
		

		System.out.println("Qual e o valor de A?");
		a=texto.nextDouble();
		
		System.out.println("Qual e o valor de B?");
		b=texto.nextDouble();
		
		System.out.println("Qual e o valor de C?");
		c=texto.nextDouble();
		

		List<Double> lista=Arrays.asList(a,b,c);
		Collections.sort(lista);
		System.out.printf("%s\n", lista);

		
	}

}
