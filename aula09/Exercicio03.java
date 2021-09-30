public class Exercicio03 {
    static int[] fib;

    public static void main(String[] args) {
        int n = 6;
        fib = new int[n];

        System.out.println(fibRec(n));
    }

    private static int fibRec(int n) {
        if (n < 2)
            return n;

        int n1, n2;

        if (fib[n - 1] != 0) {
            n1 = fib[n - 1];
        } else {
            n1 = fibRec(n - 1);
        }

        if (fib[n - 2] != 0) {
            n2 = fib[n - 2];
        } else {
            n2 = fibRec(n - 2);
        }

        return n1 + n2;
    }

}
