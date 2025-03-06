/*
Autora: Paloma Pinheiro
Data: 13/02/2025
Descrição: Receba a data de nascimento e atual em ano, mês e dia. 
Calcule e mostre a idade em anos, meses e dias, considerando os anos bissextos.
*/

import javax.swing.JOptionPane;
public class Atividade_30
{
   public static void main ( String args [ ] )
   {
      int AnoB;
       int AnoNascimento = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano do nascimento: "));
           
        while (AnoNascimento <= 1800) {
            JOptionPane.showMessageDialog(null,"O ano " + AnoNascimento + " não é válido, digite novamente: ");
            AnoNascimento = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano do nascimento : "));
        }
        
         if (AnoNascimento % 4 == 0 && AnoNascimento % 100 != 0 || AnoNascimento % 400 == 0){
              AnoB = 1;  
            }
            else {
              AnoB = 2;
            }  
       
       int MesNascimento = Integer.parseInt(JOptionPane.showInputDialog("Digite o mês do nascimento: "));
        while (MesNascimento <= 0 && MesNascimento > 12) {
            JOptionPane.showMessageDialog(null,"O mês " + MesNascimento + " não é válido, digite novamente: ");
            MesNascimento = Integer.parseInt(JOptionPane.showInputDialog("Digite o mês do nascimento: "));
        }
       
      int DiaNascimento = Integer.parseInt(JOptionPane.showInputDialog("Digite o dia do nascimento: "));
       if (MesNascimento == 2 && AnoB == 1){
            while (DiaNascimento <=0 && DiaNascimento > 29){
                JOptionPane.showMessageDialog(null,"O dia " + DiaNascimento + " não é válido, já que Fevereiro em ano bissexto vai até dia 29. Digite novamente: ");
            DiaNascimento = Integer.parseInt(JOptionPane.showInputDialog("Digite o dia do nascimento: "));
            }
        }
       else if (MesNascimento == 2 && AnoB == 1){
           while (DiaNascimento <=0 && DiaNascimento > 28){
                JOptionPane.showMessageDialog(null,"O dia " + DiaNascimento + " não é válido, já que Fevereiro em ano comum vai até dia 28. Digite novamente: ");
            DiaNascimento = Integer.parseInt(JOptionPane.showInputDialog("Digite o dia do nascimento: "));
            }
       }
       else if (MesNascimento == 4 ||MesNascimento == 6 ||MesNascimento == 9 ||MesNascimento == 11) {
        while (DiaNascimento <= 0 && DiaNascimento > 30) {
            JOptionPane.showMessageDialog(null,"O dia " + DiaNascimento + " não é válido, já que o mes " + MesNascimento + " vai até dia 30. Digite novamente: ");
            DiaNascimento = Integer.parseInt(JOptionPane.showInputDialog("Digite o dia do nascimento: "));
        }
       }
       else {
        while (DiaNascimento <= 0 && DiaNascimento > 31) {
            JOptionPane.showMessageDialog(null,"O dia " +  DiaNascimento + " não é válido, já que o mes " + MesNascimento + " vai até dia 31. Digite novamente: ");
            DiaNascimento = Integer.parseInt(JOptionPane.showInputDialog("Digite o dia do nascimento: "));
        }
       }
       
       int AnoAtual = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano atual: "));
           
        while (AnoAtual < AnoNascimento) {
            JOptionPane.showMessageDialog(null,"O ano declarado não é válido, digite novamente: ");
            AnoAtual = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano atual: "));
        }
        
         if (AnoAtual % 4 == 0 && AnoAtual % 100 != 0 || AnoAtual % 400 == 0){
              AnoB = 1;  
            }
            else {
              AnoB = 2;
            }  
       
       int MesAtual = Integer.parseInt(JOptionPane.showInputDialog("Digite o mês atual: "));
        while (MesNascimento <= 0 && MesNascimento > 12) {
            JOptionPane.showMessageDialog(null,"O mês " + MesAtual + " não é válido, digite novamente: ");
            MesNascimento = Integer.parseInt(JOptionPane.showInputDialog("Digite o mês atual: "));
        }
       
       int DiaAtual = Integer.parseInt(JOptionPane.showInputDialog("Digite o dia atual: "));
       if (MesAtual == 2 && AnoB == 1){
            while (DiaAtual <=0 && DiaAtual > 29){
                JOptionPane.showMessageDialog(null,"O dia " + DiaAtual + " não é válido, já que Fevereiro em ano bissexto vai até dia 29. Digite novamente: ");
            DiaAtual = Integer.parseInt(JOptionPane.showInputDialog("Digite o dia atual: "));
            }
        }
       else if (MesAtual == 2 && AnoB == 1){
           while (DiaAtual <=0 && DiaAtual > 28){
                JOptionPane.showMessageDialog(null,"O dia " + DiaAtual + " não é válido, já que Fevereiro em ano comum vai até dia 28. Digite novamente: ");
            DiaAtual = Integer.parseInt(JOptionPane.showInputDialog("Digite o dia atual: "));
            }
       }
       else if (MesAtual == 4 ||MesAtual == 6 ||MesAtual == 9 ||MesAtual == 11) {
        while (DiaAtual <= 0 && DiaAtual > 30) {
            JOptionPane.showMessageDialog(null,"O dia " + DiaNascimento + " não é válido, já que o mes " + MesNascimento + " vai até dia 30. Digite novamente: ");
            DiaAtual = Integer.parseInt(JOptionPane.showInputDialog("Digite o dia atual: "));
        }
       }
       else {
        while (DiaAtual <= 0 && DiaAtual > 31) {
            JOptionPane.showMessageDialog(null,"O dia " +  DiaNascimento + " não é válido, já que o mes " + MesNascimento + " vai até dia 31. Digite novamente: ");
            MesAtual = Integer.parseInt(JOptionPane.showInputDialog("Digite o dia atual: "));
        }
       }
       int Ano = AnoAtual - AnoNascimento;
      
        int   Mes = MesAtual - MesNascimento; 

        int   Dia = DiaAtual - DiaNascimento;
       
       
       
       if (Mes < 0){
           Mes += 12;
           Ano -= 1;
       }
       
       if (Dia < 0){
           Mes -= 1;
           Dia += DiaVeridico(MesNascimento, AnoNascimento);
   }
       JOptionPane.showMessageDialog(null,"IDADE - Dia: " + Dia + " Mês: " + Mes + " Ano: " + Ano);
   }
       public static int DiaVeridico(int Mes, int Ano){
           if (Mes ==2) 
           return Bissexto(Ano) ? 29 : 28;
        
            else if (Mes == 4 || Mes == 6 || Mes == 9 || Mes == 11) {
            return 30;
        }
            else {
            return 31;
        }
    }


    public static boolean Bissexto(int Ano) {
        return (Ano % 4 == 0 && Ano % 100 != 0) || (Ano % 400 == 0);

       }
}
   

