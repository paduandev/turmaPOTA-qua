/**
 * Exercicio01
 */
public class Exercicio01 {

    public static void main(String[] args) {
        System.out.println("Soma até 1: " + somaRec(1));
        System.out.println("Soma até 3: " + somaRec(3));
        System.out.println("Soma até 5: " + somaRec(5));
    }

    // Reciocinio:
    // n = 4: somaRec(4) --> 4 + 3 + 2 + 1
    // ? : 4 + somaRec(3) --> 3 + 2 + 1
    // ? : 4 + 3 + somaRec(2) --> 2 + 1
    // ? : 4 + 3 + 2 + somaRec(1) --> caso base, encontra esta resposta e volta calculando as demais

    public static int somaRec(int n) {
        // base ou ponto de parada
        if (n == 1) {
            return 1;
        }
        // passo --> n + soma (n-1)
        int parcial = somaRec(n-1);
        return n + parcial;
    }

}