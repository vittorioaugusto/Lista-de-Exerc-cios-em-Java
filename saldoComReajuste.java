// 3. Informar um saldo e imprimir o saldo com reajuste de 1%. 

import java.util.Scanner;

public class saldoComReajuste {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o saldo: ");
        double saldo = input.nextDouble();

        // Calcula o saldo com reajuste de 1%
        double saldoReajustado = saldo * 1.01;

        System.out.println("Saldo com reajuste de 1%: " + saldoReajustado);

        input.close();
    }
}

