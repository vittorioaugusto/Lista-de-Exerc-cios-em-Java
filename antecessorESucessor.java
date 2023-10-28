// 6. Desenvolva um algoritmo em Java que leia um número inteiro e imprima o seu
// antecessor e seu sucessor.

import java.util.Scanner;

public class antecessorESucessor  {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = input.nextInt();

        // Calcula o antecessor e o sucessor
        int antecessor = numero - 1;
        int sucessor = numero + 1;

        System.out.println("O antecessor de " + numero + " é " + antecessor);
        System.out.println("O sucessor de " + numero + " é " + sucessor);

        input.close();
    }
}
