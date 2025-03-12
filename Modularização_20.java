/*
Autora: Paloma Pinheiro
Data: 07/03/2025
Descrição: Receba 3 coeficientes A, B, e C de uma equação do 2º grau da fórmula AX²+BX+C=0. 
Verifique e mostre a existência de raízes reais e se caso exista, calcule e mostre.
*/

package Modularização;

import javax.swing.JOptionPane;

public class Modularização_20
{
   public static void main ( String args [ ] )
   {

    int A = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de A: "));       
       
     while(A==0)
     { 
    	 //Verifica se A é igual a 0 e pede um novo valor
      JOptionPane.showMessageDialog(null,"O valor de A não pode ser 0 em uma equação de 2º grau");
      A = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de A: "));       
     }
        
       int B = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de B: "));
            int C = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de C: "));
            JOptionPane.showMessageDialog(null,"O valor de Delta é: " + FunçãoDelta(A, B, C));
            JOptionPane.showMessageDialog(null,"Os valores das Raizes São: " + FunçãoEquação(A, B, C));  
   }
   //Módulo que calcula o delta
   static int FunçãoDelta(int A, int B, int C) 
   {
   int Delta = (B * B) - (4 * A * C);
   //Verifica se delta é menor que 0
   if (Delta < 0)
   		{
       JOptionPane.showMessageDialog(null,"Delta é negativo, por isso não há raízes reais"); 
   		}
   //Verifica delta é igual a 0
   else if (Delta == 0) 
   		{
       double Raiz3 = (-B) / (2 * A);
       JOptionPane.showMessageDialog(null,"Delta é 0, fazendo com que a equação tenha apenas uma raiz: " + Raiz3);
   		}
    	   return Delta;
  }
   //Módulo que calcula a equação do 2º grau
   static String FunçãoEquação(int A, int B, int C) 
   {								//chama a função do delta para realizar o calculo 
	   double Raiz1 = (-B + Math.pow(FunçãoDelta(A, B, C), 0.5)) / (2 * A);
	   double Raiz2 = (-B - Math.pow(FunçãoDelta(A, B, C), 0.5)) / (2 * A);
	   return Raiz1 + ", " + Raiz2;
   }
}

