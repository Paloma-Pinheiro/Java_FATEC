/*
Autora: Paloma Pinheiro
Data: 20/02/2025
Descrição: Receba um valor inteiro. Verifique e mostre se é divisível por 2 e 3.
*/

import javax.swing.JOptionPane;
public class Atividade_24 
{
   public static void main ( String args [ ] )
   {
       int Valor = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor inteiro: "));
       if (Valor % 2 == 0 && Valor % 3 == 0) {
           JOptionPane.showMessageDialog(null, + Valor + " é divisivel por 2 e por 3");
       }
       else if (Valor % 2 == 0) {
           JOptionPane.showMessageDialog(null, + Valor + " é divisivel por 2");
       }
       else if (Valor % 3 == 0){
           JOptionPane.showMessageDialog(null, + Valor + " é divisivel por 3");
       }
       else
       JOptionPane.showMessageDialog(null, + Valor + " não é divisivel por 2 e nem por 3");
    }
}

