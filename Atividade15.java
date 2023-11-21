
import java.util.Scanner;

public class Atividade15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o 1º número:");
        int primeiroNum = scanner.nextInt();
        int num;
        do {
            System.out.println("Digite um número:");
            num = scanner.nextInt();
        } while(num != primeiroNum);
        
        System.out.println("Você digitou um número igual ao primeiro número lido.");
        scanner.close();
    }
}