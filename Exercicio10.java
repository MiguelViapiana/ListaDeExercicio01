public class Exercicio10 {
    public static void executar(){
        int num = Prompt.lerInteiro("Digite um número entre 1 e 5!");
        if (num < 1 && num > 5) {
            System.out.println("Número inválido!");
        }else{

            switch (num) {
                case 1:
                    System.out.println("Número digitado foi: ");
                    break;
            
                default:
                    break;
            }

        }

    }
}
