public class Exercicio04 {
    public static void executar(){

        System.out.println("Digite dois números: ");
        double num1, num2;
        num1 = Prompt.lerDecimal();
        num2 = Prompt.lerDecimal();

        System.out.println("A soma é: "+ (num1+num2));
        System.out.println("A Subtração é: "+ (num1-num2));
        System.out.println("A Multiplicação é: "+ num1*num2);
        System.out.println("A Divisão é: "+ num1/num2);
    }
}
