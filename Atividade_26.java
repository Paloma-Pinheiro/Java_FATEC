/*
Autora: Paloma Pinheiro
Data: 20/02/2025
Descrição: Receba 2 números inteiros. Verifique e mostre se o maior número é múltiplo do menor.
*/

import javax.swing.JOptionPane;
public class Atividade_26
{
   public static void main ( String args [ ] )
   {
       int X = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor inteiro: "));
       int Y = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor inteiro: "));
       
       if (X > Y) {
           if (X % Y == 0)
               JOptionPane.showMessageDialog(null, + X + " é multiplo de " + Y );
       }
       else{
            if (Y % X == 0)
               JOptionPane.showMessageDialog(null, + Y + " é multiplo de " + X );
        }
    }
}

