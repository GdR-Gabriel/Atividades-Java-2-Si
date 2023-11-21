import java.util.Scanner;

public class Atividade44 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a mensagem:");
        String mensagem = scanner.nextLine();
        System.out.println("Digite o valor de J:");
        int j = scanner.nextInt();
        StringBuilder criptografada = new StringBuilder();
        for (char c : mensagem.toCharArray()) {
            if (c == ' ') {
                criptografada.append(' ');
            } else {
                criptografada.append((char) ((c - 'a' + j) % 26 + 'a'));
            }
        }
        System.out.println("A mensagem criptografada é: " + criptografada);
    }
}
