/*
Autora: Paloma Pinheiro
Data: 07/03/2025
Descrição: Receba 2 números inteiros. Verifique e mostre se o maior número é múltiplo do menor.
*/

package Modularização;

import javax.swing.JOptionPane;

public class Modularização_26
{
   public static void main ( String args [ ] )
   {
       int X = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor inteiro: "));
       int Y = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor inteiro: "));
       JOptionPane.showMessageDialog(null, Função(X,Y));
   }
   //Módulo que verifica qual é o maior valor e se o maior é multiplo do menor    
   static String Função(int X, int Y) 
   {
       if (X > Y) 
       {
         if (X % Y == 0) {
            return X + " é multiplo de " + Y ;
         } 
         else 
         {
           return X + " não é múltiplo de " + Y;
         }
       }
       else 
       {
    	 if (Y % X == 0) 
    	 {
           return Y + " é múltiplo de " + X;
         } 
    	 else 
    	 {
           return Y + " não é múltiplo de " + X;
    	 }
       }
   }	
}
