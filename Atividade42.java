import java.util.Scanner;

public class Atividade42 {
    public static void main(String[] args) {
        int numeroSorteado = (int) (Math.random() * 1001);
        Scanner scanner = new Scanner(System.in);
        int tentativas = 0;
        int palpite;
        do {
            System.out.println("Digite o seu palpite:");
            palpite = scanner.nextInt();
            tentativas++;
            if (palpite > numeroSorteado) {
                System.out.println("O número sorteado é menor!");
            } else if (palpite < numeroSorteado) {
                System.out.println("O número sorteado é maior!");
            }
        } while (palpite != numeroSorteado);
        System.out.println("Parabéns! Você acertou o número em " + tentativas + " tentativas.");
    }
}
