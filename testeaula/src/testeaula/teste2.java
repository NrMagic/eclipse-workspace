package testeaula;
import java.util.Scanner;
public class teste2 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	Scanner texto = new Scanner(System.in);
	double n1, n2, r;
	String opc ="" ;
	
	while(!opc.equals("AULA"))	{
	
	
	System.out.printf("\nQual sera a operação a ser realizada?\n");
	System.out.println("1)+=Somar\n2)-=subritrair\n3)*=Multiplicar\n4)/=Divisão\n5)% resto da divisão\n6)Exit\n");
	opc=texto.nextLine();


	
		if(opc.equals("+")||opc.equals("Somar")||opc.equals("1")) 
		{
		System.out.print("Qual e o número\n");
		n1=sc.nextDouble();
		
		System.out.print("Qual e o número\n");
		n2=sc.nextDouble();
		
	
		r=n1+n2;
		
		System.out.printf("\nO valor encontrado foi de: %.2f\n",r);
		
		}
	
	
			else if(opc.equals("-")||opc.equals("Subitração")||opc.equals("2")) 
			{
				System.out.print("Qual e o número\n");
				n1=sc.nextDouble();
				
				System.out.print("Qual e o número\n");
				n2=sc.nextDouble();
				
			
				r=n1-n2;
				
				System.out.printf("\nO valor encontrado foi de: %.2f\n",r);
				
		
			}
					else if(opc.equals("*")||opc.equals("Multiplição")||opc.equals("3")) 
					{
						System.out.print("Qual e o número\n");
						n1=sc.nextDouble();
						
						System.out.print("Qual e o número\n");
						n2=sc.nextDouble();
						
					
						r=n1*n2;
						
						System.out.printf("\nO valor encontrado foi de: %.2f\n",r);
				
					}
							else if(opc.equals("/")||opc.equals("Divisão")||opc.equals("4")) 
							{
								System.out.print("Qual e o número\n");
								n1=sc.nextDouble();
								
								System.out.print("Qual e o número\n");
								n2=sc.nextDouble();
								
							
								r=n1/n2;
								
								System.out.printf("\nO valor encontrado foi de: %.2f\n",r);
						
							}		else if(opc.equals("%")||opc.equals("resto da divisão")||opc.equals("resto")||opc.equals("5")) 
										{
											System.out.print("Qual e o número\n");
											n1=sc.nextDouble();
											
											System.out.print("Qual e o número\n");
											n2=sc.nextDouble();
											
											
											r=n1%=n2;
											
											
											
											System.out.printf("\nO valor encontrado foi de: %.2f\n",r);
									
										}
		
							else if(opc.equals("exit")||!opc.equals("EXIT")||opc.equals("6")) 
							{
		
								 System.exit(1);
		
		
		
							}
							else {System.out.println("\033[91mPor favor escolha uma opção valida!\033[0m");}
	
	  		}	
	
	
	}
}