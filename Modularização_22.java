/*
Autora: Paloma Pinheiro
Data: 07/03/2025
Descrição: Receba 2 valores inteiros e diferentes. Mostre seus valores em ordem crescente.
 */

package Modularização;

import javax.swing.JOptionPane;

public class Modularização_22 {
	
    public static void main(String[] args) {
        
        int Numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número: "));


        int Numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número: "));

        while (Numero1 == Numero2) //Verifica se os valores são iguais e faz a troca dos valores
        {
            JOptionPane.showMessageDialog(null, "Os números são iguais. Por favor, digite um valor diferente para o segundo número.");
            Numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite um novo valor para o segundo número: "));
        }
        JOptionPane.showMessageDialog(null, "Valores em ordem crescente: " + Função(Numero1, Numero2));
    }
    //Verifica qual valor é maior
    static String Função(int N1, int N2) {
    	
         if (N1 < N2){
        	 return N1 + ", " + N2;
         }
         else {
        	 return N2 + ", " + N1;
         }
            }
    }