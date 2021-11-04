public class Ordena {

    public static enum TipoOrdenacao {
        CRESCENTE, DECRESCENTE
    }

    private static void troca(int[] v, int indice1, int indice2) {
        int temp = v[indice1];
        v[indice1] = v[indice2];
        v[indice2] = temp;
    }

    private static void quickSortCrescente(int[] v, int lo, int hi) {
        int esq = lo;
        int dir = hi;

        int pivo = v[(esq + dir) / 2];

        while (esq <= dir) { // até que as posições se cruzem
            while (v[esq] < pivo) {
                esq++;
            }
            while (v[dir] > pivo) {
                dir--;
            }
            if (esq <= dir) { // se ainda não teve cruzamento
                troca(v, esq, dir);
                esq++;
                dir--;
            }
        }

        if (dir - lo > 0) { // chamada recursiva para a esqueda
            quickSortCrescente(v, lo, dir);
        }
        if (hi - esq > 0) { // chamada recursiva para a direita
            quickSortCrescente(v, esq, hi);
        }
    }

    private static void quickSortDecrescente(int[] v, int lo, int hi) {
        int esq = lo;
        int dir = hi;

        int pivo = v[(esq + dir) / 2];

        while (esq <= dir) { // até que as posições se cruzem
            while (v[esq] > pivo) {
                esq++;
            }
            while (v[dir] < pivo) {
                dir--;
            }
            if (esq <= dir) { // se ainda não teve cruzamento
                troca(v, esq, dir);
                esq++;
                dir--;
            }
        }

        if (dir - lo > 0) { // chamada recursiva para a esqueda
            quickSortDecrescente(v, lo, dir);
        }
        if (hi - esq > 0) { // chamada recursiva para a direita
            quickSortDecrescente(v, esq, hi);
        }
    }

    public static void quickSort(int[] v, TipoOrdenacao tipo) {
        if (tipo == TipoOrdenacao.CRESCENTE) {
            quickSortCrescente(v, 0, v.length - 1);
        } else {
            quickSortDecrescente(v, 0, v.length - 1);
        }
    }

}
