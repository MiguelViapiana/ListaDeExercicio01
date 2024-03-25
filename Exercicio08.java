public class Exercicio08 {
    public static void executar(){

        System.out.println("Digite um número: ");
        double num;
        num = Prompt.lerDecimal();
        if (num < 50) {
            System.out.printf("O número %.1f é menor que 50!!\n", num);
        }else{
            System.out.printf("O número %.1f é maior que 50!!\n", num);
        }

    }
}
