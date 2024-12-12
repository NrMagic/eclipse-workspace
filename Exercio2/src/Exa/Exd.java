package Exa;

import java.util.Scanner;

public class Exd {

	public static void main(String[] args) {
Scanner real = new Scanner(System.in);
		
		double a, b, c, x1, x2, Delta;

		System.out.println("Qual e o valor de A?");
		a=real.nextDouble();
		
		System.out.println("Qual e o valor B?");
		b=real.nextDouble();
		
		System.out.println("Qual e o valor C");
		c=real.nextDouble();
		
		Delta=(b*b)-(4*(a*c));
		
		if (Delta>0){
			
			x1=(-b+Math.sqrt(Delta))/(2*a);
			
			x2=(-b-Math.sqrt(Delta))/(2*a);
			
		System.out.printf("Os valores encontrados foram x1= %.2f x2= %.2f para cada raiz", x1, x2);	
			
					}
		
		
		else if (Delta==0){
			
			x1=(-b+Math.sqrt(Delta))/(2*a);
		
			
		System.out.printf("Os valores encontrados foram iguais devido ao Delta ser igual a zero raiz\n X= %.2f", x1);	
			
					}
		
		
		else  { 
			
			System.out.printf("O valor de Delta é menor que 0 sem solução!");
			
		}

}}
