/*
Autora: Paloma Pinheiro
Data: 07/03/2025
Descrição: Receba 2 valores inteiros. Calcule e mostre o resultado da diferença do maior pelo menos valor.
 */

package Modularização ;

import javax.swing.JOptionPane;

public class Modularização_18
{
   public static void main ( String args [ ] )
   {
            int X = Integer.parseInt(JOptionPane.showInputDialog("Digite o 1º número inteiro: ")); 
            int Y = Integer.parseInt(JOptionPane.showInputDialog("Digite o 2º número inteiro: "));
            JOptionPane.showMessageDialog(null,"A diferença entre os valores: " + Função(X, Y));
    }
   //Módulo que calcula a diferença do maior pelo menor valor    
   static int Função(int X, int Y) 
   { 

            int Z;
        	
        	if (X > Y){
        		Z = X - Y;
            } 
            else{
            	Z = Y - X;
            }
        	
            return Z;
  }
}