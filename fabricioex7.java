import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String cidadeMaiorIndice = "";
        int maiorIndice = Integer.MIN_VALUE;
        String cidadeMenorIndice = "";
        int menorIndice = Integer.MAX_VALUE;
        int totalVeiculos = 0;

        System.out.print("Digite o número de cidades: ");
        int numCidades = scanner.nextInt();

        for (int i = 1; i <= numCidades; i++) {
            System.out.println("Cidade " + i + ":");
            System.out.print("Nome: ");
            String nomeCidade = scanner.next();
            System.out.print("Número de veículos de passeio: ");
            int numVeiculos = scanner.nextInt();
            System.out.print("Número de acidentes com vítimas: ");
            int numAcidentes = scanner.nextInt();

            if (numAcidentes > maiorIndice) {
                maiorIndice = numAcidentes;
                cidadeMaiorIndice = nomeCidade;
            }
            if (numAcidentes < menorIndice) {
                menorIndice = numAcidentes;
                cidadeMenorIndice = nomeCidade;
            }

            totalVeiculos += numVeiculos;
        }

        double mediaVeiculos = (double) totalVeiculos / numCidades;

        System.out.println("Maior índice de acidentes de trânsito: " + maiorIndice + " - Cidade: " + cidadeMaiorIndice);
        System.out.println("Menor índice de acidentes de trânsito: " + menorIndice + " - Cidade: " + cidadeMenorIndice);
        System.out.println("Média de veículos nas cidades: " + mediaVeiculos);

        scanner.close();
    }
}