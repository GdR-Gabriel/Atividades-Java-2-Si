

import java.util.Scanner;

public class Atividade21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o tamanho do array:");
        int n = scanner.nextInt();
        double[] arr = new double[n];
        double sum = 0;
        System.out.println("Digite os números do array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextDouble();
            sum += arr[i];
        }
        double average = sum / n;
        int count = 0;
        for (double num : arr) {
            if (num > average) {
                count++;
            }
        }
        System.out.println("Média: " + average);
        System.out.println("Números acima da média: " + count);
    }
}
