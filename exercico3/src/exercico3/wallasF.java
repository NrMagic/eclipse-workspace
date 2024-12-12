package exercico3;

public class wallasF {

	public static void main(String[] args) {
		int v1=0, v2=200;
		for(v1=0;v1<=v2;v1+=4) {
			System.out.printf("+"+v1);

			if(v1%30==10) {
				System.out.println();
			}
		}
	}

}
