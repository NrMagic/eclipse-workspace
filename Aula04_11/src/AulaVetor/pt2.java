package AulaVetor;
import java.util.*;
public class pt2 {

	public static void main(String[] args) {
Scanner vlr =new Scanner(System.in);
int[]v1= new int[5];
int[]v2= new int[5];
int[]v2a= new int[5];
int[]v2b= new int[5];
int[]v3= new int[5];
int i, vf, vf2;
System.out.println("Digite o valor Fatorial:");
vf=vlr.nextInt();
vf2=vf;

for(i=0;i<5;i++) {
System.out.println("Digite o valor Quadrado:");
v1[i]=vlr.nextInt();


//Processamento.
v2a[i]=vf*vf2;
v2b[i]=v1[i]*10;
v2[i]=(int)Math.pow(v1[i],2);
vf2--;
}


// Impressão
for(i=0;i<5;i++) {
System.out.printf("\nResult:v2[%d]=%d",i,v2[i]);
System.out.printf("\tResult:v2a[%d]=%d",i,v2a[i]);
System.out.printf("\tResult:v2b[%d]=%d",i,v2b[i]);

}

vlr.close();
	}

}
