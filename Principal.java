
public class Principal {
    public static void main(String[] args) {
        Pessoa einstein = new Pessoa();
        einstein.setNome("Albert Einstein");
        einstein.ajustaDataDeNascimento(14, 3, 1879);
        einstein.calculaIdade(21, 11, 2023);
        System.out.println(einstein.informaNome() + " teria " + einstein.informaIdade() + " anos.");

        Pessoa newton = new Pessoa();
        newton.setNome("Isaac Newton");
        newton.ajustaDataDeNascimento(4, 1, 1643);
        newton.calculaIdade(21, 11, 2023);
        System.out.println(newton.informaNome() + " teria " + newton.informaIdade() + " anos.");
    }
}
