package lista1;

public class somaInteirosRecursivo {
	public static int somaInteiros(int n) {
		if (n == 1) {
			return 1;
		}
		return somaInteiros(n - 1) + n;
	}

	public static void main(String[] args) {
		System.out.println(somaInteiros(9));
	}

}
