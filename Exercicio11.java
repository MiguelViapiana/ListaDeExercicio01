public class Exercicio11 {
    public static void executar(){
        double[] num = new double[3];
        for(int i =0; i < 3; i++){
            num[i] = Prompt.lerDecimal("Digite o "+(i+1)+"° número: ");
        }
        double aux;
        boolean troca = true;
        do{
            troca = false;
            for(int i =0; i < (num.length-1); i++){
                if (num[i] > num[i+1]) {
                    aux = num[i];
                    num[i] = num[i+1];
                    num[i+1] = aux;
                    troca = true;
                }
            }
        }while(troca == true);

        for(int i =0;i < 3; i++){
            System.out.print(num[i] + " ");
        }
    }
}
