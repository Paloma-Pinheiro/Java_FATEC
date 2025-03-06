/*
Autora: Paloma Pinheiro
Data: 20/02/2025
Descrição: Receba a hora de início e de final de um jogo (HH,MM), 
calcular o tempo do jogo em horas e minutos, 
sabendo que o tempo máximo é menor que 24 horas e pode começar num dia e terminar noutro.
*/

import javax.swing.JOptionPane;

public class Atividade_25 
{
    public static void main(String[] args) 
{

        int HoraInicio = Integer.parseInt(JOptionPane.showInputDialog("Digite a hora de início (HH):"));
        while (HoraInicio < 00 || HoraInicio > 23){
            JOptionPane.showMessageDialog(null, "A hora não pode passar de 23 ou ser menor que 00.\nDigite novamente");
            HoraInicio = Integer.parseInt(JOptionPane.showInputDialog("Digite a hora de início (HH):"));
        }
        int MinutoInicio = Integer.parseInt(JOptionPane.showInputDialog("Digite os minutos de início (MM):"));
        while (MinutoInicio < 00 || MinutoInicio > 59){
        JOptionPane.showMessageDialog(null, "Os minutos não podem passar de 59 ou serem menores que 00.\nDigite novamente");
            MinutoInicio = Integer.parseInt(JOptionPane.showInputDialog("Digite os minutos de início (MM):"));
        }
        int HoraTermino = Integer.parseInt(JOptionPane.showInputDialog("Digite a hora de término (HH):"));
        while (HoraTermino < 00 || HoraTermino > 23){
        JOptionPane.showMessageDialog(null, "A hora não pode passar de 23 ou ser menor que 00.\nDigite novamente");
            HoraTermino = Integer.parseInt(JOptionPane.showInputDialog("Digite a hora do termino (HH):"));
        }
        int MinutoTermino = Integer.parseInt(JOptionPane.showInputDialog("Digite os minutos de término (MM):"));
        while (MinutoTermino < 00 || MinutoTermino > 59){
        JOptionPane.showMessageDialog(null, "Os minutos não podem passar de 59 ou serem menores que 00.\nDigite novamente");
            MinutoTermino = Integer.parseInt(JOptionPane.showInputDialog("Digite os minutos do termino (MM):"));
        }

        int IniciosMinutos = HoraInicio * 60 + MinutoInicio;
        int TerminosMinutos = HoraTermino * 60 + MinutoTermino;


        int DiferencaMinutos;
        if (TerminosMinutos > IniciosMinutos) {
            DiferencaMinutos = TerminosMinutos - IniciosMinutos;
        } else {

            DiferencaMinutos = (24 * 60 - IniciosMinutos) + TerminosMinutos;
        }

        int Horas = DiferencaMinutos / 60;
        int Minutos = DiferencaMinutos % 60;


        JOptionPane.showMessageDialog(null, "Duração do jogo: " + Horas + " horas e " + Minutos + " minutos.");
    }
}