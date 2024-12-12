package exercico3;
import java.util.*;
public class wallasB {

	public static void main(String[] args) {
Scanner vlr = new Scanner (System.in);
int v1=0, v2=0, v3=0, resp=1;
while(resp>=1) {
System.out.println("Digite o valor para mutiplicar:");
v1=vlr.nextInt();
System.out.println("Digite o valor para mutiplicador:");
v2=vlr.nextInt();
	v3=v1*v2;
	System.out.printf("Resultado:%d x %d = %d",v1,v2,v3);
	System.out.println("\nQuer fazer outro calculo? \nCaso não digite 0");	
	resp=vlr.nextInt();
}

vlr.close();}
}
