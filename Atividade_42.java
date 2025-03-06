/*
Autora: Paloma Pinheiro
Data: 25/02/2025
Descrição: Calcule e mostre a série 1 + 2/3 + 3/5 + ... + 50/99
*/

package Controller;

public class Atividade_42 {

	public static void main(String[] args) {
        double soma = 0; // Variável para armazenar a soma da série

        // Loop para calcular a série
        for (int numerador = 1, denominador = 1; numerador <= 50; numerador++, denominador += 2) {
            double termo = (double) numerador / denominador; // Calcula o termo atual
            soma += termo; // Adiciona o termo à soma total
            System.out.printf("%d/%d = %.4f\n", numerador, denominador, termo); // Exibe o termo atual
        }

        // Exibe a soma total da série
        System.out.printf("\nSoma da série: %.4f\n", soma);
    }
}