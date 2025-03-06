/*
Autora: Paloma Pinheiro
Data: 18/02/2025
Descrição: Receba o ano de nascimento e o ano atual. 
Calcule e mostre a sua idade e quantos anos terá daqui a 17 anos.
*/

import javax.swing.JOptionPane;
public class Atividade_12
{
   public static void main ( String args [ ] )
   {
       int NasAno = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano de nascimento: "));
       int AtuAno = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano atual: "));
       int Idade = AtuAno - NasAno;
       int Dezessete = Idade + 17;
       JOptionPane.showMessageDialog(null,"Idade atual: " + Idade + " Idade daqui 17 anos: " + Dezessete);
   }
}
