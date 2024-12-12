package exercico3;

public class wallasD {
		
	public static void main(String[] args) {
		int v1=2, v2=500, v3=0;
		for(v1=2;v1<=v2;v1+=2) {
			System.out.printf(v1+"+");
			v3+=v1;
			if(v1%20==0) {
				System.out.println();
			}
		}
			System.out.println("="+v3);}
	}