import java.util.Scanner;

public class Atividade38 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número decimal:");
        int num = scanner.nextInt();
        System.out.println("O número hexadecimal correspondente é: " + Integer.toHexString(num));
    }
}
