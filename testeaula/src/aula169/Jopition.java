package aula169;
import java.util.*;
import javax.swing.JOptionPane;

public class Jopition {

	public static void main(String[] args) {
		Scanner texto=new Scanner(System.in);
		Scanner valor=new Scanner(System.in);
		
		String name="";
		String peso="";
		String altura="";
		String SIMC="";
		double IMC;
		name=JOptionPane.showInputDialog(null,"Qual é o seu nome",name,-1);
		altura=JOptionPane.showInputDialog(null,"Qual é o sua altura",altura,-1);
		peso=JOptionPane.showInputDialog(null,"Qual é o seu peso",peso,-1);
		
		double Daltura = Double.valueOf(altura).doubleValue();
		double Dpeso = Double.valueOf(peso).doubleValue();
		
		IMC=Dpeso/Math.pow(Daltura, 2);
		
		SIMC=String.valueOf(IMC);
		
		
		if (IMC>=40) {
			JOptionPane.showInternalMessageDialog(null,String.format("%.5s",SIMC),"Voce se encontra com obesidade do 3°",-1);
		}else if(IMC>=35&&IMC<=39.9) {
			JOptionPane.showInternalMessageDialog(null,String.format("%.5s",SIMC),"Voce se encontra com obseidade do 2°",-1);
		}else if(IMC>=30&&IMC<=34.9) {
			JOptionPane.showInternalMessageDialog(null,String.format("%.5s",SIMC),"Voce se encontra com obesidade do 1°",-1);
		}else if(IMC>=25&&IMC<=29.9) {
			JOptionPane.showInternalMessageDialog(null,String.format("%.5s",SIMC),"Voce se encontra proximo da obesidade",-1);
		}else if(IMC>=18.5&&IMC<=24.9) {
			JOptionPane.showInternalMessageDialog(null,String.format("%.5s",SIMC),"Voce se encontra saudavel",-1);
		}else if(IMC<=18.4) {
			JOptionPane.showInternalMessageDialog(null,String.format("%.5s",SIMC),"Voce se encontra com magreza",-1);
		}else {
		}

		System.out.println("\n\nObrigado por utilizar nossos sistemas");

		
	}

}
