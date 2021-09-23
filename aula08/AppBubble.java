public class AppBubble {
    public static void main(String[] args) {
        final int TAM_VETOR = 100;
        int[] v = new int[TAM_VETOR];
        int[] v2 = new int[TAM_VETOR];
        Bubble bubble = new Bubble(10);

        for (int i = 0; i < v.length; i++) {
            v[i] = (int) (Math.random() * v.length); // aleatório
            // v[i] = i; // crescente
            // v[i] = v.length - i; // decrescente
            v2[i] = v[i];
        }

        bubble.setV(v);
        System.out.println(bubble.show());
        // bubble.bubbleSort();
        bubble.bubbleSortRec();
        System.out.println(bubble.show());
        System.out.println("Comparações: " + bubble.getNumComparacoes());

        // bubble.setV(v2);
        // bubble.bubbleSortOtimizado();
        // System.out.println("Comparações: " + bubble.getNumComparacoes());
    }
}
