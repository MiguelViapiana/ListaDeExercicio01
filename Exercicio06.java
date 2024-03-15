import java.util.Scanner;

public class Exercicio06 {
    public static void executar(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma temperatura em Celcius: ");
        double temp, tempFah;
        temp = sc.nextDouble();
        tempFah = (9*temp +100)/5;
        System.out.printf("A temperatura %.1f C em Fahrenheit é: %.1f F", temp, tempFah);
        sc.close();
    }
}
