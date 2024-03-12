public class Exercicio15 {
    public static void executar(){
        System.out.println("Digite as cordenadas do plano:");
        System.out.println("P1:");
        double x1 = Prompt.lerDecimal("X1: ");
        double y1 = Prompt.lerDecimal("Y1: ");
        System.out.println("P2:");
        double x2 = Prompt.lerDecimal("X2:");
        double y2 = Prompt.lerDecimal("Y2: ");
        

        System.out.printf("A distância dos pontos é: %.2f", Distancia(x1, x2, y1, y2));
    }
    public static double Distancia (double x1, double x2, double y1, double y2){
        double d = Math.sqrt((Math.pow((x2 - x1), 2))+(Math.pow((y2 - y1), 2)));
        return d;

    }
}
