package testebinario;
import java.util.*;

public class leituradebinario {

	public static void main(String[] args) {
		Scanner texto= new Scanner(System.in);
		Scanner valor1= new Scanner(System.in);
		Scanner valor2= new Scanner(System.in);
		Scanner valor3= new Scanner(System.in);
		Scanner valor4= new Scanner(System.in);
		Scanner valor5= new Scanner(System.in);
		Scanner valor6= new Scanner(System.in);
		Scanner valor7= new Scanner(System.in);
		Scanner valor8= new Scanner(System.in);

		
		
		
		String dados="";
		int Byte1, Byte2, Byte3 ,Byte4, Byte5, Byte6 ,Byte7, Byte8, resultado;
		System.out.println("Qaul o Transferencia gostaria de fazer ?\n1)Binario\n2)Decimal\n3)Hexa\n4)Octal");
		dados= texto.nextLine();
		
		if(dados.equals("Binario")||dados.equals("BINARIO")||dados.equals("1")||dados.equals("binario"))
		{
			System.out.printf("Qual e o valor em binario?");
			Byte1= valor1.nextInt();
			Byte2= valor2.nextInt();
			Byte3= valor3.nextInt();
			Byte4= valor4.nextInt();
			Byte5= valor5.nextInt();
			Byte6= valor6.nextInt();
			Byte7= valor7.nextInt();
			Byte8= valor8.nextInt();
			
			resultado=((Byte1*1)+(Byte2*2)+(Byte3*4)+(Byte5*8)+(Byte6*16)+(Byte7*32)+(Byte8*64));
			
			System.out.printf("Os valores foram %d, decimal",resultado);
			
			
		}
		else {
			
			
			
			System.out.println("fim de programa");
		}
		
		
	}

}
