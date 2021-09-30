public class Exercicio02 {
    public static void main(String[] args) {
        System.out.println(decimalToBinario(46));
    }

    static String decimalToBinario(int numero) {
        // base
        if(numero == 0) {
            return "";
        }

        int digito = numero % 2;
        return decimalToBinario(numero / 2) + digito;

    }
}
