package exercico3;

public class wallasC {

	public static void main(String[] args) {
int v1=1, v2=0, v3=0;
for(v1=1;v1<=100;v1++) {
	System.out.printf(v1+"+");
	v2+=v1;
	if(v1%20==10) {
		System.out.println();
	}
}
	System.out.println("="+v2);}

}
