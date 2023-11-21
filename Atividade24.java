import java.util.Scanner;
import java.util.ArrayList;

public class Atividade24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        int num;
        int sum = 0;
        int evenCount = 0;
        System.out.println("Digite os números (digite um número negativo para terminar):");
        while ((num = scanner.nextInt()) >= 0) {
            numbers.add(num);
            sum += num;
            if (num % 2 == 0) {
                evenCount++;
            }
        }
        double average = (double) sum / numbers.size();
        System.out.println("Média: " + average);
        System.out.println("Números pares: " + evenCount);
    }
}
