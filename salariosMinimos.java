// 5. Crie um algoritmo que leia o valor do salário mínimo e o valor do salário de um usuário,
// calcule a quantidade de salários mínimos esse usuário ganha e imprima o resultado.
// (1SM=R$788,00)

import java.util.Scanner;

public class salariosMinimos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Leitura do valor do salário mínimo
        System.out.print("Digite o valor do salário mínimo (em reais): ");
        double salarioMinimo = input.nextDouble();

        // Leitura do valor do salário do usuário
        System.out.print("Digite o valor do salário do usuário (em reais): ");
        double salarioUsuario = input.nextDouble();

        input.close();

        // Cálculo da quantidade de salários mínimos que o usuário ganha
        double quantidadeSalariosMinimos = salarioUsuario / salarioMinimo;

        System.out.println("O usuário ganha aproximadamente " + quantidadeSalariosMinimos + " salários mínimos.");
    }
}