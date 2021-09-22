public class Bubble {
    private int[] v;

    public Bubble(int tam) {
        v = new int[tam];
        makeRandon();
    }

    public void makeRandon() {
        for (int i = 0; i < v.length; i++) {
            v[i] = (int) (Math.random() * v.length);
        }
    }

    public void bubbleSort() {
        int iteracao, i, aux;

        for (iteracao = 0; iteracao < v.length - 1; iteracao++) {
            for (i = 0; i < v.length - 1 - iteracao; i++)
                if (v[i] > v[i + 1]) {
                    aux = v[i];
                    v[i] = v[i + 1];
                    v[i + 1] = aux;
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