import java.util.Scanner;

public class Exercicio07 {
    public static void executar(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        float num;
        num = sc.nextFloat();
        if (num >= 100 && num <=200){
            System.out.println("O número está dentro do intervalo!!(100-200)");
        }else{
            System.out.println("O número está fora do intervalo!!(100-200)");
        }

        sc.close();
    }
}
