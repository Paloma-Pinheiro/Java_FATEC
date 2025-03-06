/*
Autora: Paloma Pinheiro
Data: 18/02/2025
Descrição: Receba os valores do comprimento, largura e altura de um paralelepípedo. 
Calcule e mostre seu volume.
*/

import javax.swing.JOptionPane;
public class Atividade_07
{
   public static void main ( String args [ ] )
   {

           int Comprimento = Integer.parseInt(JOptionPane.showInputDialog("Digite o comprimento do paralelepípedo: "));
           int Altura = Integer.parseInt(JOptionPane.showInputDialog("Digite a altura do paralelepípedo: "));
           int Largura = Integer.parseInt(JOptionPane.showInputDialog("Digite a Largura do Paralelepípedo"));
       
      int Volume = Comprimento * Altura * Largura;
            
       JOptionPane.showMessageDialog(null,"O volume do Paralelepipedo é: " + Volume);
   }
}
