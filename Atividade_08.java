/*
Autora: Paloma Pinheiro
Data: 18/02/2025
Descrição: Receba o valor de um depósito em poupança. 
Calcule e mostre o valor após 1 mês de aplicação sabendo que rende 1,3% a. m.
*/

import javax.swing.JOptionPane;
public class Atividade_08
{
   public static void main ( String args [ ] )
   {

           double Deposito = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do depósito: "));
       
           double Rendimento = Deposito + (Deposito * 0.013);
            
       JOptionPane.showMessageDialog(null,"O valor do depósito após 1 mês de aplicação: " + Rendimento);
   }
}

