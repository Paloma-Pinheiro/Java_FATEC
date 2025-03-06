/*
Autora: Paloma Pinheiro
Data: 13/02/2025
Descrição: Receba os coeficientes A, B e C de uma equação do 2º grau (AX²+BX+C=0). 
Calcule e mostre as raízes reais (considerar que a equação possue duas raízes).
*/

import javax.swing.JOptionPane;
public class Atividade_05
{
   public static void main ( String args [ ] )
   {

    int A = Integer.parseInt(JOptionPane.showInputDialog("Digite O valor de A: "));       
       int B = Integer.parseInt(JOptionPane.showInputDialog("Digite O valor de B: "));
            int C = Integer.parseInt(JOptionPane.showInputDialog("Digite O valor de C: "));
                
                int Delta = (B * B) - (4 * A * C);
                
                double Raiz1 = (-B + Math.pow(Delta, 0.5)) / (2 * A);
                double Raiz2 = (-B - Math.pow(Delta, 0.5)) / (2 * A);
                
    JOptionPane.showMessageDialog(null,"O valor de Delta é: " + Delta);
    JOptionPane.showMessageDialog(null,"Os valores das Raizes São: " + Raiz1 + ", " + Raiz2);
   }
}

