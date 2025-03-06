/*
Autora: Paloma Pinheiro
Data: 25/02/2025
Descrição: Mostre todas as possibilidades de 2 dados de forma que a soma tenha como resultado 7.
*/

package Controller;

public class Atividade_41 {

    public static void main(String[] args) {
        
        // Loop para percorrer todas as possibilidades do primeiro dado
        for (int i = 1; i <= 6; i++) {
            // Loop para percorrer todas as possibilidades do segundo dado
            for (int j = 1; j <= 6; j++) {
                // Verifica se a soma dos dois dados é igual a 7
                if (i + j == 7) {
                    // Exibe a combinação que resulta em 7
                    System.out.println(i + " + " + j + " = 7");
                }
            }
        }
    }
}

