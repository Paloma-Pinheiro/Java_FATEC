/*
Autora: Paloma Pinheiro
Data: 25/02/2025
Descrição: Receba 100 números inteiros reais. Verifique e mostre o maior e o menor valor. Obs.: somente valores positivos..
*/

package Controller;

import java.util.Random;

import javax.swing.JOptionPane;

public class Atividade_38 {

	public static void main(String[] args) {
		Random Aleatorio = new Random(); // O código irá receber números aleatórios

        
        int Vetor[]=new int[100]; 
        
        for (int j = 0; j < Vetor.length; j ++) {
        	Vetor [j] = Aleatorio.nextInt(1000);  // Encher o vetor com os valores aleatórios 
        System.out.print(+ Vetor[j] + " - ");
        }
        
        for (int i = 0; i < Vetor.length-1; i ++) {
        for (int j = 0; j < i-1; j ++) {
        	if(Vetor[j] > Vetor[j + 1]){
        		int Auxiliar = Vetor [j];   //bubble sort(deixa o vetor organizado em forma crescente)
        		Vetor[j] = Vetor[j+1];
        		Vetor[j+1] = Auxiliar;
        }
        }
        }
		System.out.println("\nMenor: " + Vetor[0] + " Maior: " + Vetor[99]); //Mostra o primeiro valor do vetor (menor) e o último (maior)
		
	}
}
