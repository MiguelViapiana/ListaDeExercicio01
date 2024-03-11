import java.util.Scanner;

public class Exercicio01 {
    public static void executar(){

        Scanner sc = new Scanner(System.in);

        int num;

        System.out.println("Digite um número: ");
        num = sc.nextInt();
        if(num > 10){
            System.out.println("Número maior que 10!");
        }else{
            System.out.println("Número menor que 10!");
        }
        sc.close();

    }
}
