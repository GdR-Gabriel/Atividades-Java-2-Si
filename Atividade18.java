
import java.util.Scanner;

public class Atividade18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quantos números você deseja inserir?");
        int n = scanner.nextInt();
        int[] numeros = new int[n];
        int maior = Integer.MIN_VALUE;
        int posicao = -1;
        for(int i = 0; i < n; i++) {
            System.out.println("Digite o " + (i+1) + "º número:");
            numeros[i] = scanner.nextInt();
            if(numeros[i] > maior) {
                maior = numeros[i];
                posicao = i;
            }
        }scanner.close();
        System.out.println("O maior número digitado foi " + maior + " e sua posição no array é " + posicao + ".");
    }
}
