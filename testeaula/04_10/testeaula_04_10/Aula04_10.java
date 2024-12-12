package testeaula_04_10;
import java.util.*;
public class Aula04_10 {

	public static void main(String[] args) {

	    Scanner x = new Scanner(System.in);
	    System.out.println("Digite a quantidade de termos");
	    int vezes = x.nextInt();
	    int qtd = 2;
	    int n1 = 0;
	    int n2 = 1;
	    System.out.print("0 ");
	    System.out.print("1 ");
	    while (qtd < vezes) {
	        System.out.print((n1+n2) + " ");
	        int n3 = n1+n2;
	        n1 = n2;
	        n2 = n3;
	        qtd++;
	    }
	    System.out.println("Fim");
	}

	

}
