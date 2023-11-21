import java.util.Scanner;

public class Atividade39 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número decimal:");
        int num = scanner.nextInt();
        System.out.println("O número octal correspondente é: " + Integer.toOctalString(num));
    }
}
