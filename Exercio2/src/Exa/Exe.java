package Exa;
import java.util.Scanner;

public class Exe {

	public static void main(String[] args) {

Scanner real = new Scanner(System.in);
		
		double a, b, c;

		System.out.println("Qual e o valor de A?");
		a=real.nextDouble();
		
		System.out.println("Qual e o valor B?");
		b=real.nextDouble();
		
		System.out.println("Qual e o valor C");
		c=real.nextDouble();
		
		if (a<b&&a<c) {
			
						if(c<b) {
							System.out.printf("%.0f\n%.0f\n%.0f\n",a ,c, b);
			
								}
						
								else {
								
								System.out.printf("%.0f\n%.0f\n%.0f\n",a ,b, c);
								
								}
						}
			
			else if (b<a&&b<c) {
				
				
						if(c<a) {
								System.out.printf("%.0f\n%.0f\n%.0f\n",b ,c, a);
							
								}
						
								else {
								
									System.out.printf("%.0f\n%.0f\n%.0f\n",b, a, c);
									}
								
								}
					else if (c<a&&c<b) {
				
				
							if(a<b) {
								System.out.printf("%.0f\n%.0f\n%.0f\n",c ,a, b);

									}
				
							else {
				
									System.out.printf("%.0f\n%.0f\n%.0f\n",c ,b, a);
									}
										}
}
}	