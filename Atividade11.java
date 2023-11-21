
import java.util.Scanner;

public class Atividade11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int contador = 0;
        double soma = 0;
        while(true) {
            System.out.println("Digite um número:");
            double num = scanner.nextDouble();
            if(num < 0) {
                break;
            } else {
                soma += num;
                contador++;
            }
        }
        double media = soma / contador;
        System.out.println("A média dos números digitados é: " + media);
    }
}
