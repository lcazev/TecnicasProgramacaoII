package lista1;
import java.util.Scanner;
public class exercicio1a {
	
	public static double somaDeQuadrados(int n) {
		if(n==0) 
			return 0;
		double soma = somaDeQuadrados(n-1)+Math.pow(n, 2);
		return soma;
	}

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe o numero desejado");
		int num = entrada.nextInt();
		System.out.println("O resultado e: " + somaDeQuadrados(num));
	}

}
