
import java.util.Scanner;

public class Atividade20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quantos números você deseja inserir?");
        int n = scanner.nextInt();
        int[] numeros = new int[n];
        double soma = 0;
        for(int i = 0; i < n; i++) {
            System.out.println("Digite o " + (i+1) + "º número:");
            numeros[i] = scanner.nextInt();
            soma += numeros[i];
        }
        double media = soma / n;
        int contador = 0;
        for(int num : numeros) {
            if(num > media) {
                contador++;
            }
        }
        System.out.println("A média dos números digitados é: " + media);
        System.out.println("A quantidade de números acima da média é: " + contador);
    }
}
