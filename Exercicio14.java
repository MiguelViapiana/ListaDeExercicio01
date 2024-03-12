public class Exercicio14 {
    public static void executar(){
        System.out.println("--- Progressão Aritmetica ---");
        
        int primeroTermo = Prompt.lerInteiro("Digite o primeiro termo: ");
        int n = Prompt.lerInteiro("Digite o n-ésimo termo: ");
        int r = Prompt.lerInteiro("Digite a razão: ");

        int Ntermo = primeroTermo + (n + 1) * r;

        System.out.println("O "+ n + "-ésimo termo da progressão aritmética é: "+ Ntermo);



    }
}
