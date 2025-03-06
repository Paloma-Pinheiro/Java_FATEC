/*
Autora: Paloma Pinheiro
Data: 20/02/2025
Descrição: Receba 3 valores obrigatoriamente em ordem crescente e um 4º valor não necessariamente em ordem. 
Mostre os 4 números em ordem crescente.
 */

import javax.swing.JOptionPane;
public class Atividade_23
{
   public static void main ( String args [ ] )
   {

            int W = Integer.parseInt(JOptionPane.showInputDialog("Digite o menor número: ")); 
            int X = Integer.parseInt(JOptionPane.showInputDialog("Digite o número do meio: "));
            
            while (X <= W) {
               JOptionPane.showMessageDialog(null,"O número precisa ter um valor superior ao seu antecessor.\nPrimeiro: " + W + "\nDigite novamente:"); 
               X = Integer.parseInt(JOptionPane.showInputDialog("Digite o número do meio: "));
            }
            int Y = Integer.parseInt(JOptionPane.showInputDialog("Digite o maior número: "));
            
            while (Y <= W || Y <= X) {
               JOptionPane.showMessageDialog(null,"O número precisa ter um valor superior ao seus antecessores.\nPrimeiro: " + W +" Segundo: " + X + "\nDigite novamente:"); 
                Y= Integer.parseInt(JOptionPane.showInputDialog("Digite o número do meio: "));
            }
            int Z = Integer.parseInt(JOptionPane.showInputDialog("Digite um número aleatório: "));
            
           if (Z <= W){
            JOptionPane.showMessageDialog(null,"Lista do menor para o maior: " + Z + " " + W + " " + X + " " + Y);
           } 
           else if (Z <= X) {
            JOptionPane.showMessageDialog(null,"Lista do menor para o maior: " + W + " " + Z + " " + X + " " + Y);
           }
           
           else if (Z <= Y ) {
            JOptionPane.showMessageDialog(null,"Lista do menor para o maior: " + W + " " + X + " " + Z + " " + Y);
           }
           else{
            JOptionPane.showMessageDialog(null,"Lista do menor para o maior: " + W + " " + X + " " + Y + " " + Z);
           }
   }
}