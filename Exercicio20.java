public class Exercicio20 {
    public static void executar(){
        double tempoViagem = Prompt.lerDecimal("Digite o tempo da viagem em horas: ");
        double velporHora = Prompt.lerDecimal("Digite a velocidade em Km/h");
        double distancia = Prompt.lerDecimal("Digite a distãncia da viagem");

        double litros = distancia /12;

        System.out.printf("A quantida de litros gasta na viagem é de ", litros);
    }
}
