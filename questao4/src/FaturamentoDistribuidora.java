public class FaturamentoDistribuidora {
    public static void main(String[] args) {
        
        double sp = 863786.43;
        double mg = 692527.36;
        double rj = 522298.88;
        double es = 271625.48;
        double outros = 198495.53;

        double faturamentoTotal = sp + mg + rj + es + outros;

   
        double percentualSP = (sp / faturamentoTotal) * 100;
        double percentualMG = (mg / faturamentoTotal) * 100;
        double percentualRJ = (rj / faturamentoTotal) * 100;
        double percentualES = (es / faturamentoTotal) * 100;
        double percentualOutros = (outros / faturamentoTotal) * 100;

       
        System.out.printf("Percentual de SP: %.2f%% (R$ %.2f)%n", percentualSP, sp);
        System.out.printf("Percentual de MG: %.2f%% (R$ %.2f)%n", percentualMG, mg);
        System.out.printf("Percentual de RJ: %.2f%% (R$ %.2f)%n", percentualRJ, rj);
        System.out.printf("Percentual de ES: %.2f%% (R$ %.2f)%n", percentualES, es);
        System.out.printf("Percentual de Outros: %.2f%% (R$ %.2f)%n", percentualOutros, outros);
    }
}
