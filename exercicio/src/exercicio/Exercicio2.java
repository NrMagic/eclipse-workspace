package exercicio;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		double o, c, f;
		int i = 1;
		double r, a, v;
		String name;
		double vel, tempo, distancia, ltsgasto;
		double result, tempoTx, valor, taxa;
		
		 
		
		
		System.out.println("Qual é o seu nome?");
		name = ler.nextLine(); 
		
		
		System.out.printf("%s Olá, seja bem vindo!\n\n",name);
	
		do { do {	
		System.out.println("\n\n\nEscolha uma das opções a serem realizadas?");
		System.out.println("\n1) C° em F°\n\n2) F° em C°\n\n3) Vol²\n\n4) Velocidade\n\n5) Taxa\n\n6) Sair");
		
		o = ler.nextInt();
		
		
	
			
			
	
		if(o==1)//calculo em Celcius em fahrenheit
		{	System.out.printf("Qual é o valor em Celsius?");
			
			c = ler.nextDouble();
			
			
			f= ((c*9)/5)+32;
			
			System.out.printf("O valor encontrado foi de: %d",f);
			
		}
			else if(o==2)// Fahrenheit para Celcius
			{	System.out.printf("Qual é o valor em Fahrenheit?");
			
			f = ler.nextDouble();
			
			
			c= ((f-32)*5)/9;
			
			System.out.printf("O valor encontrado foi de: %d",c);
			}
					else if(o==3)//Calculo de volume cubico 
					{	
					System.out.printf("Qual é a altura do produto?\n");
				
				a = ler.nextDouble();
				
		
				System.out.printf("Qual é o raio do produto?\n");
			
				r = ler.nextDouble();
			
				
				v = (Math.PI*(r*r))*a;
				
				System.out.printf("O valor encontrado foi de: " + new DecimalFormat (".##").format(v));
				}
					else if(o==4)//calculo do gasto
					{	
						System.out.printf("Qual é velocidade media do trajeto em km/h?\n");
					
						vel = ler.nextDouble();
					
						System.out.printf("Qual foi o tempo gasto no trajeto em minuto?\n");
					
						tempo = ler.nextDouble();
					
						distancia = tempo*(vel/60);
					
						ltsgasto = distancia/12;
					
						System.out.printf("O gasto de combustivel foi de, %.3f ltrs em %.0f Kilometros\n\n", ltsgasto, distancia);
					
						System.out.printf("Os dados são resultados dos valores dados,\nTempo %.0f minutos \nVel %.0f Km/h", tempo,  vel);	
					}
					else if(o==5)//calculo da taxa
					{	
									System.out.printf("Qual é o valor de emprestimo?\n");
					
								valor = ler.nextDouble();
					
									System.out.printf("Qual é a taxa a ser cobrada?\n");
					
								taxa = ler.nextDouble();
					
									System.out.printf("Quantos meses de prazo?\n");
					
								tempoTx = ler.nextDouble();
								
								
						result= valor+(valor*(taxa/100)*tempoTx);
						
						
									System.out.printf("O valor a ser pago e de %.2f", result);
					}
		
					else if(o==6) { System.exit(i);}
		
		
	
		
		
	}while(o<=6||o>0);
		
	 
			
	System.out.println("\033[91mPor favor escolha uma opção valida!\033[0m");
		
		
		}while(o>=7&&o<=0);
			
				
				

				
		}
		}
			
		

