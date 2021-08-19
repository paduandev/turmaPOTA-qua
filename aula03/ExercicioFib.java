public class ExercicioFib {
    public static void main(String[] args) {
        System.out.println(fib(45));
        System.out.println(fibRec(45));
    }

    private static int fib(int n) {
        int fibonacci = 0;
        int fib0 = 0;
        int fib1 = 1;

/*      0, 1, 1, 2, 3, 5
        f0  f1  fa 
            f0  f1  fa
                f0  f1  fa */

        if(n < 2) return n;
        
        for (int i = 1; i < n; i++) {
            fibonacci = fib0 + fib1;
            fib0 = fib1;
            fib1 = fibonacci;
        }

        return fibonacci;
    }


    private static int fibRec(int n) {
        if(n < 2) 
            return n;
        return fibRec(n-1) + fibRec(n-2);
    }
}
