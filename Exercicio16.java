public class Exercicio16 {
    public static void executar(){
        System.out.println("Digite três notas: ");
        double[] nota = new double[3];
        double notaSoma =0;
        for(int i =0; i < 3; i++){
            System.out.printf("Digite a %d° nota: ", i+1);
            nota[i] = Prompt.lerDecimal();
            notaSoma += nota[i];
        }
        System.out.printf("A média das notas %.1f, %.1f e %.1f é: %.1f", nota[0], nota[1], nota[2], (notaSoma/3));
    }
}
