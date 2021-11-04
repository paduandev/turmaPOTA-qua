public class Main {
    public static void main(String[] args) {
        final int TAMANHO_VETOR = 15;
        int[] vetor = new int[TAMANHO_VETOR];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = (int) (Math.random() * TAMANHO_VETOR + 1);
            System.out.print(vetor[i] + " ");
        }
        System.out.println();
        
        // Ordena.quickSort(vetor, Ordena.TipoOrdenacao.CRESCENTE);
        Ordena.quickSort(vetor, Ordena.TipoOrdenacao.DECRESCENTE);

        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
    }
}
