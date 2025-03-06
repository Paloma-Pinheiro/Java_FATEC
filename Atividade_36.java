
/*
Autora: Paloma Pinheiro
Data: 25/02/2025
Descrição: Receba um número N. Calcule e mostre a série 1 + 1/1! + 1/2! + ... + 1/N!
*/

package Controller;

import javax.swing.JOptionPane;

public class Atividade_36 {

	public static void main(String[] args) {
	
		int N = Integer.parseInt(JOptionPane.showInputDialog("Insira um número"));
		double Serie = 1;
		int i;
		for (i = 1; i <= N; i ++) {
		     double Fatorial = 1;
		  for (float Num = 1 ; Num <= i ; Num ++)  {
			    Fatorial = (Fatorial * Num);        	// Calcula a série
	 								}
		  Serie += 1/ Fatorial ;
		  
		}
		System.out.println("Resultado da série: " + Serie);
	}
	}