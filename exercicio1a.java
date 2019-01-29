package lista1;
import java.util.Scanner;
public class exercicio1a {
	
	public static double potencia(int b, int e) {
		if(e==0) 
			return 1;
		double pot = potencia(b, e-1)*b;
		return pot;
	}

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe a base:");
		int base = entrada.nextInt();
		System.out.println("Informe o expoente");
		int exp = entrada.nextInt();
		System.out.println(base+"^"+exp+" = " + potencia(base, exp));
	}

}
