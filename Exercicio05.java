import java.util.Scanner;

public class Exercicio05 {
    public static void Executar(){

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite dois números: ");
        int A, B, aux;
        System.out.println("Valor para A: ");
        A = sc.nextInt();
        System.out.println("Valor para B: ");
        B = sc.nextInt();
        aux = A;
        A = B;
        B = aux;
        System.out.printf("Os valores trocas entre A e B ficam respectivamente A:%d e B:%d", A , B);
        
        sc.close();
    }   
} 

