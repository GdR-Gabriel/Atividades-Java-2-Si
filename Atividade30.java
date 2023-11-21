import java.util.Scanner;

public class Atividade30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double salarioMinimo = 1500.00;
        System.out.println("Digite o valor do seu salário:");
        double salarioUsuario = scanner.nextDouble();
        double quantidadeSalarios = salarioUsuario / salarioMinimo;
        System.out.println("Você ganha " + quantidadeSalarios + " salários mínimos.");
    }
}
