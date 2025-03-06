/*
Autora: Paloma Pinheiro
Data: 18/02/2025
Descrição: Receba o raio de uma circunferência. Calcule e mostre o comprimento da circunferência.
*/

import javax.swing.JOptionPane;
public class Atividade_11
{
   public static void main ( String args [ ] )
   {

            int Raio = Integer.parseInt(JOptionPane.showInputDialog("Digite o raio de uma circunferência: "));
       
           double Comprimento = 6.28 * Raio;
            
       JOptionPane.showMessageDialog(null,"O comprimento da circunferência é: " + Comprimento);
   }
}
