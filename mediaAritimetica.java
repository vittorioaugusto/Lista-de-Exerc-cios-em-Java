// 2. Fazer um programa que imprima a média aritmética dos números 8,9 e 7. A média dos 
// números 4, 5 e 6. A soma das duas médias. A média das médias. 

public class mediaAritimetica {
    public static void main(String[] args) {
        // Calcula a média dos números 8, 9 e 7
        double media1 = (8 + 9 + 7) / 3.0;

        // Calcula a média dos números 4, 5 e 6
        double media2 = (4 + 5 + 6) / 3.0;

        // Calcula a soma das duas médias
        double somaDasMedias = media1 + media2;

        // Calcula a média das médias
        double mediaDasMedias = somaDasMedias / 2.0;

        // Imprime os resultados
        System.out.println("Média dos números 8, 9 e 7: " + media1);
        System.out.println("Média dos números 4, 5 e 6: " + media2);
        System.out.println("Soma das duas médias: " + somaDasMedias);
        System.out.println("Média das médias: " + mediaDasMedias);
    }
}
