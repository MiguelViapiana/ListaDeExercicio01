
public class Exercicio09 {
    public static void executar(){
        double num1 = Prompt.lerDecimal("Digite o primeiro número: ");
        double num2 = Prompt.lerDecimal("Digite o segundo número: ");
        if (num1 == num2) {
            System.out.println("Os números são iguais!!");
        }else{
            System.out.println("Os números são diferentes!!");
            if (num1 > num2) {
                System.out.printf("O número %.1f é maior que %.1f\n", num1, num2);
            }else{
                System.out.printf("O número %.1f é maior que %.1f\n", num2, num1);
            }
        }
        
    }
}
