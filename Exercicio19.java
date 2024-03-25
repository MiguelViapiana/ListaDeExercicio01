public class Exercicio19 {
    public static void executar(){
        System.out.println("--- Volume de cilindro ---");
        double raio = Prompt.lerDecimal("Digite o raio do cilindro");
        double altura = Prompt.lerDecimal("Digite a altura do cilindro");

        double volumeCilindro = 3.14* Math.pow(raio, 2) * altura;

        System.out.printf("O volume do cilindro é de %.1fm³\n", volumeCilindro);
    }
}
