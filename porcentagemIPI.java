// 4. Escrever um algoritmo que lê:
// - a porcentagem do IPI a ser acrescido no valor das peças
// - o código da peça 1, valor unitário da peça 1, quantidade de peças 1
// - o código da peça 2, valor unitário da peça 2, quantidade de peças 2
// O algoritmo deve calcular o valor total a ser pago e apresentar o resultado.
// Fórmula : (valor1*quant1 + valor2*quant2)*(IPI/100 + 1)

import java.util.Scanner;

public class porcentagemIPI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Leitura da porcentagem do IPI
        System.out.print("Digite a porcentagem do IPI a ser acrescido: ");
        double ipi = input.nextDouble();

        // Leitura dos dados da peça 1
        System.out.print("Digite o código da peça 1: ");
        System.out.print("Digite o valor unitário da peça 1: ");
        double valorUnitario1 = input.nextDouble();
        System.out.print("Digite a quantidade de peças 1: ");
        int quantidade1 = input.nextInt();

        // Leitura dos dados da peça 2
        System.out.print("Digite o código da peça 2: ");
        System.out.print("Digite o valor unitário da peça 2: ");
        double valorUnitario2 = input.nextDouble();
        System.out.print("Digite a quantidade de peças 2: ");
        int quantidade2 = input.nextInt();

        input.close();

        // Cálculo do valor total a ser pago
        double valorTotal = (valorUnitario1 * quantidade1 + valorUnitario2 * quantidade2) * (ipi / 100 + 1);

        System.out.println("Valor total a ser pago: " + valorTotal);
    }
}