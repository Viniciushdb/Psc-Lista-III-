import java.util.Scanner;

public class Atv2_MaquinaTroco {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        double num1, num2, num3, media;

        System.out.println("Digite 3 números: "); 
        num1 = sc.nextDouble();
        num2 = sc.nextDouble();
        num3 = sc.nextDouble();

        media = (num1 + num2 + num3) / 3;

        double maior;

        if (num1 > num2) { 
            maior = num1;
        } else {
            maior = num2;
        }
   
        if (maior < num3) {
            maior = num3;
        }
        System.out.printf("\n O maior dos números é: %.2f", maior);

        double menor;

        if (num1 < num2) {
            menor = num1;
        } else {
            menor = num2;
        }
        
        if (menor > num3) { 
            menor = num3;
        }
        System.out.printf("\n O menor dos números é: %.2f", menor);

        System.out.printf("\n A média dos números é: %.2f", media);

        sc.close();
    }
} 
