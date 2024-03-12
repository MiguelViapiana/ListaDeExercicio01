public class Exercicio13 {
    public static void executar(){
        double num1 = Prompt.lerDecimal("Digite um valor para A: ");
        double num2 = Prompt.lerDecimal("Digite um valor para B: ");
        System.out.println("Escolha a operação \n1 = Somar | 2 = Subtração | 3 = Multiplicação | 4 = Divisão");
        int op = Prompt.lerInteiro();
        switch (op) {
            case 1:
                System.out.println("A soma dos números é: "+ (num1+num2));
                break;
            case 2:
                System.out.println("A subtração dos números é: "+ (num1-num2));
                break;
            case 3:
                System.out.println("A multiplicação dos números é: "+ (num1*num2));
                break;
            case 4:
                System.out.println("A divisão dos números é: "+ (num1/num2));
                break;
            default:
            System.out.println("Operação inválida!!");
                break;
        }
        
    }
}
