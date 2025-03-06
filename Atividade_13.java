/*
Autora: Paloma Pinheiro
Data: 18/02/2025
Descrição: Receba a quantidade de alimento em quilos. 
Calcule e mostre quantos dias durará esse alimento sabendo que a pessoa consome 50g ao dia.
*/

import javax.swing.JOptionPane;
public class Atividade_13
{
   public static void main ( String args [ ] )
   {

       double Alimentos = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de alimento em KG: "));
       double Dias = Alimentos * 1000 / 50;
       JOptionPane.showMessageDialog(null,"Comendo 50g ao dia, o alimento durará: " + Dias + " dias.");
   }
}
