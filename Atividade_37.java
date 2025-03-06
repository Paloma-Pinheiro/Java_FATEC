/*
Autora: Paloma Pinheiro
Data: 13/02/2025
Descrição: Receba um número inteiro. Calcule e mostre a série de Fibonacci até o seu N’nésimo termo.
*/

package Controller;

import javax.swing.JOptionPane;
public class Atividade_37 
{
   public static void main ( String args [ ] )
   {
	   int AtualFibonacci = 1;
		int AntigoFibonacci = 0;
		int N = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
		System.out.println(AtualFibonacci);
		
		for (int i = 2; i <= N; i++) {
			int ProximoFibonacci = AtualFibonacci + AntigoFibonacci;  // Calcula a série de Fibonacci
			System.out.println(ProximoFibonacci);
			
		AntigoFibonacci = AtualFibonacci;
		AtualFibonacci	= ProximoFibonacci;
		}		
   }
}
