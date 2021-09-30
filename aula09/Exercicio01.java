/**
 * Exercicio01
 */
public class Exercicio01 {
    public static void main(String[] args) {
        System.out.println(contaDigito(1234131, 1));
    }

    // numero = 9896 9; // 9 -- 3
    // numero = 989 6 ; // 9 -- 2
    // numero = 98 9 ; // 9 -- 2
    // numero = 9 8 ; // 9 -- 1
    // numero = 9 ; // 9 -- 1
    // numero = 0 ; // 9 -- 0

    static int contaDigito(long numero, int digito) {
        // caso base
        if (numero == 0) {
            return 0;
        }

        int cont = 0;
        int ultimoDigito = (int) numero % 10; // pega o último dígito

        if (ultimoDigito == digito) {
            cont = 1;
        }

        // caso geral
        return cont + contaDigito(numero / 10, digito);
    }

}