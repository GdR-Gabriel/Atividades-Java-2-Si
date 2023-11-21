
import java.util.Scanner;
import java.util.Arrays;

public class Atividade13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nomes = new String[5];
        for(int i = 0; i < 5; i++) {
            System.out.println("Digite o " + (i+1) + "º nome:");
            nomes[i] = scanner.nextLine();
        }
        Arrays.sort(nomes);
        System.out.println("Os nomes em ordem alfabética são:");
        for(String nome : nomes) {
            System.out.println(nome);
        }
    }
}

