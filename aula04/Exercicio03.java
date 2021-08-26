public class Exercicio03 {
    public static void main(String[] args) {
        double[] vetor = { 1, 2, 3, 4, 5.5 };

        System.out.println(somaVet(vetor, vetor.length));
    }

    public static double somaVet(double[] vet, int tamanho) {
        if (tamanho == 0)
            return 0;

        return vet[tamanho - 1] + somaVet(vet, tamanho - 1);
    }
}
