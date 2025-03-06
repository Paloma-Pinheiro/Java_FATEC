/*
Autora: Paloma Pinheiro
Data: 20/02/2025
Descrição: Receba o número de voltas, a extensão do circuito (em metros) e o tempo de duração (minutos).
Calcule e mostre a velocidade média em km/h.
*/

import javax.swing.JOptionPane;
public class Atividade_27
{
   public static void main ( String args [ ] )
   {
       int NumeroVoltas = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de voltas: "));
       double ExtensaoMetros = Integer.parseInt(JOptionPane.showInputDialog("Digite a extensão do circuito (em metros): "));
       double TempoMinutos = Integer.parseInt(JOptionPane.showInputDialog("Digite o tempo de duração: "));
       
        double DistanciaMetros = NumeroVoltas * ExtensaoMetros;
        double DistanciaKm = DistanciaMetros / 1000;

        double TempoHoras = TempoMinutos / 60;

        double VelocidadeMedia = DistanciaKm / TempoHoras;
       JOptionPane.showMessageDialog(null,"A velocidade média em km/h: " + VelocidadeMedia);
   }
}