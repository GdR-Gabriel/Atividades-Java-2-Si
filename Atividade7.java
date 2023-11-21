import java.util.Scanner;
public class Atividade7 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número:");
        int num = scanner.nextInt();
        System.out.println("Os divisores de " + num + " são:");
        for(int i = 1; i <= num; i++) {
            if(num % i == 0) {
                System.out.println(i);
            }
	}scanner.close();

	}
}
