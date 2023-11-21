public class Atividade34 {
    public static void main(String[] args) {
        double baseCalculo = 1372.22;
        double icms = baseCalculo * 0.175;
        double ipi = baseCalculo * 0.07;
        double pis = baseCalculo * 0.0375;
        double cofins = baseCalculo * 0.04;
        double valorTotal = baseCalculo + icms;
        System.out.println("Valor total da nota fiscal: R$" + valorTotal);
        System.out.println("Valor do ICMS: R$" + icms);
        System.out.println("Valor do IPI: R$" + ipi);
        System.out.println("Valor do PIS: R$" + pis);
        System.out.println("Valor do COFINS: R$" + cofins);
    }
}
