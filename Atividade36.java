import java.util.Scanner;

public class Atividade36 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro número binário:");
        String bin1 = scanner.nextLine();
        System.out.println("Digite o segundo número binário:");
        String bin2 = scanner.nextLine();
        int num1 = Integer.parseInt(bin1, 2);
        int num2 = Integer.parseInt(bin2, 2);
        int produto = num1 * num2;
        System.out.println("O produto é: " + Integer.toBinaryString(produto));
    }
}
