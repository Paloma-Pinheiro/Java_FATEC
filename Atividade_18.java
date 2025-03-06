/*
Autora: Paloma Pinheiro
Data: 20/02/2025
Descrição: Receba 2 valores inteiros. Calcule e mostre o resultado da diferença do maior pelo menos valor.
 */

import javax.swing.JOptionPane;
public class Atividade_18
{
   public static void main ( String args [ ] )
   {
       int Z;
            int X = Integer.parseInt(JOptionPane.showInputDialog("Digite o 1º número inteiro: ")); 
            int Y = Integer.parseInt(JOptionPane.showInputDialog("Digite o 2º número inteiro: "));
       
           if (X > Y){
           Z = X - Y;
           } 
           else{
           Z = Y - X;
           }
            
       JOptionPane.showMessageDialog(null,"A diferença entre os valores: " + Z);
   }
}