/*
Autora: Paloma Pinheiro
Data: 20/02/2025
Descrição: Receba 2 valores reais. Calcule e mostre o maior deles.
 */

import javax.swing.JOptionPane;
public class Atividade_19
{
   public static void main ( String args [ ] )
   {

            int X = Integer.parseInt(JOptionPane.showInputDialog("Digite o 1º número inteiro: ")); 
            int Y = Integer.parseInt(JOptionPane.showInputDialog("Digite o 2º número inteiro: "));
       
           if (X > Y){
            JOptionPane.showMessageDialog(null,"Maior valor: " + X);
           } 
           else{
           JOptionPane.showMessageDialog(null,"Maior valor: " + Y);
           }
            
      
   }
}