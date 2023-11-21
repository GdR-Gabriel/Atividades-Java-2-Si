import java.util.Scanner;

public class Atividade43 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome completo:");
        String nomeCompleto = scanner.nextLine();
        String[] partes = nomeCompleto.split(" ");
        StringBuilder abreviatura = new StringBuilder();
        for (String parte : partes) {
            if (parte.length() > 2) {
                abreviatura.append(parte.charAt(0)).append(". ");
            }
        }
        System.out.println("A abreviatura do nome é: " + abreviatura.toString().trim());
    }
}
