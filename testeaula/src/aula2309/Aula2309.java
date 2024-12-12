package aula2309;
import javax.swing.JOptionPane;

public class Aula2309 {

	public static void main(String[] args) {
	
		
		
		String[] dia_da_semana= {"Segunda-feira","Terça-feira","Quarta-feira","Quinta-feira","Sexta-feira","Sabado","Domingo"};
		String[] dia_util= {"Segunda-feira","Terça-feira","Quarta-feira","Quinta-feira","Sexta-feira"};
		String[] fim_de_semana= {"Sabado","Domingo"};
		
		
		String input =(String) JOptionPane.showInputDialog(null, "Escolha uma opção?","Bem vindo ao meu mundo", JOptionPane.PLAIN_MESSAGE,null, dia_da_semana,dia_da_semana[0]);
		
		if (input.equals(dia_util[0])||input.equals(dia_util[1])||input.equals(dia_util[2])||input.equals(dia_util[3])||input.equals(dia_util[4])){
			
			JOptionPane.showInternalMessageDialog(null,input, "O dia da semana"+ " informado é dia ultil", -1);
			
				}if (input.equals(fim_de_semana[0])||input.equals(fim_de_semana[1])){
						
						JOptionPane.showInternalMessageDialog(null,input, "O dia"+ " informado é Final de semana", -1);
				
				}

	}

}
 