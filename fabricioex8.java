import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de N: ");
        int N = scanner.nextInt();

        double H = 0.0;

        for (int i = 2; i <= N; i++) {
            H += 1.0 / i;
        }

        H += 1.0;

        System.out.println("O valor de H é: " + H);

        scanner.close();
    }
}