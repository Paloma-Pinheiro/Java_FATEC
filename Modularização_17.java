/*
Autora: Paloma Pinheiro
Data: 07/03/2025
Descrição: Calcule a quantidade de litros gastos em uma viagem, sabendo que o automóvel faz 12 km/l. 
Receber o tempo de percurso e a velocidade média.
 */

package Modularização;

import javax.swing.JOptionPane;

public class Modularização_17
{
   public static void main ( String args [ ] )
   {

       int TemPer = Integer.parseInt(JOptionPane.showInputDialog("Digite o tempo de percurso: "));
       int VeloMed = Integer.parseInt(JOptionPane.showInputDialog("Digite a velocidade média: "));
       JOptionPane.showMessageDialog(null,"Quantidade de litros gastos em uma viagem: " + Função(TemPer, VeloMed));
   }
   //Módulo que calcula a quantidade de litros gastos em uma viagem
   static int Função(int T, int V) 
   {
   		int QuantLit = (T * V) / 12;
   		return QuantLit;
   }
}
