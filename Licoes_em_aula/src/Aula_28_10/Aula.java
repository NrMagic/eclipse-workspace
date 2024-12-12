package Aula_28_10;

public class Aula {

	public static void main(String[] args) {
int[]digitos =new int[12];
int cpf=1234567890, i=11, soma=0, peso=10;
	for(i=11; i>=0; i--) {
		digitos[i]=(int)(cpf%10);
		cpf/=10;
	for(i=0;i<=11;i++) {
		System.out.println(digitos[i]+" ");
	}
	
	soma=0;
	peso=10;
	for(i=0;i<9;i++) {
		soma+=digitos[i]*peso;
		peso--;
	}
	int digito1=11-(soma%11);
	if(digito1>=10) {
		digito1=0;
	}
	soma=0;
	peso=11;
	for(i=0;i<10;i++) {
		soma+=digitos[i]*peso;
		peso--;
	}
	int digito2=11-(soma%11);
	if(digito2>=10) {
		digito2=0;
	}
	}
	}
	}

