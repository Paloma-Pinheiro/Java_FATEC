/*
Autora: Paloma Pinheiro
Data: 19/02/2025
Descrição: Receba 2 ângulos de um triângulo. Calcule e mostre o valor do 3º ângulo
*/

import javax.swing.JOptionPane;
public class Atividade_14
{
   public static void main ( String args [ ] )
   {

       int Angulo1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o 1º ângulo: "));
       int Angulo2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o 2º ângulo: "));
       int Angulo3 = 180 - (Angulo1 + Angulo2);
       JOptionPane.showMessageDialog(null,"3º ângulo do triângulo: " + Angulo3);
   }
}
