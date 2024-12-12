package testeaula;
import java.util.*;
public class Aula0909 {

	public static void main(String[] args) {
		Scanner Valor = new Scanner(System.in);
		Double a, b, c, mg, r;
		System.out.println("Digite o 1° Número: ");
		a=Valor.nextDouble();
		System.out.println("\nDigite o 2° Número: ");
		b=Valor.nextDouble();
		System.out.println("\nDigite o 3° Número: ");
		c=Valor.nextDouble();
		
		r =(a+b+c)/3;
		
		mg=Math.pow(a*b*c, 1.0/3.0);
		
		System.out.printf("\nAmedia é: %.2f", r);
		System.out.printf("\nAmedia geométrica é: %.2f", mg);
		Valor.close();
		
		
		
	}

}
