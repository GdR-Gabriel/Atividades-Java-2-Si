public class Atividade45 {
    private int[] array;
    private int atual;
    private int maximo;

    public Atividade45(int tamanho) {
        this.array = new int[tamanho];
        this.atual = 0;
        this.maximo = tamanho;
    }

    public boolean adicionar(int n) {
        if (atual < maximo) {
            array[atual] = n;
            atual++;
            return true;
        } else {
            return false;
        }
    }

    public double calculaMedia() {
        int soma = 0;
        for (int i = 0; i < atual; i++) {
            soma += array[i];
        }
        return (double) soma / atual;
    }
}
