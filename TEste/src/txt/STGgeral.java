package txt;
import java.util.Scanner;

public class STGgeral {

 
	
	public static void main(String[] args) {
Scanner sc =new Scanner (System.in);
String[][][][][][][]geral=new String[2][2][2][5][5][4][2];
int i=0,j=0,k=0,l=0;

for(i=0;i<1;i++) {
	System.out.println("Qual e o nome da Turma: ");
	geral[1][0][0][0][0][0][0]=sc.nextLine();
	System.out.println("\nQual é o nome do Curso: ");
	geral[1][1][0][0][0][0][0]=sc.nextLine();
	System.out.println("\nQual é o nome do professor: ");
	geral[1][1][1][0][0][0][0]=sc.nextLine();
	for(j=0;j<5;j++) {
		System.out.printf("\nQual são os nomes dos alunos[%d]: ",j+1);
		geral[1][1][1][j][0][0][0]=sc.nextLine();
		}}
for(k=0;k<5;k++) {
	for(l=0;l<4;l++) {
		System.out.printf("\nQuais são as notas do aluno %s: ",geral[1][1][1][j][0][0][0]);
		geral[1][1][1][j][k][0][0]=sc.nextLine();
}}
	}

}
