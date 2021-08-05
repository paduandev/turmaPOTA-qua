package exercicio01;

import java.util.Scanner;

/**
 * Aristoteles
 */
public class Aristoteles {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numeroLamp;
        boolean[] lampadas;

        System.out.println("Quantas lampadas?");
        numeroLamp = entrada.nextInt();

        // cria o vetor depois que souber quantas lampadas serão usadas
        lampadas = new boolean[numeroLamp];

        // inicializa todas as lampadas apagadas
        for (int i = 0; i < lampadas.length; i++) {
            lampadas[i] = false;
        }

        //simulando as caminhadas
        for (int caminhada = 1; caminhada <= lampadas.length; caminhada++) {
            for (int lampada = 1; lampada <= lampadas.length; lampada++) {
                if(lampada % caminhada == 0) { // verifica se é divisível
                    lampadas[lampada-1] = !lampadas[lampada-1]; // troca o estado da lampada (apagado <-> aceso)
                }
            }
        }

        // exibe os estados das lampadas
        for (int i = 0; i < lampadas.length; i++) {
            System.out.print(lampadas[i] + " ");
        }

        entrada.close();
    }

}