/*
Autora: Paloma Pinheiro
Data: 13/02/2025
Descrição: Receba os valores em x e y. Efetua a troca de seus valores e mostre seus conteúdos.
*/

import javax.swing.JOptionPane;
public class Atividade_06
{
   public static void main ( String args [ ] )
   {

      int X = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de  X: "));
      int Y = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de  Y: "));
       JOptionPane.showMessageDialog(null,"ANTES: X = " + X + " Y = " + Y);
       
      int Z = X;
       X = Y;
       Y = Z;
 
       JOptionPane.showMessageDialog(null,"DEPOIS: X = " + X + " Y = " + Y);
   }
}
