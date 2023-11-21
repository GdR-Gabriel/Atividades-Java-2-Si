import java.util.Scanner;

public class Atividade28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o saldo:");
        double saldo = scanner.nextDouble();
        double saldoReajustado = saldo * 1.01;
        System.out.println("O saldo com reajuste de 1% é: " + saldoReajustado);
    }
}
