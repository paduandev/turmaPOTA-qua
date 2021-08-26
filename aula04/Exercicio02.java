public class Exercicio02 {
    public static void main(String[] args) {
        System.out.println(potencia(2,0));
        System.out.println(potencia(2,1));
        System.out.println(potencia(2,2));
        System.out.println(potencia(2,3));
        System.out.println(potencia(2,4));
    }

    public static int potencia(int base, int expoente) {
        if(expoente < 0) return -1; // tratamento de erro
        if (expoente == 0) {
            return 1;
        }
        return base * potencia(base, expoente - 1);
    }

}
