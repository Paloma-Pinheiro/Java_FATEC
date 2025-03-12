/*
Autora: Paloma Pinheiro
Data: 07/03/2025
Descrição:
Receba 4 notas bimestrais de um aluno. Calcule e mostre a média aritmética. Mostre a mensagem de acordo com a média:

a.	Se a média for >= 6,0 exibir “APROVADO”;
b.	Se a média for >= 3,0 ou < 6,0 exibir “EXAME”;
c.	Se a média for < 3,0 exibir “RETIDO”.
 */

package Modularização;

import javax.swing.JOptionPane;

public class Modularização_21
{
   public static void main ( String args [ ] )
   {
  		float Cont = 0;
               
       for (int X = 1; X < 5; X++)
       {
            float Notas = Float.parseFloat(JOptionPane.showInputDialog("Digite a Nota do " + X + "º Bimestre: "));
            Cont = Notas + Cont; //soma o valor de todas as notas
       }
       JOptionPane.showMessageDialog(null, Função(Cont));
   }
   //Verifica as soma e classifica em qual média o aluno se encontra
   static String Função(float Cont) 
   { 

       	float Media = Cont /4;
       
       	if (Media < 3.0) 
       	{
       		return " RETIDO - Média: " + Media;  
       	}
       
       	else if (Media >= 3.0 && Media < 6.0) 
       	{ 
       		return " EXAME - Média: " + Media;
       	}
       
       	else 
       	{
       		return " APROVADO - Média: " + Media;   
       	}
   }
}

