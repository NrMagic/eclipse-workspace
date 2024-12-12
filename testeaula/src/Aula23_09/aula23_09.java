package Aula23_09;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class aula23_09 {

	public static void main(String[] args) {
		String[] ano= {"1974","1975","1976","1977","1978","1979","1980","1981","1982","1983","1984","1985","1986","1987","1987","1989","1990","1991","1992","1993","1994","1995","1996","1997","1998","1999","2000","2024"};
		String[] mes= {"Janeiro","Fevereio","Março","Abril","Maio","Junho","Julho","Agosto","Setembro","Outubro","Novembro","Dezembro"};
		String[] dia= {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};

	    JComboBox jdia = new JComboBox(dia);
	    JComboBox jmes = new JComboBox(mes);
	    JComboBox jano = new JComboBox(ano);
	    
	    JOptionPane.showConfirmDialog(null,jdia,"dia",JOptionPane.PLAIN_MESSAGE);
	    JOptionPane.showConfirmDialog(null, jmes,"mes",JOptionPane.PLAIN_MESSAGE);
	    JOptionPane.showConfirmDialog(null, jano,"ano",JOptionPane.PLAIN_MESSAGE);

	    
	      jdia.setEditable(true);
	      jmes.setEditable(true);
	      jano.setEditable(true);
	      
	      
	      String resd=(String) jdia.getSelectedItem();
	      String resm=(String) jmes.getSelectedItem();
	      String resy=(String) jano.getSelectedItem();
}
	
}