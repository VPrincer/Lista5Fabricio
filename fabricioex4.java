import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int somaIdades = 0;
        int quantidadePessoas90kgMenor150cm = 0;
        int quantidadePessoasMais190cm = 0;
        int quantidadePessoasEntre10e30AnosMais190cm = 0;
        int totalPessoas = 10;

        for (int i = 1; i <= totalPessoas; i++) {
            System.out.println("Pessoa " + i + ":");
            System.out.print("Idade: ");
            int idade = scanner.nextInt();
            System.out.print("Peso (em kg): ");
            double peso = scanner.nextDouble();
            System.out.print("Altura (em metros): ");
            double altura = scanner.nextDouble();

            somaIdades += idade;

            if (peso > 90 && altura < 1.50) {
                quantidadePessoas90kgMenor150cm++;
            }
            if (altura > 1.90) {
                quantidadePessoasMais190cm++;
                if (idade >= 10 && idade <= 30) {
                    quantidadePessoasEntre10e30AnosMais190cm++;
                }
            }
        }

        double mediaIdades = (double) somaIdades / totalPessoas;

        double porcentagemPessoasEntre10e30AnosMais190cm = 
            (double) quantidadePessoasEntre10e30AnosMais190cm / quantidadePessoasMais190cm * 100;

        System.out.println("Média das idades das dez pessoas: " + mediaIdades);
        System.out.println("Quantidade de pessoas com peso superior a 90 kg e altura inferior a 1,50 m: " + quantidadePessoas90kgMenor150cm);
        System.out.println("Porcentagem de pessoas com idade entre 10 e 30 anos entre as pessoas que medem mais de 1,90 m: " + porcentagemPessoasEntre10e30AnosMais190cm + "%");

        scanner.close();
    }
}