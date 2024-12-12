package exercico3;

public class wallasE {

	public static void main(String[] args) {
		int v1=1, v2=20, v3=0;
		for(v1=1;v1<=v2;v1+=2) {
			System.out.printf("+"+v1);
			v3+=v1;
			if(v1%5==0) {
				System.out.println();
			}
		}
			System.out.println("="+v3);
	}

}
