
public class VetorPesquisa {
    private int[] v;
    private int contCompara;

    public VetorPesquisa(int tam) {
        v = new int[tam];
    }

    public VetorPesquisa(int[] v) {
        if (v == null) {
            v = new int[10];
        }
        this.v = v;
    }

    public int getContCompara() {
        return contCompara;
    }

    public void gerarVetor() {
        for (int i = 0; i < v.length; i++) {
            v[i] = (int) (Math.random() * v.length + 1);
        }
    }

    public void gerarVetorOrdenado() {
        for (int i = 0; i < v.length; i++) {
            v[i] = i * 2;
        }
    }

    public int buscaSeq(int key) {
        contCompara = 0;
        for (int i = 0; i < v.length; i++) {
            contCompara++;
            if (v[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public int buscaSeqRec(int key) {
        return buscaSeqRec(key, v.length);
    }

    private int buscaSeqRec(int key, int tam) {
        // ponto de parada
        if(tam == 0) { // não achou o numero
            return -1;
        }
        if(v[tam-1] == key) { // achei
            return (tam-1);
        }

        // caso geral
        return buscaSeqRec(key, tam-1);
    }


    public int buscaSeqOrdenada(int key) {
        contCompara = 0;
        for (int i = 0; i < v.length && v[i] <= key; i++) {
            contCompara++;
            if (v[i] == key) {
                return i;
            }
        }
        return -1; // não achei
    }

    public String buscaSeqTodos(int key) {
        String saida = "";
        for (int i = 0; i < v.length; i++) {
            if (v[i] == key) {
                saida += i + " ";
            }
        }
        return saida;
    }

    @Override
    public String toString() {
        String saida = "";
        for (int valor : v) {
            saida += valor + " ";
        }
        return saida;
    }

}