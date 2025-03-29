import java.util.Scanner;

public class Atv4_Valores {
    
    static final double PI = 3.141592;
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
       
        System.out.println("Digite o indicador de operação (1, 2 ou 3):");
        int operacao = scanner.nextInt();
        
        System.out.println("Digite o valor do raio:");
        double raio = scanner.nextDouble();
        
      
        switch (operacao) {
            case 1:
               
                double perimetro = 2 * PI * raio;
                System.out.printf("Perímetro do círculo: %.2f\n", perimetro);
                break;
                
            case 2:
                
                double area = PI * Math.pow(raio, 2);
                System.out.printf("Área do círculo: %.2f\n", area);
                break;
                
            case 3:
                
                double volume = (4.0/3.0) * PI * Math.pow(raio, 3);
                System.out.printf("Volume da esfera: %.2f\n", volume);
                break;
                
            default:
              
                System.out.println("Erro: Código de operação inválido!");
                break;
        }
        
        scanner.close();
    }
}
