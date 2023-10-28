// 1. Faça  um  algoritmo que  leia  a  idade  de  uma pessoa  expressa  em  anos,  meses  e dias  e 
// mostre-a expressa em dias. Leve em consideração o ano com 365 dias e o mês com 30. 
// (Ex: 3 anos, 2 meses e 15 dias = 1170 dias.)

import java.util.Scanner;

public class IdadeEmDias {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a quantidade de anos: ");
        int anos = input.nextInt();

        System.out.print("Digite a quantidade de meses: ");
        int meses = input.nextInt();

        System.out.print("Digite a quantidade de dias: ");
        int dias = input.nextInt();

        input.close();

        int idadeEmDias = (anos * 365) + (meses * 30) + dias;

        System.out.println("Idade expressa em dias: " + idadeEmDias + " dias.");
    }
}
