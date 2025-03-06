/*
Autora: Paloma Pinheiro
Data: 19/02/2025
Descrição: Receba os valores de 2 catetos de um triângulo retângulo. Calcule e mostre a hipotenusa.
 */

import javax.swing.JOptionPane;
public class Atividade_15
{
   public static void main ( String args [ ] )
   {

       int Cateto1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o 1º cateto: "));
       int Cateto2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o 2º cateto: "));
       int Hipotenusa = Cateto1 + Cateto2;
       JOptionPane.showMessageDialog(null,"Hipotenusa do triângulo: " + Hipotenusa);
   }
}
