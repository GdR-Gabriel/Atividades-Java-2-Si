
import java.util.Scanner;

public class Atividade14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o 1º número:");
        int numAnterior = scanner.nextInt();
        int num;
        do {
            System.out.println("Digite um número:");
            num = scanner.nextInt();
        } while(num <= numAnterior);
        
        System.out.println("Você digitou um número maior que o anterior.");
    }
}

