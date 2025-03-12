/*
Autora: Paloma Pinheiro
Data: 07/03/2025
Descrição: Receba 2 valores reais. Calcule e mostre o maior deles.
 */

package Modularização;

import javax.swing.JOptionPane;

public class Modularização_19
{
   public static void main ( String args [ ] )
   {

            int X = Integer.parseInt(JOptionPane.showInputDialog("Digite o 1º número inteiro: ")); 
            int Y = Integer.parseInt(JOptionPane.showInputDialog("Digite o 2º número inteiro: "));
            JOptionPane.showMessageDialog(null,"Maior valor: " + Função(X, Y));
   } 
   //Módulo que mostra o maior valor real
   static int Função(int X, int Y) 
   {
        	if (X > Y)
        	{
        		return X;
        	} 
        	else
        	{
        		return Y;
        	}
   }
}