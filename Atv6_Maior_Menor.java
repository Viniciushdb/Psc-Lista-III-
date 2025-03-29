import java.util.Scanner;
import java.util.Random;

public class Atv6_Maior_Menor {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

       
        System.out.println("Digite o primeiro número inteiro:");
        int num1 = scanner.nextInt();
        System.out.println("Digite o segundo número inteiro:");
        int num2 = scanner.nextInt();

        
        int menor = Math.min(num1, num2);
        int maior = Math.max(num1, num2);

        
        int numeroSorteado = random.nextInt(maior - menor + 1) + menor;

        
        System.out.println("\nNúmero sorteado: " + numeroSorteado);
        if (numeroSorteado % 2 == 0) {
            System.out.println("Este número é par!");
        } else {
            System.out.println("Este número é ímpar!");
        }

        scanner.close();
    }
}
