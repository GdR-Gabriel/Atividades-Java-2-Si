import java.util.Scanner;

public class Atividade6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quantos números você deseja somar?");
        int n = scanner.nextInt();
        double[] numeros = new double[n];
        double soma = 0;
        for(int i = 0; i < n; i++) {
            System.out.println("Digite o " + (i+1) + "º número:");
            numeros[i] = scanner.nextDouble();
            soma += numeros[i];
        }
        System.out.println("A soma dos números digitados é: " + soma);
        scanner.close();
    }
}