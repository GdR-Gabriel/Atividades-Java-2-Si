
import java.util.Scanner;

public class Atividade17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o 1º número:");
        int num1 = scanner.nextInt();
        System.out.println("Digite o 2º número:");
        int num2 = scanner.nextInt();
        int num;
        do {
            System.out.println("Digite um número:");
            num = scanner.nextInt();
        } while(num != num1 + num2);
        scanner.close();
        System.out.println("Você digitou um número que é a soma dos dois números anteriores.");
    }
}
