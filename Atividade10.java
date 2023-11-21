
import java.util.Scanner;

public class Atividade10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o 1º número:");
        int menor = scanner.nextInt();
        for(int i = 2; i <= 10; i++) {
            System.out.println("Digite o " + i + "º número:");
            int num = scanner.nextInt();
            if(num < menor) {
                menor = num;
            }
        }
        System.out.println("O menor número digitado foi: " + menor);
    }
}
