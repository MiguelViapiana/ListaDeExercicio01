public class Exercicio17 {
    public static void executar(){
        System.out.println("--- Média ponderada --- \nDigite as três notas: ");
        double nota1 = Prompt.lerDecimal(" 1° Nota: ");
        double nota2 = Prompt.lerDecimal(" 2° Nota: ");
        double nota3 = Prompt.lerDecimal(" 3° Nota: ");
        int peso1 = Prompt.lerInteiro(" Peso 1: ");
        int peso2 = Prompt.lerInteiro(" Peso 2: ");
        int peso3 = Prompt.lerInteiro(" Peso 3: ");

        double mediaPond = (nota1 * peso1 + nota2 * peso2 + nota3 * peso3) / (peso1 + peso2 + peso3);
        System.out.printf("A média ponderada das notas é de: %.2f\n", mediaPond);
    }
}
