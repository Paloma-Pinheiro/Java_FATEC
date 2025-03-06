/*
Autora: Paloma Pinheiro
Data: 25/02/2025
Descrição: Calcule a quantidade de grãos contidos em um tabuleiro de xadrez onde:
			Casa: 	1	2	3	4	...	64
			Qdte:	1	2	4	8	...	N
*/

package Controller;

import java.math.BigInteger;

import javax.swing.JOptionPane;

public class Atividade_39 {

	public static void main(String[] args) {
		
		int Casas = 64;
        BigInteger TotalGraos = BigInteger.ZERO;
		
       for (int i = 0; i < Casas; i++) {  // Calcula a quantidade de graos em cada casa e as soma
           BigInteger GraosNaCasa = BigInteger.valueOf(2).pow(i); // 2^i
           TotalGraos = TotalGraos.add(GraosNaCasa);
       }
       System.out.println("Total de grãos no tabuleiro: " + TotalGraos);
	}
}

