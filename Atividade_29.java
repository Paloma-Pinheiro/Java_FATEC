/*
Autora: Paloma Pinheiro
Data: 25/02/2025
Descrição: Receba o tipo de investimento (1 = poupança e 2 = renda fixa) e o valor do investimento. 
Calcule e mostre o valor corrigido em 30 dias sabendo que a poupança = 3% e a renda fixa = 5%. 
Demais tipos não serão considerados.
*/

import javax.swing.JOptionPane;
public class Atividade_29
{
   public static void main ( String args [ ] )
   {
       double NovoValor;
       int Tipo = Integer.parseInt(JOptionPane.showInputDialog("Digite:\n1 - Poupança    2 - Renda Fixa"));
       while (Tipo != 1 && Tipo != 2){
            JOptionPane.showMessageDialog(null,"Valor invalído, digite novamente");
            Tipo = Integer.parseInt(JOptionPane.showInputDialog("Digite:\n1 - Poupança    2 - Renda Fixa"));
        }
       double Investimento = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do investimento: "));
       if (Tipo == 1){
           NovoValor = Investimento * 1.03; 
       }
       else {
           NovoValor = Investimento * 1.05;
       }
    JOptionPane.showMessageDialog(null,"Valor corrigido: R$" + NovoValor);
   }
}

