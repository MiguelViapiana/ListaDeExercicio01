import java.util.Scanner;

public class Exercicio04 {
    public static void executar(){

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite dois números: ");
        double num1, num2;
        num1 = sc.nextDouble();
        num2 = sc.nextDouble();

        System.out.println("A soma é: "+ (num1+num2));
        System.out.println("A Subtração é: "+ (num1-num2));
        System.out.println("A Multiplicação é: "+ num1*num2);
        System.out.println("A Divisão é: "+ num1/num2);

        sc.close();
    }
}
