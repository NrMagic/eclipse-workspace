package cpf;

import java.util.Scanner;

public class CPF {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int num1=0,num10=0,num11=0 , resultado=0, digito10=0, digito11=0,vld1=0, vld2=0;
		int mult=10, mult2=11, resultado2=0;

		int aux1=0, aux2=1;
		String cpf="";
		System.out.println("Digite o CPF:");
		cpf=input.nextLine();
		for( mult=10; mult>=2; mult-- ) {
			
		num1 += mult * Integer.parseInt(cpf. substring(aux1,aux2));
		num10 =Integer.parseInt(cpf. substring(9,10));
		num11 =Integer.parseInt(cpf. substring(10,11));
		aux2++;
		aux1++;
		vld1=num1%11;

		}
		if(vld1>2) {
		 digito10=vld1*0;
		 aux1=0;
		 aux2=1;
					for(mult2=11; mult2>=2; mult2--) {
					vld2 += mult2 * Integer.parseInt(cpf. substring(aux1,aux2)); 
					resultado2=11-(vld2%11);
					aux1++;
					aux2++;
					digito11=resultado2;
				}

				if(digito11==num11) {
					System.out.printf("\nO CPF %s é valido!",cpf);
				}else {
				System.out.println("O CPF é invalido!");		
					}
					}
		else if(vld1<=2){
		digito10=11-resultado;
		if(digito10==num10) {
		aux1=0;
		aux2=1;

				for(mult2=11; mult2>=2; mult2--) {
					vld2 += mult2 * Integer.parseInt(cpf. substring(aux1,aux2)); 
					digito11=11-(vld2%11);
					aux1++;
					aux2++;
				System.out.println(vld2);		

				}

				 if(digito11==num11) {
					System.out.printf("\nO CPF %s é valido!",cpf);
				}else {
				System.out.println("O CPF é invalido!");		
					}
				input.close();
		}
		}
		}
	}


