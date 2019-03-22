package tp2;

public class palindromoRecursivo {

	public static boolean verificaPalindromo(String palavra) {
		palavra = palavra.toLowerCase();
		if(palavra.length() == 0 || palavra.length() == 1)
			return true; //caso base
		if(palavra.charAt(0) == palavra.charAt(palavra.length()-1))
			return verificaPalindromo(palavra.substring(1, palavra.length()-1));
			//chama a funcao verificaPalindromo
			// com o primeiro e ultimo caracteres removidos
			// chegando ao caso base sem problemas
			// a palavra é palindromo
		return false;
	}
	
	public static void main(String[] args) {
		if(verificaPalindromo("Madam")){
			System.out.println("A palavra e um palindromo");
		} else {
			System.out.println("A palavra nao e um palindromo");
		}
	}

}
