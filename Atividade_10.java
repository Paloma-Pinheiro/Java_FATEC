/*
Autora: Paloma Pinheiro
Data: 18/02/2025
Descrição: Receba 2 números reais. Calcule e mostre a diferença desses valores.
*/

import javax.swing.JOptionPane;
public class Atividade_10
{
   public static void main ( String args [ ] )
   {
       float Z;     
      
           float X = Float.parseFloat(JOptionPane.showInputDialog("Digite o 1º número real: ")); 
           float Y = Float.parseFloat(JOptionPane.showInputDialog("Digite o 2º número real: "));
       
           if (X > Y){
             Z = X - Y;
           } 
           else{
             Z = Y - X;
           }
            
       JOptionPane.showMessageDialog(null,"A diferença entre os valores: " + Z);
   }
}