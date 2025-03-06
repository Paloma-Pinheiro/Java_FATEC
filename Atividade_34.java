/*
Autora: Paloma Pinheiro
Data: 25/02/2025
Descrição: Receba um número. Calcule e mostre os resultados da tabuada desse número.
*/

package Controller;

import javax.swing.JOptionPane;

public class Atividade_34 {

	public static void main(String[] args) {
	
		double Tabuada = 1;
		int N = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
		for (float i = 1; i <= 10; i++) { //Calcula a tabuada
			Tabuada = N * i;
			System.out.println(+ N + " X " + i + " = " + Tabuada);
		}
	}
}
