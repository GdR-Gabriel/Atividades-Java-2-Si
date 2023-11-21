import java.util.Scanner;
import java.util.ArrayList;
public class Atividade8 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();
        int num;
        do {
            System.out.println("Digite um número (0 para parar):");
            num = scanner.nextInt();
            if(num != 0) {
                numeros.add(num);
            }
        } while(num != 0);
        
        System.out.println("Você digitou " + numeros.size() + " números.");
        scanner.close();
    }

	}

