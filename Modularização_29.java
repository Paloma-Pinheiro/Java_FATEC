/*
Autora: Paloma Pinheiro
Data: 07/03/2025
Descrição: Receba o tipo de investimento (1 = poupança e 2 = renda fixa) e o valor do investimento. 
Calcule e mostre o valor corrigido em 30 dias sabendo que a poupança = 3% e a renda fixa = 5%. 
Demais tipos não serão considerados.
*/

package Modularização;

import javax.swing.JOptionPane;

public class Modularização_29
{
   public static void main ( String args [ ] )
   {

       int Tipo = Integer.parseInt(JOptionPane.showInputDialog("Digite:\n1 - Poupança    2 - Renda Fixa"));
       while (Tipo != 1 && Tipo != 2)
       {
            JOptionPane.showMessageDialog(null,"Valor invalído, digite novamente");
            Tipo = Integer.parseInt(JOptionPane.showInputDialog("Digite:\n1 - Poupança    2 - Renda Fixa"));
       }
       double Investimento = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do investimento: "));
       JOptionPane.showMessageDialog(null,"Valor corrigido: R$" + Função(Tipo, Investimento));       
   }
   	//Módulo que verifica se o tipo escolhido foi poupança ou renda fixa e corrige o valor após 30 dias do saque
    static Double Função(int T, double I)
    {
       double NovoValor;
       if (T == 1){
           NovoValor = I * 1.03; 
       }
       else {
           NovoValor = I * 1.05;
       }
       return NovoValor;
   }
}

