/*
Autora: Paloma Pinheiro
Data: 13/02/2025
Descrição: Receba a temperatura em graus Celsius. 
Calcule e mostre a sua temperatura convertida em fahrenheit F = 1.8 * C + 32.
*/

import javax.swing.JOptionPane;
public class Atividade_04 
{
   public static void main ( String args [ ] )
   {

       int Celsius = Integer.parseInt(JOptionPane.showInputDialog("Digite a temperatura em ºC: "));
       double Fahrenheit = 1.8 * Celsius + 32;
       JOptionPane.showMessageDialog(null,"A temperatura convertida para Fahrenheit: " + Fahrenheit);
   }
}
