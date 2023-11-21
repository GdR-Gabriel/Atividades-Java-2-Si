import java.time.LocalDate;
import java.time.Period;

public class Pessoa {
    private int idade;
    private int diaNascimento;
    private int mesNascimento;
    private int anoNascimento;
    private String nome;

    public void calculaIdade(int diaAtual, int mesAtual, int anoAtual) {
        LocalDate dataNascimento = LocalDate.of(anoNascimento, mesNascimento, diaNascimento);
        LocalDate dataAtual = LocalDate.of(anoAtual, mesAtual, diaAtual);
        this.idade = Period.between(dataNascimento, dataAtual).getYears();
    }

    public int informaIdade() {
        return this.idade;
    }

    public String informaNome() {
        return this.nome;
    }

    public void ajustaDataDeNascimento(int dia, int mes, int ano) {
        this.diaNascimento = dia;
        this.mesNascimento = mes;
        this.anoNascimento = ano;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
