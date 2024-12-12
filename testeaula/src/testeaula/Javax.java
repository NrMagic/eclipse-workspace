package testeaula;
import javax.swing.JOptionPane;
public class Javax {

	public static void main(String[] args) {
	String Name, Subname, aux;
	int idade=0;
	
	
	
	
	
	
	//input and question
		Name = JOptionPane.showInputDialog("Whats or name? ");
		Subname = JOptionPane.showInputDialog("Whats or  Subname? ");
		//input age
		aux=JOptionPane.showInputDialog("Whats or age?");
		//conversation
		idade=Integer.parseInt(aux);

		
		if(idade>=16) {
			//answer 
			JOptionPane.showMessageDialog(null, Name + " " + Subname + " Your age " + idade + " go to work",  " ", JOptionPane.PLAIN_MESSAGE);

		}
		
		
		else {
		
		//output message
		JOptionPane.showMessageDialog(null, Name + " " + Subname + " Your age " + idade + "  go schoool",  " " , JOptionPane.PLAIN_MESSAGE);
	
		
		
	}
	}
}
