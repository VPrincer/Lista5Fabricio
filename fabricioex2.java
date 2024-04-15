import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int canal4 = 0, canal5 = 0, canal7 = 0, canal12 = 0;
        int totalPessoas = 0;

        System.out.println("Digite o número do canal e o número de pessoas assistindo (ou 0 0 para encerrar):");

        while (true) {
            int canal = scanner.nextInt();
            int pessoas = scanner.nextInt();

            if (canal == 0) {
                break;
            }

            switch (canal) {
                case 4:
                    canal4 += pessoas;
                    break;
                case 5:
                    canal5 += pessoas;
                    break;
                case 7:
                    canal7 += pessoas;
                    break;
                case 12:
                    canal12 += pessoas;
                    break;
                default:
                    System.out.println("Canal inválido.");
                    break;
            }

            totalPessoas += pessoas;
        }

        if (totalPessoas > 0) {
            System.out.println("Porcentagem de audiência de cada canal:");
            System.out.println("Canal 4: " + (double) canal4 / totalPessoas * 100 + "%");
            System.out.println("Canal 5: " + (double) canal5 / totalPessoas * 100 + "%");
            System.out.println("Canal 7: " + (double) canal7 / totalPessoas * 100 + "%");
            System.out.println("Canal 12: " + (double) canal12 / totalPessoas * 100 + "%");
        } else {
            System.out.println("Nenhuma pessoa assistindo TV.");
        }

        scanner.close();
    }
}