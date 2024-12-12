package teste_em_aula;
import java.util.*;
public class teste {

	public static void main(String[] args) {		
Scanner input=new Scanner(System.in);
int num1, num2, num3, num4, num5, num6, num7, num8, num9,num10,num11;
int mult=0;
String cpf="";
System.out.println("Digite o CPF:");
cpf=input.nextLine();
while(mult<1) {
num1 = Integer.parseInt(cpf. substring(0,1));
num2 = Integer.parseInt(cpf. substring(1,2));
num3 = Integer.parseInt(cpf. substring(2,3));
num4 = Integer.parseInt(cpf. substring(3,4));
num5 = Integer.parseInt(cpf. substring(4,5));
num6 = Integer.parseInt(cpf. substring(5,6));
num7 = Integer.parseInt(cpf. substring(6,7));
num8 = Integer.parseInt(cpf. substring(7,8));
num9 = Integer.parseInt(cpf. substring(8,9));
num10= Integer.parseInt(cpf. substring(9,10));
num11= Integer.parseInt(cpf. substring(10,11));

System.out.printf("resultado: %d\nresultado: %d\nresultado: %d\nresultado: %d\nresultado: %d\nresultado: %d\nresultado: %d\nresultado: %d\nresultado: %d\nresultado: %d\nresultado: %d",num1,num2,num3,num4,num5,num6,num7,num8,num9,num10,num11);
		mult++;
}


		
		
		
		
		
		
	}

}
