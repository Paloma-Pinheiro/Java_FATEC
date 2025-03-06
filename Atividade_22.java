/*
Autora: Paloma Pinheiro
Data: 20/02/2025
Descrição: Receba 2 valores inteiros e diferentes. Mostre seus valores em ordem crescente.
 */

import javax.swing.JOptionPane;

public class Atividade_22 {
    public static void main(String[] args) {
        
        double Numero1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número: "));


        double Numero2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número: "));


        while (Numero1 == Numero2) {
            JOptionPane.showMessageDialog(null, "Os números são iguais. Por favor, digite um valor diferente para o segundo número.");
            Numero2 = Double.parseDouble(JOptionPane.showInputDialog("Digite um novo valor para o segundo número: "));
        }

        JOptionPane.showMessageDialog(null, "Números finais:\nNúmero 1: " + Numero1 + "\nNúmero 2: " + Numero2);
    }
}