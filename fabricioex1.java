import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int idade;
        int somaIdades = 0;
        int contador = 0;

        System.out.println("Digite as idades (digite 0 para encerrar):");

        do {
            idade = scanner.nextInt();
            if (idade != 0) {
                somaIdades += idade;
                contador++;
            }
        } while (idade != 0);

        double mediaIdades = (double) somaIdades / contador;

        System.out.println("A média das idades digitadas é: " + mediaIdades);

        scanner.close();
    }
}