/*
Autora: Paloma Pinheiro
Data: 07/03/2025
Descrição: Receba o número de voltas, a extensão do circuito (em metros) e o tempo de duração (minutos).
Calcule e mostre a velocidade média em km/h.
*/

package Modularização;

import javax.swing.JOptionPane;

public class Modularização_27
{
   public static void main ( String args [ ] )
   {
       int NumeroVoltas = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de voltas: "));
       double ExtensaoMetros = Integer.parseInt(JOptionPane.showInputDialog("Digite a extensão do circuito (em metros): "));
       double TempoMinutos = Integer.parseInt(JOptionPane.showInputDialog("Digite o tempo de duração: "));
       JOptionPane.showMessageDialog(null,"A velocidade média em km/h: " + Função(NumeroVoltas, ExtensaoMetros, TempoMinutos));
   }  
    //Módulo que calcula a velocidade média em km/h
    static double Função(int NumeroVoltas, double ExtensaoMetros, double TempoMinutos) { 
       	double DistanciaMetros = NumeroVoltas * ExtensaoMetros;
        double DistanciaKm = DistanciaMetros / 1000;

        double TempoHoras = TempoMinutos / 60;

        double VelocidadeMedia = DistanciaKm / TempoHoras;
        return VelocidadeMedia;
   }
}