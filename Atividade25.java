import java.util.Scanner;
import java.util.ArrayList;

public class Atividade25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        int num;
        int sum = 0;
        double average = 0;
        System.out.println("Digite os números (digite um número igual à média para terminar):");
        while (true) {
            num = scanner.nextInt();
            numbers.add(num);
            sum += num;
            average = (double) sum / numbers.size();
            if (num == average) {
                break;
            }
        }
        System.out.println("Média: " + average);
    }
}
