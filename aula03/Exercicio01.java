public class Exercicio01 {

    public static void main(String[] args) {
        System.out.println(produto(5, 6));
        System.out.println(produtoRec(5, 6));
    }

    public static int produto(int a, int b) {
        int total = 0;

        for (int i = 0; i < b; i++) {
            total += a;
        }

        return total;
    }

    public static int produtoRec(int a, int b) {
        // base
        if(b == 1) return a;
        //geral
        return a + produto(a, b-1);
    }
    
}