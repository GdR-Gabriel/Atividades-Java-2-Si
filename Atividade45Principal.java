
import java.util.Scanner;

public class Atividade45Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o tamanho do array:");
        int tamanho = scanner.nextInt();
        Atividade45 array = new Atividade45(tamanho);
        for (int i = 0; i < tamanho; i++) {
            System.out.println("Digite o número " + (i + 1) + ":");
            int num = scanner.nextInt();
            array.adicionar(num);
        }
        System.out.println("A média aritmética dos números é: " + array.calculaMedia());
    }
}
