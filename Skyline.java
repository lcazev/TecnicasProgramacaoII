/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package aula0;

import java.util.Scanner;

public class Skyline {

    // Imprime o skyline, recebido no formato de "vetor de alturas", no
    // formato pedido pelo problema
    public static void imprimirSkyline ( int [] skyline ) {
        int hAnterior = 0;
        String imprimirSky = ""; 
        for(int i=0; i<skyline.length; i++) {
        	int hCoordAtual = skyline[i];//o vetor skyline guarda as alturas maximas
        	if(hAnterior != hCoordAtual) { //registra a mudanca de alturas entre coordenadas consecutivas
        			imprimirSky += i + " " + hCoordAtual + " "; //se existe mudanca da altura na coordenada, imprime tal coordenada
        			hAnterior = hCoordAtual;
        	}
        }
        System.out.println("Skyline: " + imprimirSky);
    }

    // Adicionar predio, recebido no formato (esquerda, altura, direita), ao
    // skyline
    public static void adicionarPredio ( int [] predio, int [] skyline ) {
        int esq = predio[0];
        int altura = predio[1];
        int dir = predio[2];
        //separa o vetor predio em coordenadas
        for(int i=esq; i<dir; i++) {//le as coordenadas da esquerda para a direita
        	int alturaAtual = skyline[i];
        	if(altura > alturaAtual) { 
        		skyline[i] = altura;
        	}
        }
    }
    
    // Le um predio que o usuario digitar
    // Caso nao exista mais predios, retorna um array de -1's
    public static int [] lerPredio() {
        int [] novoPredio = new int [3];
        Scanner entrada = new Scanner(System.in);
        System.out.println("Insira as coordenadas do proximo predio:");
        String coord = entrada.nextLine();
        String predioString [] = coord.split(" ");//coloca as coordenadas em um vetor string
        for(int i=0; i<predioString.length;i++) {
        	novoPredio[i] = Integer.parseInt(predioString[i]);//posiciona as coordenadas no vetor
        }
        return novoPredio;
    }

    public static void main(String[] args) {
        int MAX_POS = 10000;
        int [] skyline = new int[MAX_POS+1];
        int [] predio;
        predio = lerPredio(); //inicializa a leitura dos predios
        while( predio[0] != -1 ) { //determina um criterio de parada
            adicionarPredio( predio, skyline ); //adiciona o predio lido ao skyline
	    predio = lerPredio();//reinicia o processo ate o usuario digitar "-1"
        }
        imprimirSkyline( skyline );
    }
    
}
