public class Exercicio03 {
    public static void executar(){

        System.out.println("Digite dois valore para comparar: ");
        int num1, num2;
        num1 = Prompt.lerInteiro();
        num2 = Prompt.lerInteiro();
        if (num1 != num2) {
            if (num1 > num2) {
                System.out.printf("O maior número é o: %d e o menor é o: %d\n", num1,num2);
            }else{
                System.out.printf("O maior número é o: %d e o menor é o: %d\n", num2,num1);
            }
        
        } else{
            System.out.println("[ERRO] Números iguais!!!");
        }   
    }
}
