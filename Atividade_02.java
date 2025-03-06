/*
Autora: Paloma Pinheiro
Data: 13/02/2025
Descrição: Receba o salário de um funcionário e mostre o novo salário com reajuste de 15%.
*/

import javax.swing.JOptionPane;
public class Atividade_02 
{
   public static void main ( String args [ ] )
   {

       double Salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do salário: "));
       double Reajuste = (Salario * 1.15);
       JOptionPane.showMessageDialog(null,"O valor do novo salário é: " + Reajuste);
   }
}
