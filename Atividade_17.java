/*
Autora: Paloma Pinheiro
Data: 19/02/2025
Descrição: Calcule a quantidade de litros gastos em uma viagem, sabendo que o automóvel faz 12 km/l. 
Receber o tempo de percurso e a velocidade média.
 */

import javax.swing.JOptionPane;
public class Atividade_17
{
   public static void main ( String args [ ] )
   {

       int TemPer = Integer.parseInt(JOptionPane.showInputDialog("Digite o tempo de percurso: "));
       int VeloMed = Integer.parseInt(JOptionPane.showInputDialog("Digite a velocidade média: "));
       int QuantLit = (TemPer * VeloMed) / 12;
       JOptionPane.showMessageDialog(null,"Quantidade de litros gastos em uma viagem: " + QuantLit);
   }
}
