
import java.util.Scanner;

public class Atividade5 {

	public static void main(String[] args) {
		
			Scanner scanner = new Scanner(System.in);
	        double soma = 0;
	        for(int i = 0; i < 10; i++) {
	            System.out.println("Digite o " + (i+1) + "º número:");
	            double num = scanner.nextDouble();
	            soma += num;
	        }
	        double media = soma / 10;
	        System.out.println("A média dos números digitados é: " + media);
	        
	        scanner.close();
	    }
		
	}