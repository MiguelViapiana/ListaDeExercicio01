import java.util.Scanner;

public class Exercicio02 {
    public static void executar(){

        Scanner sc = new Scanner(System.in);

        int num1, num2;
        System.out.println("Digite dois números: ");
        num1 = sc.nextInt();
        sc.nextLine();
        num2 = sc.nextInt();
        System.out.println("A soma dos números é: "+ (num1+num2));

        sc.close();
    }
}
