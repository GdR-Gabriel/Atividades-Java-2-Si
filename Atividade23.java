import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Atividade23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();
        String name;
        System.out.println("Digite os nomes (digite 'FIM' para terminar):");
        while (!(name = scanner.nextLine()).equals("FIM")) {
            names.add(name);
        }
        Collections.reverse(names);
        System.out.println("Nomes em ordem inversa:");
        for (String n : names) {
            System.out.println(n);
        }
    }
}
