/*
Autora: Paloma Pinheiro
Data: 25/02/2025
Descrição:	Calcule e mostre a série 1 – 2/4 + 3/9 – 4/16 + 5/25 + ... + 15/225
*/

package Controller;

public class Atividade_45 {

	public static void main(String[] args) {

        double soma = 0.0;

        for (int k = 1; k <= 15; k++) {
            double termo = (double) k / (k * k); 
            if (k % 2 == 0) {
                soma -= termo; // Subtrai se k for par
            } else {
                soma += termo; // Soma se k for ímpar
            }
        }

        System.out.printf("O valor da série é: %.4f%n", soma);
    }
	}
