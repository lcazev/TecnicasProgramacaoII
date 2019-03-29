package aula0;

import java.util.Arrays;

public class operacoesTriangulopascal {
	
	
	//c) para as linhas 5, 10, 15 e 20:
	//gera o conteudo da linha (linhaPascal(n)no formato string (imprimeLinhaPascal(linha))
	//soma os elementos de cada linha (infosLinha(n)
	//verifica se a soma e potencia de 2(confrontando o resultado da soma com a funcao
	//potenciaDois(n)
	
	//a) gera o coeficiente binomial de um numero
	public static int coefBinomial (int n, int k) {
		if (n==k||k==0) {
			return 1;
		} else {
			return coefBinomial((n-1), (k-1)) + coefBinomial((n-1),k);
		}
	}
	
	//b) utilizando os coeficientes binomiais, monta uma linha n do triangulo
	//comecando pela linha 0 na forma de um array de inteiros 
	public static int[] linhaPascal (int n) {
		int[] linha = new int [n+1];
		for(int i=0; i<=n; i++) {
			 linha[i] = coefBinomial(n, i);
		}
		return linha;
	}
	
	//gera o conteudo de uma linha no formato string
	public static String imprimeLinhaPascal(int[] linha) { //converte o array linha em string para imprimir
	return Arrays.toString(linha);
	}
	
	//c) para as linhas 5, 10, 15 e 20
	//mostra a linha
	//imprime a soma dos elementos de tal linha
	//informa se a soma e uma potencia de 2.
	
	public static void infosLinha() {
		int n = 5;
		while(n%5==0&&n<=20) {//para as linhas 5, 10, 15 e 20
		int soma = somaLinha(linhaPascal(n));
		System.out.println("Linha: "+ imprimeLinhaPascal(linhaPascal(n)));
		System.out.println("Soma: " + soma);
		System.out.println("E potencia de 2? " + ePotencia(somaLinha(linhaPascal(n)), potenciaDois(n)));
		n=n+5;
		soma = 0;
		}
	}
	
	//soma os elementos de uma linha
	public static int somaLinha(int[] linha) {
		int soma = 0;
		for(int k=0;k<linha.length;k++) {
			soma += linha[k];//soma cada elemento de tal linha
		}
		return soma;
	}
	
	//checa se um numero e potencia de 2
	public static int potenciaDois(int m){// retorna 2 elevado a um numero m
		if(m==0)
			return 1;
		return 2*(potenciaDois(m-1));
	}

	//confronta a soma dos elementos da linha com a potencia de 2
	public static String ePotencia(int resultadoSoma, int resultadoPotencia) {
		if(resultadoSoma==resultadoPotencia) {
			return "Sim";
		} else {
			return "Nao";
		}
	}
	
	
	
	public static void main(String[] args) {
		System.out.println("Coeficiente binomial para n=4 e k=2: "+coefBinomial(4,2));//caso teste exercicio (a)
		System.out.println();
		System.out.println("Linha numero 5 do triangulo de Pascal: "+imprimeLinhaPascal(linhaPascal(5))); //caso teste exercicio (b)
		System.out.println();
		System.out.println("Informacoes sobre linhas 5, 10, 15 e 20:");
		infosLinha();//programa pedido em (c)
		
		

	}

}
