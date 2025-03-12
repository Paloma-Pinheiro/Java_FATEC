/*
Autora: Paloma Pinheiro
Data: 07/03/2025
Descrição: Receba 3 valores obrigatoriamente em ordem crescente e um 4º valor não necessariamente em ordem. 
Mostre os 4 números em ordem crescente.
 */

package Modularização;

import javax.swing.JOptionPane;

public class Modularização_23
{
   public static void main ( String args [ ] )
   {

            int W = Integer.parseInt(JOptionPane.showInputDialog("Digite o menor número: ")); 
            int X = Integer.parseInt(JOptionPane.showInputDialog("Digite o número do meio: "));
            //Se X for menor ou igual a W, o valor de X deve ser alterado
            while (X <= W) 
            {
               JOptionPane.showMessageDialog(null,"O número precisa ter um valor superior ao seu antecessor.\nPrimeiro: " + W + "\nDigite novamente:"); 
               X = Integer.parseInt(JOptionPane.showInputDialog("Digite o número do meio: "));
            }
            int Y = Integer.parseInt(JOptionPane.showInputDialog("Digite o maior número: "));
          //Se Y for menor ou igual a W ou a X, o valor de Y deve ser alterado
            while (Y <= W || Y <= X) 
            {
               JOptionPane.showMessageDialog(null,"O número precisa ter um valor superior ao seus antecessores.\nPrimeiro: " + W +" Segundo: " + X + "\nDigite novamente:"); 
                Y= Integer.parseInt(JOptionPane.showInputDialog("Digite o número do meio: "));
            }
            int Z = Integer.parseInt(JOptionPane.showInputDialog("Digite um número aleatório: "));
            
            JOptionPane.showMessageDialog(null,"Lista do menor para o maior: " + Função(W, X, Y, Z));
    }
           //Verifica onde Z se encaixa na ordem crescente dos valores
           static String Função(int W, int X, int Y, int Z) 
           {
        	   if (Z <= W)
        	   {
        		   return Z + " " + W + " " + X + " " + Y;
        	   } 
           
        	   else if (Z <= X) 
        	   {
        		   return W + " " + Z + " " + X + " " + Y;
        	   }
           
        	   else if (Z <= Y ) 
        	   {
        		   return W + " " + X + " " + Z + " " + Y;
        	   }
        	   
        	   else
        	   {
        		   return W + " " + X + " " + Y + " " + Z;
        	   }
           }
}