package txt;
import java.util.*;


// _O nome da turma - Exemplo: 1DM;
// _O nome da Unidade Curricular - Exemplo: FPOO;
// _O nome do profesor que leciona esta Unidade Curricular;
// _5 nomes de alunos;
// _4 notas bimestrais (0 a 100);
// _O número de faltas (0 a 10).
public class test {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System .in);
		int  bimestre=5;
		String[] aluno= new String[5];
		int[][] notas= new int[5][bimestre];
		double[] presença=new double[5];
		String turma, materia, professor;
		int [] cont=new int[5];
		double [] media=new double[5];
		for(int i=0;i<5;i++) {
			
			System.out.printf("Qual é o nome do %d° Aluno: ",i+1);
			aluno[i]=sc.nextLine();
			
						}
		for(int i=0;i<1;i++) {
			
				System.out.printf("Qual é a turma:");
				turma=sc.nextLine();
				System.out.printf("Qual é a materia:");
				materia=sc.nextLine();
				System.out.printf("Qual é o(a) professor(a):");
				professor=sc.nextLine();
			
						}
				for(int i=0;i<bimestre;i++) {
				 while(true){
					System.out.printf("\nOBS.: As presenças devem ser de 0 a 10\nQuais são as faltas do aluno %s: ",aluno[i]);
					
					if(sc.hasNextDouble()) {	
					presença[i]=sc.nextDouble();
						if (presença[i]>=0&&presença[i]<=10) {
							break;
						}else {
	                        System.out.println("Erro: A presença deve estar entre 0 e 10. Tente novamente.");
	                    }
						}else {
	                        System.out.println("Erro: Entrada inválida. Por favor, digite um número válido.");
	                        sc.next();
	                    }
				
				}
				}
				for(int i=0;i<5;i++) {
					for(int j=0;j<4;j++) {
						while(true) {
					
						System.out.printf("OBS.: Notas devem ser de 0 a 100 \nQuais são as notas do %d° Bimestre  aluno(a) %s :",j+1 ,aluno[i]);
					if(sc.hasNextInt()) {
						notas[i][j]=sc.nextInt();
					cont[i]+=notas[i][j];
					if(notas[i][j]>=0&&notas[i][j]<=100) {
						break;
					}else {
                        System.out.println("Erro: A nota deve estar entre 0 e 100. Tente novamente.");

					}
					}else {
                        System.out.println("Erro: Entrada inválida. Por favor, digite um número válido.");
                        sc.next();	
					}
						}}}
				
				for(int i=0;i<5;i++) {
				media[i]=cont[i]/4;						
				}
				for(int i=0;i<5;i++) {
				double n=media[i];
				double p=presença[i];
					if (n>=70&&p<=2) {
						System.out.printf("\n%s\nMedia: %.2f\nAprovado",aluno[i], media[i] );
					}if(n>=50&&n<=70||p>2) {
						System.out.printf("\n%s\nMedia: %.2f\nRecuperação",aluno[i], media[i] );
							
					}if(n<50&&p>=10) {
						System.out.printf("\n%s\nMedia: %.2f\nReprovado",aluno[i], media[i] );
						
					}
					
					
					}
				
				
	}

}