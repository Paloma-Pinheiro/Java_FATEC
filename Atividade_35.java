/*
Autora: Paloma Pinheiro
Data: 25/02/2025
Descrição: Receba 2 números inteiros, verifique qual o maior entre eles. 
Calcule e mostre o resultado da somatória dos números ímpares entre esses valores.
*/

package Controller;

import javax.swing.JOptionPane;

public class Atividade_35 {

	public static void main(String[] args) {

	int Soma = 0;
	int X = Integer.parseInt(JOptionPane.showInputDialog("Digite o 1º número: "));
	int Y = Integer.parseInt(JOptionPane.showInputDialog("Digite o 2º número: "));
	
	if (X > Y) {
		for (int i = Y; i <= X; i++) {   //Se X for maior que Y calcula a somatória dos números entre eles
			if (i % 2 != 0) {
				Soma += i; 
							}
									}
				}
	else {
		for (int i = X; i <= Y; i++) {
			if (i % 2 != 0) {
				Soma += i;			// //Se Y for maior que X calcula a somatória dos números entre eles
							}
									}

		}
	JOptionPane.showMessageDialog(null,"Valor da soma: " + Soma);
										}
						}
