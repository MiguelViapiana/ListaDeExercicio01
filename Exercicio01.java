public class Exercicio01 {
    public static void executar(){

        int num;

        System.out.println("Digite um número: ");
        num = Prompt.lerInteiro();
        if(num > 10){
            System.out.println("Número maior que 10!");
        }else{
            System.out.println("Número menor que 10!");
        }
    }
}
