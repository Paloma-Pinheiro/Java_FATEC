/*
Autora: Paloma Pinheiro
Data: 18/02/2025
Descrição: Receba os 2 números inteiros. Calcule e mostre a soma dos quadrados.
*/

import javax.swing.JOptionPane;
public class Atividade_09
{
   public static void main ( String args [ ] )
   {

            int X = Integer.parseInt(JOptionPane.showInputDialog("Digite o 1º número inteiro: ")); 
            int Y= Integer.parseInt(JOptionPane.showInputDialog("Digite o 2º número inteiro: "));
       
           int Z = (X * X) + (Y * Y);
            
       JOptionPane.showMessageDialog(null,"O somas dos quadrados: " + Z);
   }
}