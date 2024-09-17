import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int INDICE = 13;
        int SOMA = 0;
        int K = 0;

        while (K < INDICE) {
            K = K + 1;
            SOMA = SOMA + K;
        }

        System.out.println("O valor final de SOMA é: " + SOMA);
        scan.close();
    }
    //o valor final da SOMA será = 91
}
