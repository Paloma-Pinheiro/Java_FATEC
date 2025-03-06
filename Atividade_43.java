/*
Autora: Paloma Pinheiro
Data: 25/02/2025
Descrição: Calcule e mostre quantos anos serão necessários para que Ana seja maior que Maria
sabendo que Ana tem 1,10 m e cresce 3 cm ao ano e Maria tem 1,5 m e cresce 2 cm ao ano.
*/

package Controller;

import javax.swing.JOptionPane;

public class Atividade_43 {

    public static void main(String[] args) {
        double AlturaAna = 1.10;
        double AlturaMaria = 1.50;
        int Ano = 0;

        // Loop enquanto a altura de Ana for menor que a de Maria
        while (AlturaAna < AlturaMaria) {
            AlturaAna += 0.03; 
            AlturaMaria += 0.02; 
            Ano += 1; // Aumenta as alturas e incrementa o contador de anos
        }

        JOptionPane.showMessageDialog(null, "Serão necessários " + Ano + " anos para Ana ultrapassar a altura de Maria.\n");
    }
}