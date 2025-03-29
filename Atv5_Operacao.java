import java.util.Scanner;

public class Atv5_Operacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
       
        System.out.println("Digite o primeiro número:");
        double numero1 = scanner.nextDouble();
        
        System.out.println("Digite o segundo número:");
        double numero2 = scanner.nextDouble();
        
       
        System.out.println("Digite o símbolo da operação (+, -, *, / ou ^):");
        char operacao = scanner.next().charAt(0);
        
      
        double resultado = 0;
        boolean operacaoValida = true;
        
      
        switch (operacao) {
            case '+':
                resultado = numero1 + numero2;
                break;
                
            case '-':
                resultado = numero1 - numero2;
                break;
                
            case '*':
                resultado = numero1 * numero2;
                break;
                
            case '/':
                if (numero2 != 0) {
                    resultado = numero1 / numero2;
                } else {
                    System.out.println("Erro: Divisão por zero não é permitida!");
                    operacaoValida = false;
                }
                break;
                
            case '^':
                resultado = Math.pow(numero1, numero2);
                break;
                
            default:
                System.out.println("Erro: Símbolo de operação inválido!");
                operacaoValida = false;
        }
        
      
        if (operacaoValida) {
            System.out.printf("%.2f %c %.2f = %.2f\n", 
                numero1, operacao, numero2, resultado);
        }
        
        scanner.close();
    }
}
