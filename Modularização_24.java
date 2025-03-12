/*
Autora: Paloma Pinheiro
Data: 07/03/2025
Descrição: Receba um valor inteiro. Verifique e mostre se é divisível por 2 e 3.
*/

package Modularização;

import javax.swing.JOptionPane;

public class Modularização_24 
{
   public static void main ( String args [ ] )
   {
       int Valor = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor inteiro: "));
       JOptionPane.showMessageDialog(null, Função(Valor));
   }
   //Módulo que verifica se o valor recebido é divisivel por 2 e/ou por 3
   static String Função(int Valor) 
   {
	   if (Valor % 2 == 0 && Valor % 3 == 0) 
	   {
		   return Valor + " é divisivel por 2 e por 3";
	   }
	   else if (Valor % 2 == 0) 
	   {
		   return Valor + " é divisivel por 2";
	   }
	   else if (Valor % 3 == 0){
		   return Valor + " é divisivel por 3";
	   }
	   else 
	   {
		   return Valor + " não é divisivel por 2 e nem por 3";
	   }
   }
}

