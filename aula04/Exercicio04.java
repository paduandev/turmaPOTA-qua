public class Exercicio04 {
    public static void main(String[] args) {
        int[] v = { 1, 2, 3, 4, 5, 6 };

        inverte(v, 0, v.length - 1);

        for (int i = 0; i < v.length; i++) {
            System.out.print(v[i]+ " ");
        }
    }

    public static void inverte(int[] vet, int esq, int dir) {
        // base: se percoirreu tudo, para
        if (esq >= dir)
            return;
        // passo: troca 2 elementos (dir e esq) e chama recursivo
        int temp = vet[esq];
        vet[esq] = vet[dir];
        vet[dir] = temp;
        inverte(vet, esq + 1, dir - 1);
    }
}
