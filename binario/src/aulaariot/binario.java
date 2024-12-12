package aulaariot;
import java.util.*;
import java.io.*;
public class binario {

	public static void main(String[] args) {
		String entrada,opc;
		String binario="";
		String hexaS="";
		String octal="";
		String decimalS="";
		Scanner escolha = new Scanner (System.in);
		Scanner escolhaI = new Scanner(System.in);
		double potencia =0;
		double decimalD =0;
		int decimalI =0;
		int hexaI =0;
		
		
		
		System.out.println("Escolha a converção:\n1)Binario\n2)Decimal\n3)Hexadecimal\n4)Octal");
		opc=escolha.next();
		
		if(opc.equals("Binario")||opc.equals("BINARIO")||opc.equals("binario")||opc.equals("1")) {
	
		System.out.println("Digite o valor:");	
			
		Scanner leitor = new Scanner (System.in);
		entrada=leitor.next();

		for(int i=entrada.length()-1; i>=0;i--) {
			decimalI+=Math.pow(2,potencia ) * Character.getNumericValue(entrada.charAt(i));
			potencia++;
			hexaS = Integer.toHexString(decimalI);	
			octal = Integer.toOctalString(decimalI);	

		}
		System.out.printf("Decimal:%d \nHexa:%s \nOctal:%s",decimalI ,hexaS, octal); 
		}else if(opc.equals("Decimal")||opc.equals("decimal")||opc.equals("DECIMAL")||opc.equals("2")) {
			

			System.out.println("Digite o valor:");	
				
			Scanner leitor = new Scanner (System.in);
			int decimal1=leitor.nextInt();
			

				binario=Integer.toBinaryString(decimal1);
				hexaS = Integer.toHexString(decimal1);	
				octal = Integer.toOctalString(decimal1);	
				System.out.printf("Binario:%s \nHexa:%s \nOctal:%s",binario ,hexaS, octal); 

				
			}
		
			else if(opc.equals("Hexadecimal")||opc.equals("hexadecimal")||opc.equals("HEXADECIMAL")||opc.equals("3")) {
				
				
				System.out.println("Digite o valor:");	
				entrada=escolha.next();

					decimalI=Integer.parseInt(entrada,16);
					octal = Integer.toOctalString(decimalI);
					binario=Integer.toBinaryString(decimalI);
					System.out.println("Binario:" + binario + " \nDecimal:" + decimalI + "\nOctal:" + octal); 
					}		
			else if(opc.equals("Octaldecimal")||opc.equals("octaldecimal")||opc.equals("OCTALDECIMAL")||opc.equals("4")) {
				
				
				System.out.println("Digite o valor:");	
				entrada=escolha.next();

					decimalI=Integer.parseInt(entrada,8);
					hexaS = Integer.toHexString(decimalI);
					binario=Integer.toBinaryString(decimalI);
					System.out.println("Binario:" + binario + " \nDecimal:" + decimalI + "\nHexa:" + hexaS); 
					}
}
					
}