/*
Autora: Paloma Pinheiro
Data: 25/02/2025
Descrição: Receba um número inteiro. Calcule e mostre o seu fatorial.
*/

import javax.swing.JOptionPane;
public class Atividade_32 
{
   public static void main ( String args [ ] )
   {
   int Fatorial = 1;
   int N = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:")); 
   while(N < 0) {
       JOptionPane.showMessageDialog(null,"Não é possível calcular fatorial de " + N);
       N = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:")); 
   }
   for (int i = 1; i <= N; i++) {
      Fatorial *= i;
   }
   JOptionPane.showMessageDialog(null,"O fatorial de " + N + " é: " + Fatorial);
   }
}
