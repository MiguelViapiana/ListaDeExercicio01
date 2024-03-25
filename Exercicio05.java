public class Exercicio05 {
    public static void executar(){

        System.out.println("Digite dois números: ");
        int A, B, aux;
        System.out.println("Valor para A: ");
        A = Prompt.lerInteiro();
        System.out.println("Valor para B: ");
        B = Prompt.lerInteiro();
        aux = A;
        A = B;
        B = aux;
        System.out.printf("Os valores trocas entre A e B ficam respectivamente A:%d e B:%d\n", A , B);

    }   
} 

