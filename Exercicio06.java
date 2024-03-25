

public class Exercicio06 {
    public static void executar(){

        System.out.println("Digite uma temperatura em Celcius: ");
        double temp, tempFah;
        temp = Prompt.lerDecimal();
        tempFah = (9*temp +100)/5;
        System.out.printf("A temperatura %.1f C em Fahrenheit é: %.1f F\n", temp, tempFah);
    }
}
