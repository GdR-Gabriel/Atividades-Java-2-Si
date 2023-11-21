
import java.util.Scanner;

public class Atividade12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int somaPares = 0;
        int somaImpares = 0;
        while(true) {
            System.out.println("Digite um número:");
            int num = scanner.nextInt();
            if(num == 999) {
                break;
            } else if(num % 2 == 0) {
                somaPares += num;
            } else {
                somaImpares += num;
            }
        }
        System.out.println("A soma dos números pares digitados é: " + somaPares);
        System.out.println("A soma dos números ímpares digitados é: " + somaImpares);
    }
}

