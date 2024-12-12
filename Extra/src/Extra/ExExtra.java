package Extra;
import java.util.*;
public class ExExtra {

	public static void main(String[] args) {
		Scanner Nuber = new Scanner(System.in);
		double n1;
		System.out.println("Olá, Por gentileza insira o Valor!\nValor: ");
		n1=Nuber.nextDouble();
		
		if (n1%2==0)
		{
			
			
			if (n1%2>0)
			{
				System.out.printf("O valor é Negativo e Par %.2f", n1);
			}
			
			else {	
				System.out.printf("O valor é Positivo e Par %.2f", n1);
				}
			
			}
		else if(n1%2==1){
			
			System.out.printf("O valor é positivo e impar %.2f", n1);
			
		}
			
		else {
			
			System.out.printf("O valor é negativo e impar %.2f", n1);
			
		}
		
		
	}

}
