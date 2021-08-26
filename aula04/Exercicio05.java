public class Exercicio05 {
    private static int contador = 0;

    public static void main(String[] args) {
        // System.out.println("--> " + contarDigitos(0));
        // System.out.println("--> " + contarDigitos(2));
        System.out.println("--> " + contarDigitos(250));
        System.out.println("--> " + contarDigitos2(250));
        // System.out.println("--> " + contarDigitos(25012));
    }

    public static int contarDigitos(int n) {
        if(n == 0) return 0;

        return 1 + contarDigitos(n / 10);
    }

    public static int contarDigitos2(int n) {
        if(n == 0) return contador;
        contador++;

        return contarDigitos2(n / 10);
    }



}
