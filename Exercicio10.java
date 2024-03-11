public class Exercicio10 {
    public static void executar(){
        int num = Prompt.lerInteiro("\nDigite um número entre 1 e 5!");
        if (num < 1 && num > 5) {
            System.out.println("Número inválido!");
        }else{

            switch (num) {
                case 1:
                    System.out.println("Número digitado foi: Um");
                    break;
                case 2:
                    System.out.println("Número digitado foi: Dois");
                    break;
                case 3:
                    System.out.println("Número digitado foi: Três");
                    break;
                case 4:
                    System.out.println("Número digitado foi: Quatro");
                    break;
                case 5:
                    System.out.println("Número digitado foi: Cinco");
                    break;
            }

        }

    }
}
