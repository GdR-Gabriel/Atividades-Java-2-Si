
import java.util.Scanner;
import java.util.Arrays;

public class Atividade22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o tamanho do array:");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Digite os números do array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("O segundo maior número é: " + arr[n - 2]);
    }
}
