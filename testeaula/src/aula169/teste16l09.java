package aula169;
import java.util.*;
public class teste16l09 {

	public static void main(String[] args) {
Scanner texto=new Scanner(System.in);
Scanner leitor=new Scanner(System.in);
String name;
double peso, altura, IMC;

System.out.println("Ola como Voce se chama?");
name=texto.next();

System.out.printf("Ola, %s Vamos Calcular seu IMC!\n Por gentileza informe seu peso?",name);
peso=leitor.nextDouble();
System.out.println("\nAgora me informe sua altura?");
altura=leitor.nextDouble();
IMC=peso/(Math.pow(altura,2));
if (IMC>=40) {
	System.out.printf("Voce se encontra com obseidade do 3° IMC=%f",IMC);
}else if(IMC>=35&&IMC<=39.9) {
	System.out.printf("Voce se encontra com obseidade do 2° IMC=%f",IMC);
}else if(IMC>=30&&IMC<=34.9) {
	System.out.printf("Voce se encontra com obseidade do 1° IMC=%f",IMC);
}else if(IMC>=25&&IMC<=29.9) {
	System.out.printf("Voce se encontra com pré-obseidade IMC=%f",IMC);
}else if(IMC>=18.5&&IMC<=24.9) {
	System.out.printf("Voce se encontra saudável IMC=%f",IMC);
}else if(IMC<=18.4) {
	System.out.printf("Voce se encontra com magreza IMC=%f",IMC);
}else {
}

System.out.println("\n\nObrigado por utilizar nossos sistemas");

	}

}
