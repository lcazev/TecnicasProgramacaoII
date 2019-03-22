package aula0;

public class mdc_Recursivo {

	public static int maiorParaMenor(int x, int y) {
		if(x<y) {
			return encontraMdc(y,x);
		} 
		return encontraMdc(x,y);
	}
	public static int encontraMdc(int a, int b) {
		if(b == 0) {
			return a;
		} else if(a%b == 0) {
			return b;
			}
		return encontraMdc(b, (a%b));
	}
	public static void main(String[] args) {
		System.out.println(maiorParaMenor(5,1));
	}

}
