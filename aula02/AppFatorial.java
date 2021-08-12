public class AppFatorial {
    public static void main(String[] args) {
        System.out.println("5! = " + fatIt(5));
        System.out.println("5! = " + fatRec(5));
    }

    public static int fatIt(int n) {
        int fat = 1;

        for (int i = 1; i <= n; i++) {
            fat *= i;
        }

        return fat;
    }

    public static int fatRec(int n) {
        if (n == 0) {
            return 1;
        }
        return n * fatRec(n-1);
    }
    
}
