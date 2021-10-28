public class Main {
    public static void main(String[] args) {
        final int TAMANHO_VETOR = 15;
        int[] vetor = new int[TAMANHO_VETOR];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = (int) (Math.random() * TAMANHO_VETOR + 1);
            System.out.print(vetor[i] + " ");
        }
        System.out.println();
        
        // Ordena.insertionSort(vetor);
        Ordena.selectionSort(vetor);

        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }

    }
}
