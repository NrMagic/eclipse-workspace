package projeto_fn;
import java.util.*;

public class Ex1 {

	public static void main(String[] args) {
int i=0;
Scanner nome= new Scanner(System.in);
String[] nomes =new String[10];
System.out.println("Informe 10 nomes!");
for(i=0;i<10;i++) {
System.out.printf("Digite o nome da #%d pessoa:",i+1);
nomes[i]=nome.nextLine();	
}
System.out.printf("\nOs 10 nomes fornecidos foram:\n");
for(i=0;i<10;i++) {
System.out.printf("%d. %s",i+1, nomes[i]); 	
if(i<10) {
	System.out.println();
}
}
nome.close();		
		
		
		
	}

}
