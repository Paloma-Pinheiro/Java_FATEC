/*
Autora: Paloma Pinheiro
Data: 26/02/2025
Descrição: Receba 2 números inteiros. Verifique e mostre todos os números primos existentes entre eles.
*/

package Controller;

import javax.swing.JOptionPane;

public class Atividade_40 {

    public static void main(String[] args) {

        int X = Integer.parseInt(JOptionPane.showInputDialog("Digite o maior número: "));
        int Y = Integer.parseInt(JOptionPane.showInputDialog("Digite o menor número: "));
        
        // Garantir que Y seja menor ou igual a X
        while (Y > X) { //Deixa a ogrigatoriedade de que Y seja sempre menor que X
            JOptionPane.showMessageDialog(null, "O valor do 2º número não pode ser maior que o do 1º.\nDigite novamente.");
            Y = Integer.parseInt(JOptionPane.showInputDialog("Digite o menor número: "));
        }

        StringBuilder primos = new StringBuilder("Números primos entre " + Y + " e " + X + ":\n");

        for (int i = Y; i <= X; i++) {
            if (ehPrimo(i)) {
                primos.append(i).append(" ");
            }
        }

        JOptionPane.showMessageDialog(null, primos.toString());
    }

    // Método para verificar se um número é primo
    public static boolean ehPrimo(int numero) {
        if (numero < 2) {
            return false;
        }
        for (int j = 2; j <= Math.sqrt(numero); j++) {
            if (numero % j == 0) {
                return false;
            }
        }
        return true;
    }
}