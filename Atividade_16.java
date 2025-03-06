/*
Autora: Paloma Pinheiro
Data: 19/02/2025
Descrição: Receba a quantidade de horas trabalhadas, o valor por hora, o percentual de desconto
e o número de descendentes. Calcule o salário que serão as horas trabalhadas x o valor por hora.
Calcule o salário líquido (= Salário Bruto – desconto). A cada dependente será acrescido R$ 100
no Salário Líquido. Exiba o salário a receber.
 */

import javax.swing.JOptionPane;
public class Atividade_16
{
   public static void main ( String args [ ] )
   {

       int HorTra = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de horas trabalhadas: "));
       int ValHor = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor por hora: "));
       int PerDesc = Integer.parseInt(JOptionPane.showInputDialog("Digite o percentual de desconto: "));
       int NumDes = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de descendentes, se não tiver, digite 0: "));
       
       int Salario = HorTra * ValHor;
       int SaLiq = (Salario - PerDesc) + (NumDes * 100);
       
       JOptionPane.showMessageDialog(null,"Salário a receber: " + SaLiq);
   }
}

