import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pessoasSim = 0;
        int pessoasNao = 0;
        int mulheresSim = 0;
        int homensNao = 0;
        int totalHomens = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.println("Pessoa " + i + ":");
            System.out.print("Sexo (M/F): ");
            char sexo = scanner.next().charAt(0);
            System.out.print("Resposta (S/N): ");
            char resposta = scanner.next().charAt(0);

            if (resposta == 'S') {
                pessoasSim++;
                if (sexo == 'F') {
                    mulheresSim++;
                }
            } else if (resposta == 'N') {
                pessoasNao++;
                if (sexo == 'M') {
                    homensNao++;
                }
            }

            if (sexo == 'M') {
                totalHomens++;
            }
        }

        double porcentagemHomensNao = (double) homensNao / totalHomens * 100;

        System.out.println("Número de pessoas que responderam sim: " + pessoasSim);
        System.out.println("Número de pessoas que responderam não: " + pessoasNao);
        System.out.println("Número de mulheres que responderam sim: " + mulheresSim);
        System.out.println("Porcentagem de homens que responderam não: " + porcentagemHomensNao + "%");

        scanner.close();
    }
}