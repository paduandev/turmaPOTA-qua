public class Bubble {
    private int[] v;
    private int numComparacoes;

    public Bubble(int tam) {
        v = new int[tam];
        makeRandon();
    }

    public Bubble(int[] v) {
        this.v = v;
    }

    public void setV(int[] v) {
        this.v = v;
    }

    public void makeRandon() {
        for (int i = 0; i < v.length; i++) {
            v[i] = (int) (Math.random() * v.length);
        }
    }

    public int getNumComparacoes() {
        return numComparacoes;
    }

    private void swap(int i, int j) {
        int aux;
        aux = v[i];
        v[i] = v[j];
        v[j] = aux;
    }

    public void bubbleSort() {
        int iteracao, i;

        numComparacoes = 0;
        for (iteracao = 0; (iteracao < v.length - 1); iteracao++) {
            for (i = 0; i < v.length - 1 - iteracao; i++) {
                numComparacoes++;
                if (v[i] > v[i + 1]) {
                    swap(i, i + 1);
                }
            }
        }
    }

    public void bubbleSortOtimizado() {
        int iteracao, i;
        boolean trocou = true;

        numComparacoes = 0;
        for (iteracao = 0; (iteracao < v.length - 1) && trocou; iteracao++) {
            trocou = false;
            for (i = 0; i < v.length - 1 - iteracao; i++) {
                numComparacoes++;
                if (v[i] > v[i + 1]) {
                    trocou = true;
                    swap(i, i + 1);
                }
            }
            // if(!trocou) break;
        }
    }

    public void bubbleSortRec() {
        numComparacoes = 0;
        bubbleSortRec(v.length - 1);
    }

    private void bubbleSortRec(int end) {

        for (int i = 0; i < end; i++) {
            numComparacoes++;
            if (v[i] > v[i + 1]) {
                swap(i, i + 1);
            }
        }
        if (end > 1) {
            bubbleSortRec(end - 1);
        }

    }

    public void bubbleSortBiDirecional() {
        // o número de interações será dividido pela metade pois a cada passo
        // dois números estarão no lugar (o menor e o maior)

        for (int iteracao = 0; iteracao < (v.length) / 2; iteracao++) {
            // a "iteração" determina a quantidade de valores "descartados" do início e do final
            // este laço vai do início para o final do vetor
            for (int i = iteracao; i < v.length - 1 - iteracao; i++) {
                if (v[i] > v[i + 1]) {
                    swap(i, i + 1);
                }
            }
            // este laço vai do final para o início do vetor
            for (int i = v.length - 1 - iteracao; i > iteracao; i--) {
                if (v[i] < v[i - 1]) {
                    swap(i, i - 1);
                }
            }
        }
    }

    public String show() {
        String out = "";
        for (int i = 0; i < v.length; i++) {
            out += v[i] + " ";
        }
        return out;
    }

}