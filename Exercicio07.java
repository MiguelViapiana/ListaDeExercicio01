public class Exercicio07 {
    public static void executar(){

        System.out.println("Digite um número: ");
        double num;
        num =Prompt.lerDecimal();
        if (num >= 100 && num <=200){
            System.out.println("O número está dentro do intervalo!!(100-200)");
        }else{
            System.out.println("O número está fora do intervalo!!(100-200)");
        }

    }
}
