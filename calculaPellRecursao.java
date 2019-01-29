package lista1;
import java.util.Scanner;
public class exercicio1a {
	//Calcular o n-esimo numero de Pell (usando recursao)
	public static int calculaPell(int n){
		if(n==0)
			return n;
		if(n==1) 
			return 1;
		int pn = 2*(calculaPell(n-1)) + calculaPell(n-2) ;
		return pn;
	}

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Qual o numero de Pell que deseja encontrar?");
		int n = entrada.nextInt();
		System.out.println("O "+n+"o  numero de Pell é " + calculaPell(n));
	}

}
