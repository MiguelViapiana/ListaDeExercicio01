import java.util.Scanner;

public class Exercicio08 {
    public static void executar(){

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        float num;
        num = sc.nextFloat();
        if (num < 50) {
            System.out.printf("O número %.1f é menor que 50!!", num);
        }else{
            System.out.printf("O número %.1f é maior que 50!!", num);
        }

        sc.close();
    }
}
