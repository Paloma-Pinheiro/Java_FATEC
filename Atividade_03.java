/*
Autora: Paloma Pinheiro
Data: 13/02/2025
Descrição: Receba a base e a altura de um triângulo. Calcule e mostre a sua área.
*/

import javax.swing.JOptionPane;
public class Atividade_03 
{
   public static void main ( String args [ ] )
   {

       int Base = Integer.parseInt(JOptionPane.showInputDialog("Digite a Base: "));
       int Altura = Integer.parseInt(JOptionPane.showInputDialog("Digite a altura: "));
       int Area = (Base * Altura) / 2;
       JOptionPane.showMessageDialog(null,"A área do triângulo é: " + Area);
   }
}
