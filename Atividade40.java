import java.util.Scanner;

public class Atividade40 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número binário:");
        String bin = scanner.nextLine();
        int num = Integer.parseInt(bin, 2);
        System.out.println("O número decimal correspondente é: " + num);
    }
}
