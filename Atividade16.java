
import java.util.Scanner;

public class Atividade16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        do {
            System.out.println("Digite um número:");
            num = scanner.nextInt();
        } while(!isPrime(num));
        
        System.out.println("Você digitou um número primo.");
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}