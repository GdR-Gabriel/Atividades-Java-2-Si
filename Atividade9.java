
import java.util.Scanner;

public class Atividade9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[100];
        int num;
        int contador = 0;
        boolean repetido = false;
        do {
            System.out.println("Digite um número:");
            num = scanner.nextInt();
            for(int i = 0; i < contador; i++) {
                if(numeros[i] == num) {
                    repetido = true;
                    break;
                }
            }
            if(repetido) {
                break;
            } else {
                numeros[contador] = num;
                contador++;
            }
        } while(true);
        scanner.close();
        System.out.println("Você digitou " + contador + " números antes da repetição.");
    }
}
