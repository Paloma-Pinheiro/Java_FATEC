/*
Autora: Paloma Pinheiro
Data: 13/02/2025
Descrição: Coletar o valor do lado de um quadrado, calcular sua área e apresentar o resultado.
*/

import javax.swing.JOptionPane;
public class Atividade_01 
{
   public static void main ( String args [ ] )
   {
       int Lado = Integer.parseInt(JOptionPane.showInputDialog("Digite o Lado: "));
       int Area = (Lado * Lado);
       JOptionPane.showMessageDialog(null,"A área do quadrado é: " + Area);
   }
}
