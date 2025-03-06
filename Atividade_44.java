/*
Autora: Paloma Pinheiro
Data: 25/02/2025
Descrição: Receba o número da base e do expoente. Calcule e mostre o valor da potência.
*/

package Controller;

import javax.swing.JOptionPane;

public class Atividade_44 {

	public static void main(String[] args) {
		
		int Base = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor da base: "));
		int Expoente = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor do expoente: "));
		int Potencia = 1;

        // Loop para calcular a potência
        for (int i = 0; i < Expoente; i++) {
            Potencia *= Base;
        }

		JOptionPane.showMessageDialog(null, "Valor da potência: " + Base);
	}
}
