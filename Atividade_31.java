/*
Autora: Paloma Pinheiro
Data: /02/2025
Descrição: Calcule e mostre o quadrado dos números entre 10 e 150.
*/

import javax.swing.JOptionPane;
public class Atividade_31 
{
   public static void main ( String args [ ] )
   {
       for (int X = 1; X < 142; X++){
       int Valor = X + 9;
       int Quadrado = Valor * Valor;
       System.out.println("O numero " + Valor + " ao quadrado fica: " + Quadrado);  
       }
   }
} 

