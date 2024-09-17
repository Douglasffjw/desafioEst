import java.util.Scanner;

public class FibonacciChecker {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        
        System.out.print("Informe um número: ");
        int numero = scan.nextInt();

        
        scan.close();

        
        int fib1 = 0, fib2 = 1;

        
        if (numero == fib1 || numero == fib2) {
            System.out.println("O número " + numero + " pertence à sequência de Fibonacci.");
            return;
        }

       
        int fibAtual = fib1 + fib2;
        while (fibAtual < numero) {
            fib1 = fib2;
            fib2 = fibAtual;
            fibAtual = fib1 + fib2;
        }

        if (fibAtual == numero) {
            System.out.println("O número " + numero + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("O número " + numero + " NÃO pertence à sequência de Fibonacci.");
        }
    }
}
