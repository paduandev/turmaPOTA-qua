public class Ordena {

    public static void insertionSort(int[] vetor) {
        for (int i = 1; i < vetor.length; i++) {
            int numeroASerOrdenado = vetor[i];
            int posicaoAtual = i - 1;

            while ((posicaoAtual >= 0) && (vetor[posicaoAtual]) > numeroASerOrdenado) {
                vetor[posicaoAtual + 1] = vetor[posicaoAtual];
                posicaoAtual--;
            }
            vetor[posicaoAtual + 1] = numeroASerOrdenado;
        }
    }

    public static void selectionSort(int[] vetor) {
        for (int i = 0; i < vetor.length - 1; i++) {
            int minimo = i;
            for (int j = i + 1; j < vetor.length; j++) {
                if(vetor[j] < vetor[minimo]) {
                    minimo = j;
                }
            }
            int aux = vetor[i];
            vetor[i] = vetor[minimo];
            vetor[minimo] = aux;
        }
    }
}