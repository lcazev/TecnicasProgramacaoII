package aula0;

public class Grey {

	public static String grey(double nBits, double nDecimal) {
		if(nBits==1 && nDecimal==0)
			return "0";
		if(nBits==1 && nDecimal == 1)
			return "1";
		//casos base
		if(nDecimal<Math.pow(2, (nBits-1)))
			return grey(1,0) + grey(nBits-1, nDecimal);
			//ordenando todos os numeros que podem ser escritos com nBits
			//se nDecimal está na primeira metade dos numeros ordenados
			//acrescentar 0 à esquerda de grey(nBits-1, nDecimal)
		
		if(Math.pow(2, nBits-1)<=nDecimal && Math.pow(2, nBits)> nDecimal) 
			return grey(1,1)+ (grey(nBits-1, (Math.pow(2, nBits)-1-nDecimal))).toString();
			//se nDecimal esta na segunda metade dos numeros ordenados
			//este nao possui representacao com nBits-1
			//dessa forma, utilizamos o espelho de nDecimal na primeira metade
			//para encontrar o espelho:
			//observa-se que distancia de nDecimal ate (2^nBits)-1
			//e igual a distancia de 0 ate (2^nBits)-1-nDecimal
			//feito isso, adicionamos 1 à esquerda de grey(nBits-1, "espelho")
		return null;
			
	}
	
	public static String codigoGrey(double entradaDecimal) {
		return grey(numeroBits(entradaDecimal), entradaDecimal);
	}
	
	
	public static double numeroBits(double k) {
		//com n bits consigo escrever 2^n numeros,
		// que vao de 0 ate (2^n)-1
		int nBits = 1;
		while(Math.floor(k/2)>= 1) {
			k = Math.floor(k/2);
			//o numero de vezes que k e dividido por 2 ate o quociente 1
			//indica o expoente da maior potencia de 2 menor ou igual a k
			nBits += 1;
			//o numero de bits para escrever o k e o expoente da menor potencia de 2 maior do que k
		}
		return nBits;
	}
	
	public static void main(String[] args) {
		System.out.println(codigoGrey(10));
	}

}
