import java.util.Scanner;

public class Atividade33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor total da compra:");
        double valorCompra = scanner.nextDouble();
        System.out.println("Digite o valor pago pelo cliente:");
        double valorPago = scanner.nextDouble();
        if (valorPago >= valorCompra) {
            double troco = valorPago - valorCompra;
            System.out.println("O troco é: R$" + troco);
        } else {
            System.out.println("O valor pago é insuficiente para a compra.");
        }
    }
}
