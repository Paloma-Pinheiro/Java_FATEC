/*
Autora: Paloma Pinheiro
Data: 20/02/2025
Descrição: 28.	Receba o preço atual e a média mensal de um produto. 
Calcule e mostre o novo preço sabendo que:
  Venda Mensal	|  Preço Atual	| Preço Novo
    < 500       |    < 30       |   + 10%
 >= 500 e < 100 |  >= 30 e < 80	|   +15%
   >= 1000	|    >= 80	|   - 5%
Obs.: para outras condições, preço novo será igual ao preço atual.

*/

import javax.swing.JOptionPane;
public class Atividade_28
{
   public static void main ( String args [ ] )
   {
       double PrecoNovo;
       double Preco = Float.parseFloat(JOptionPane.showInputDialog("Digite o preço atual do produto: "));
       double Media = Float.parseFloat(JOptionPane.showInputDialog("Digite a media mensal do produto: "));
       if (Preco < 30 && Media < 500) {
           PrecoNovo = Preco * 1.10;
           JOptionPane.showMessageDialog(null,"Novo preço - Ajuste de +15%:\nR$" + PrecoNovo);
       }
       else if (Media >= 500 || Media < 100 && Preco >= 30 || Preco < 80){
           PrecoNovo = Preco * 1.15;
           JOptionPane.showMessageDialog(null,"Novo preço - Ajuste de +10%:\nR$" + PrecoNovo);
       }
       else if (Media >= 1000 && Preco >= 80){
           PrecoNovo = Preco * 0.95;
           JOptionPane.showMessageDialog(null,"Novo preço - Ajuste de -5%:\nR$" + PrecoNovo);
       }
       else {
           PrecoNovo = Preco;
           JOptionPane.showMessageDialog(null,"O preço continuará igual:\nR$" + PrecoNovo);
       }
       
       
   }
}