
import java.util.Scanner;

public class Atividade19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quantos números você deseja inserir?");
        int n = scanner.nextInt();
        int[] numeros = new int[n];
        int menor = Integer.MAX_VALUE;
        int posicao = -1;
        for(int i = 0; i < n; i++) {
            System.out.println("Digite o " + (i+1) + "º número:");
            numeros[i] = scanner.nextInt();
            if(numeros[i] < menor) {
                menor = numeros[i];
                posicao = i;
            }
        }scanner.close();
        System.out.println("O menor número digitado foi " + menor + " e sua posição no array é " + posicao + ".");
    }
}
