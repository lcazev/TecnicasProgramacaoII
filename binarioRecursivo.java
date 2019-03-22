package aula0;

public class binarioRecursivo {
	public static String retornaBinario (int n) {
		if(n==0) {
			return "0";
		}
		else if (n == 1) {
			return "1";
		} return retornaBinario(Math.floorDiv(n, 2)) + (n%2);
	}
	public static void main(String[] args) {
		System.out.println(retornaBinario(15));
	}

}
