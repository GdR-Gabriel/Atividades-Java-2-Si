import java.util.Scanner;
public class Atividade4 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        int maior = Integer.MIN_VALUE;
	        for(int i = 0; i < 5; i++) {
	            System.out.println("Digite o " + (i+1) + "º número:");
	            int num = scanner.nextInt();
	            if(num > maior) {
	                maior = num;
	            }
	        }
	        System.out.println("O maior número digitado foi: " + maior);
	        scanner.close();
	}
	
}
