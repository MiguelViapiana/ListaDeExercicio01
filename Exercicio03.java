import java.util.Scanner;

public class Exercicio03 {
    public static void executar(){

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite dois valore para comparar: ");
        int num1, num2;
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        if (num1 != num2) {
            if (num1 > num2) {
                System.out.printf("O maior número é o: %d e o menor é o: %d", num1,num2);
            }else{
                System.out.printf("O maior número é o: %d e o menor é o: %d", num2,num1);
            }
        
        } else{
            System.out.println("[ERRO] Números iguais!!!");
        }   
        sc.close();
    }
}
