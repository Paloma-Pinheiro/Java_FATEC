/*
Autora: Paloma Pinheiro
Data: 25/02/2025
Descrição: Receba um número. Calcule e mostre a série 1 + 1/2 + 1/3 + ... + 1/N.
*/

package Controller;

import javax.swing.JOptionPane;

public class Atividade_33 {

	public static void main(String[] args) {
		
		double Serie = 0;
		
		int N = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
		
		for (float i = 1; i <= N; i++) {
			Serie += 1/ i; //Calcula a série
		}
		System.out.println("A série do número " + N + ": " + Serie);
		
	}
}
