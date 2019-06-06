package lista1;

public class fatorialRecursivo {

	public static int calculaFatorial(int n) {
		if(n<= 1) {
			return 1;
		}
		return calculaFatorial(n-1)*n;
	}
	public static void main(String[] args) {
		System.out.println(calculaFatorial(6));

	}

}
