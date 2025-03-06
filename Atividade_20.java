/*
Autora: Paloma Pinheiro
Data: 20/02/2025
Descrição: Receba 3 coeficientes A, B, e C de uma equação do 2º grau da fórmula AX²+BX+C=0. 
Verifique e mostre a existência de raízes reais e se caso exista, calcule e mostre.
*/

import javax.swing.JOptionPane;
public class Atividade_20
{
   public static void main ( String args [ ] )
   {

    int A = Integer.parseInt(JOptionPane.showInputDialog("Digite O valor de A: "));       
       
     while(A==0){
      JOptionPane.showMessageDialog(null,"O valor de A não pode ser 0 em uma equação de 2º grau");
      A = Integer.parseInt(JOptionPane.showInputDialog("Digite O valor de A: "));       
     }
        
       int B = Integer.parseInt(JOptionPane.showInputDialog("Digite O valor de B: "));
            int C = Integer.parseInt(JOptionPane.showInputDialog("Digite O valor de C: "));
                
                int Delta = (B * B) - (4 * A * C);
                
                if (Delta < 0) {
                    JOptionPane.showMessageDialog(null,"Delta é negativo, por isso não há raízes reais"); 
                }
                
                else if (Delta == 0) {
                    double Raiz3 = (-B) / (2 * A);
                    JOptionPane.showMessageDialog(null,"Delta é 0, fazendo com que a equação tenha apenas uma raiz: " + Raiz3);
                }
                
                else { 
                    double Raiz1 = (-B + Math.pow(Delta, 0.5)) / (2 * A);
                    double Raiz2 = (-B - Math.pow(Delta, 0.5)) / (2 * A);
                    JOptionPane.showMessageDialog(null,"O valor de Delta é: " + Delta);
                    JOptionPane.showMessageDialog(null,"Os valores das Raizes São: " + Raiz1 + ", " + Raiz2);
                }
    }
}

