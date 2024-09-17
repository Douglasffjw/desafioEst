import java.util.Arrays;
import java.util.List;

public class Faturamento {
    public static void main(String[] args) {
       
        List<Double> faturamentoDiario = Arrays.asList(100.0, 200.0, 0.0, 150.0, 0.0, 300.0, 0.0, 250.0, 0.0, 0.0, 400.0, 0.0, 0.0, 500.0, 0.0, 0.0, 600.0, 0.0, 0.0, 700.0, 0.0, 0.0, 800.0, 0.0, 0.0, 900.0, 0.0, 0.0, 1000.0, 0.0);

        double menorFaturamento = Double.MAX_VALUE;
        double maiorFaturamento = Double.MIN_VALUE;
        double somaFaturamento = 0.0;
        int diasComFaturamento = 0;

        for (double faturamento : faturamentoDiario) {
            if (faturamento > 0) {
                if (faturamento < menorFaturamento) {
                    menorFaturamento = faturamento;
                }
                if (faturamento > maiorFaturamento) {
                    maiorFaturamento = faturamento;
                }
                somaFaturamento += faturamento;
                diasComFaturamento++;
            }
        }

        double mediaFaturamento = somaFaturamento / diasComFaturamento;
        int diasAbaixoDaMedia = 0;

        for (double faturamento : faturamentoDiario) {
            if (faturamento > 0 && faturamento < mediaFaturamento) {
                diasAbaixoDaMedia++;
            }
        }

        System.out.println("Menor faturamento: " + menorFaturamento);
        System.out.println("Maior faturamento: " + maiorFaturamento);
        System.out.println("Média de faturamento: " + mediaFaturamento);
        System.out.println("Dias com faturamento abaixo da média: " + diasAbaixoDaMedia);
    }
}
